
package net.mcreator.minecraft_tira_edition.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.EatBlockGoal;
import net.minecraft.world.entity.ai.goal.BreedGoal;
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
public class AllobrachidEntity extends Animal {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("minecraft_tira_edition:snowytira"),
			new ResourceLocation("minecraft_tira_edition:snowynodophytetaiga"), new ResourceLocation("minecraft_tira_edition:snowynodophyteplains"),
			new ResourceLocation("minecraft_tira_edition:snowytirahills"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.CREATURE)
					.add(new MobSpawnSettings.SpawnerData(MinecraftTiraEditionModEntities.ALLOBRACHID.get(), 10, 1, 6));
	}

	public AllobrachidEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(MinecraftTiraEditionModEntities.ALLOBRACHID.get(), world);
	}

	public AllobrachidEntity(EntityType<AllobrachidEntity> type, Level world) {
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
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new FloatGoal(this));
		this.goalSelector.addGoal(4, new PanicGoal(this, 1.3));
		this.goalSelector.addGoal(5, new AvoidEntityGoal<>(this, Player.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(6, new FollowParentGoal(this, 1.2));
		this.goalSelector.addGoal(7, new BreedGoal(this, 1.2));
		this.goalSelector.addGoal(8, new EatBlockGoal(this));
		this.goalSelector.addGoal(9, new TemptGoal(this, 1.1, Ingredient.of(MinecraftTiraEditionModBlocks.PAGOPHYTE.get().asItem()), false));
		this.goalSelector.addGoal(10, new FollowMobGoal(this, (float) 1.1, 20, 3));
	}

	@Override
	public MobType getMobType() {
		return MobType.ARTHROPOD;
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
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		AllobrachidEntity retval = MinecraftTiraEditionModEntities.ALLOBRACHID.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of(MinecraftTiraEditionModBlocks.PAGOPHYTE.get().asItem()).contains(stack.getItem());
	}

	public static void init() {
		SpawnPlacements.register(MinecraftTiraEditionModEntities.ALLOBRACHID.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos,
						random) -> (world.getBlockState(pos.below()).getMaterial() == Material.SNOW && world.getRawBrightness(pos, 0) > 8));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 12);
		builder = builder.add(Attributes.ARMOR, 0.2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2);
		return builder;
	}
}
