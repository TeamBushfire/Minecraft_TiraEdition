package net.mcreator.minecraft_tira_edition.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class XylophytesaplingPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1, 1, 1, 0);
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) == false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 2), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 3), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 4), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 5), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 6), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 7), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 8), (int) z)) == true
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 9), (int) z)) == true
					&& world.getMaxLocalRawBrightness(new BlockPos((int) x, (int) y, (int) z)) >= 7 && Math.random() < 0.3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("minecraft_tira_edition", "xylophyte4"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos((int) (x + -1), (int) y, (int) (z + -5)),
								new BlockPos((int) (x + -1), (int) y, (int) (z + -5)),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}
