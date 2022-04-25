package net.mcreator.minecraft_tira_edition.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.minecraft_tira_edition.init.MinecraftTiraEditionModBlocks;

import java.util.Map;

public class PagophyteblockupdatetickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).isFaceSturdy(world, new BlockPos((int) x, (int) (y + 1), (int) z),
				Direction.DOWN)
				&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z)) == false
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getMaterial() == net.minecraft.world.level.material.Material.LEAVES) == false
				|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getFluidState().isSource()) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = MinecraftTiraEditionModBlocks.TIRADIRT_2.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2.get()
					&& world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(),
						3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2.get()
					&& world.isEmptyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(),
						3);
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2.get()
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(),
						3);
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2.get()
					&& world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(),
						3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) (x + 1), (int) y, (int) z)) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) (x - 1), (int) y, (int) z)) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z + 1))) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == MinecraftTiraEditionModBlocks.TIRADIRT_2
					.get() && world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) (z - 1))) == true && Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
						MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK.get().defaultBlockState(), 3);
			}
		}
	}
}
