
package net.mcreator.minecraft_tira_edition.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.DungeonHooks;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.minecraft_tira_edition.init.MinecraftTiraEditionModEntities;
import net.mcreator.minecraft_tira_edition.init.MinecraftTiraEditionModBlocks;

import java.util.Set;
import java.util.List;

@Mod.EventBusSubscriber
public class XerostracaEntity extends Animal {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("minecraft_tira_edition:tirasteppe"),
			new ResourceLocation("minecraft_tira_edition:seasonalsteppe"), new ResourceLocation("minecraft_tira_edition:dryseasonalsteppe"),
			new ResourceLocation("minecraft_tira_edition:xylophyteforesthills"), new ResourceLocation("minecraft_tira_edition:seasonaldesert"),
			new ResourceLocation("minecraft_tira_edition:opentirasteppe"), new ResourceLocation("minecraft_tira_edition:highxylophyteforest"),
			new ResourceLocation("minecraft_tira_edition:dryerseasonalsteppe"), new ResourceLocation("minecraft_tira_edition:xylophyteforest"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.CREATURE)
					.add(new MobSpawnSettings.SpawnerData(MinecraftTiraEditionModEntities.XEROSTRACA.get(), 11, 1, 3));
	}

	public XerostracaEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(MinecraftTiraEditionModEntities.XEROSTRACA.get(), world);
	}

	public XerostracaEntity(EntityType<XerostracaEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, BaropodEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.of(MinecraftTiraEditionModBlocks.TALLBRACHYPHYTA.get().asItem()), true));
		this.goalSelector.addGoal(4, new TemptGoal(this, 1, Ingredient.of(MinecraftTiraEditionModBlocks.BRACHYPHYTA.get().asItem()), true));
		this.goalSelector.addGoal(5, new PanicGoal(this, 1.3));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		XerostracaEntity retval = MinecraftTiraEditionModEntities.XEROSTRACA.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of(MinecraftTiraEditionModBlocks.BRACHYPHYTA.get().asItem(), MinecraftTiraEditionModBlocks.TALLBRACHYPHYTA.get().asItem())
				.contains(stack.getItem());
	}

	public static void init() {
		SpawnPlacements.register(MinecraftTiraEditionModEntities.XEROSTRACA.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos,
						random) -> (world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8));
		DungeonHooks.addDungeonMob(MinecraftTiraEditionModEntities.XEROSTRACA.get(), 180);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 6);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);
		return builder;
	}
}
