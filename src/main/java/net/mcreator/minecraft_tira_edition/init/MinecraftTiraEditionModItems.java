
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft_tira_edition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecraft_tira_edition.item.TiraItem;
import net.mcreator.minecraft_tira_edition.item.RawbaropodmeatItem;
import net.mcreator.minecraft_tira_edition.item.EuleptopodmeatItem;
import net.mcreator.minecraft_tira_edition.item.CookedeuleptopodmeatItem;
import net.mcreator.minecraft_tira_edition.item.CookedbaropodmeatItem;
import net.mcreator.minecraft_tira_edition.MinecraftTiraEditionMod;

public class MinecraftTiraEditionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftTiraEditionMod.MODID);
	public static final RegistryObject<Item> BRACHYPHYTABLOCK = block(MinecraftTiraEditionModBlocks.BRACHYPHYTABLOCK,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TIRANDIRT = block(MinecraftTiraEditionModBlocks.TIRANDIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PAGOPHYTEBLOCK = block(MinecraftTiraEditionModBlocks.PAGOPHYTEBLOCK,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TIRADIRT_2 = block(MinecraftTiraEditionModBlocks.TIRADIRT_2, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> CRYPTOPHYTEBLOCK = block(MinecraftTiraEditionModBlocks.CRYPTOPHYTEBLOCK,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TIRADIRT_3 = block(MinecraftTiraEditionModBlocks.TIRADIRT_3, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTELOG = block(MinecraftTiraEditionModBlocks.XYLOPHYTELOG,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTELOG = block(MinecraftTiraEditionModBlocks.ALTIPHYTELOG,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_LOG = block(MinecraftTiraEditionModBlocks.NODOPHYTE_LOG,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_LOG = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_LOG,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_LOG = block(MinecraftTiraEditionModBlocks.COELOPHYTA_LOG,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTEWOOD = block(MinecraftTiraEditionModBlocks.XYLOPHYTEWOOD,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTEWOOD = block(MinecraftTiraEditionModBlocks.ALTIPHYTEWOOD,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_WOOD = block(MinecraftTiraEditionModBlocks.NODOPHYTE_WOOD,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_WOOD = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_WOOD,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_WOOD = block(MinecraftTiraEditionModBlocks.COELOPHYTA_WOOD,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> DARKSTONE = block(MinecraftTiraEditionModBlocks.DARKSTONE, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COBBLEDDARKSTONE = block(MinecraftTiraEditionModBlocks.COBBLEDDARKSTONE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> POLISHEDDARKSTONE = block(MinecraftTiraEditionModBlocks.POLISHEDDARKSTONE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> DARKSTONEBRICKS = block(MinecraftTiraEditionModBlocks.DARKSTONEBRICKS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> CRACKEDDARKSTONEBRICKS = block(MinecraftTiraEditionModBlocks.CRACKEDDARKSTONEBRICKS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> BRACHYPHYTEINFESTEDDARKSTONEBRICKS = block(
			MinecraftTiraEditionModBlocks.BRACHYPHYTEINFESTEDDARKSTONEBRICKS, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> CHISELEDPOLISHEDDARKSTONE = block(MinecraftTiraEditionModBlocks.CHISELEDPOLISHEDDARKSTONE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> DARKSTONEPILLAR = block(MinecraftTiraEditionModBlocks.DARKSTONEPILLAR,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTEPLANKS = block(MinecraftTiraEditionModBlocks.XYLOPHYTEPLANKS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTEPLANKS = block(MinecraftTiraEditionModBlocks.ALTIPHYTEPLANKS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_PLANKS = block(MinecraftTiraEditionModBlocks.NODOPHYTE_PLANKS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_PLANKS = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_PLANKS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_PLANKS = block(MinecraftTiraEditionModBlocks.COELOPHYTA_PLANKS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTESTAIRS = block(MinecraftTiraEditionModBlocks.XYLOPHYTESTAIRS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTESTAIRS = block(MinecraftTiraEditionModBlocks.ALTIPHYTESTAIRS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_STAIRS = block(MinecraftTiraEditionModBlocks.NODOPHYTE_STAIRS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_STAIRS = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_STAIRS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_STAIRS = block(MinecraftTiraEditionModBlocks.COELOPHYTA_STAIRS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTESLAB = block(MinecraftTiraEditionModBlocks.XYLOPHYTESLAB,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTESLAB = block(MinecraftTiraEditionModBlocks.ALTIPHYTESLAB,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_SLAB = block(MinecraftTiraEditionModBlocks.NODOPHYTE_SLAB,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_SLAB = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_SLAB,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_SLAB = block(MinecraftTiraEditionModBlocks.COELOPHYTA_SLAB,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> BRACHYPHYTA = block(MinecraftTiraEditionModBlocks.BRACHYPHYTA, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TALLBRACHYPHYTA = block(MinecraftTiraEditionModBlocks.TALLBRACHYPHYTA,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> PAGOPHYTESPROUTE = block(MinecraftTiraEditionModBlocks.PAGOPHYTESPROUTE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> PAGOPHYTE = block(MinecraftTiraEditionModBlocks.PAGOPHYTE, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TALLPAGOPHYTE = doubleBlock(MinecraftTiraEditionModBlocks.TALLPAGOPHYTE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> CRYPTOPHYTESPROUTE = block(MinecraftTiraEditionModBlocks.CRYPTOPHYTESPROUTE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> CRYPTOPHYTE = block(MinecraftTiraEditionModBlocks.CRYPTOPHYTE, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TALLCRYPTOPHYTE = doubleBlock(MinecraftTiraEditionModBlocks.TALLCRYPTOPHYTE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> SMALLEUCAULOPHYTACAEA = block(MinecraftTiraEditionModBlocks.SMALLEUCAULOPHYTACAEA,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> BUSHLIKEEUCAULOPHYTACAEA = block(MinecraftTiraEditionModBlocks.BUSHLIKEEUCAULOPHYTACAEA,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTESAPLING = block(MinecraftTiraEditionModBlocks.XYLOPHYTESAPLING,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> CARNOPHYTA = block(MinecraftTiraEditionModBlocks.CARNOPHYTA, MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ARCHEANTHOSTOMA = block(MinecraftTiraEditionModBlocks.ARCHEANTHOSTOMA,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> EUCALOPHYTACAEA = block(MinecraftTiraEditionModBlocks.EUCALOPHYTACAEA,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTELEAVES = block(MinecraftTiraEditionModBlocks.XYLOPHYTELEAVES,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_LEAVES = block(MinecraftTiraEditionModBlocks.NODOPHYTE_LEAVES,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_LEAVES = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_LEAVES,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_LEAVES = block(MinecraftTiraEditionModBlocks.COELOPHYTA_LEAVES,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_ROOTS = block(MinecraftTiraEditionModBlocks.COELOPHYTA_ROOTS,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTELEAF = block(MinecraftTiraEditionModBlocks.ALTIPHYTELEAF,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTEFENCE = block(MinecraftTiraEditionModBlocks.XYLOPHYTEFENCE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTEFENCE = block(MinecraftTiraEditionModBlocks.ALTIPHYTEFENCE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_FENCE = block(MinecraftTiraEditionModBlocks.NODOPHYTE_FENCE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_FENCE = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_FENCE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_FENCE = block(MinecraftTiraEditionModBlocks.COELOPHYTA_FENCE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_BUTTON = block(MinecraftTiraEditionModBlocks.NODOPHYTE_BUTTON,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTEBUTTON = block(MinecraftTiraEditionModBlocks.XYLOPHYTEBUTTON,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTEBUTTON = block(MinecraftTiraEditionModBlocks.ALTIPHYTEBUTTON,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_BUTTON = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_BUTTON,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_BUTTON = block(MinecraftTiraEditionModBlocks.COELOPHYTA_BUTTON,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTEDOOR = doubleBlock(MinecraftTiraEditionModBlocks.XYLOPHYTEDOOR,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTEDOOR = doubleBlock(MinecraftTiraEditionModBlocks.ALTIPHYTEDOOR,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTEDOOR = doubleBlock(MinecraftTiraEditionModBlocks.NODOPHYTEDOOR,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTETRAPDOOR = block(MinecraftTiraEditionModBlocks.XYLOPHYTETRAPDOOR,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTETRAPDOOR = block(MinecraftTiraEditionModBlocks.ALTIPHYTETRAPDOOR,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTETRAPDOOR = block(MinecraftTiraEditionModBlocks.NODOPHYTETRAPDOOR,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTEGATE = block(MinecraftTiraEditionModBlocks.XYLOPHYTEGATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTEGATE = block(MinecraftTiraEditionModBlocks.ALTIPHYTEGATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_FENCE_GATE = block(MinecraftTiraEditionModBlocks.NODOPHYTE_FENCE_GATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_FENCE_GATE = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_FENCE_GATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_FENCE_GATE = block(MinecraftTiraEditionModBlocks.COELOPHYTA_FENCE_GATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> NODOPHYTE_PRESSURE_PLATE = block(MinecraftTiraEditionModBlocks.NODOPHYTE_PRESSURE_PLATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> XYLOPHYTEPRESSUREPLATE = block(MinecraftTiraEditionModBlocks.XYLOPHYTEPRESSUREPLATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALTIPHYTEPRESSUREPLATE = block(MinecraftTiraEditionModBlocks.ALTIPHYTEPRESSUREPLATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> TUNDRA_NODOPHYTE_PRESSURE_PLATE = block(MinecraftTiraEditionModBlocks.TUNDRA_NODOPHYTE_PRESSURE_PLATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> COELOPHYTA_PRESSURE_PLATE = block(MinecraftTiraEditionModBlocks.COELOPHYTA_PRESSURE_PLATE,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> OSTEOPOD = REGISTRY.register("osteopod_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.OSTEOPOD, -4872262, -6981243,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EULEPTOPOD = REGISTRY.register("euleptopod_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.EULEPTOPOD, -1735051, -994130,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BAROPOD = REGISTRY.register("baropod_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.BAROPOD, -10001614, -5151919,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PIPIODONTIA = REGISTRY.register("pipiodontia_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.PIPIODONTIA, -13357522, -4285067,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NOTOFORM = REGISTRY.register("notoform_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.NOTOFORM, -9807020, -11189699,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PLACOSTRACA = REGISTRY.register("placostraca_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.PLACOSTRACA, -14603494, -6714507,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EUDEMOSTRACA = REGISTRY.register("eudemostraca_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.EUDEMOSTRACA, -8555150, -9339531,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> XEROSTRACA = REGISTRY.register("xerostraca_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.XEROSTRACA, -7436165, -11898775,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> THYREOSTRACAN = REGISTRY.register("thyreostracan_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.THYREOSTRACAN, -6907254, -10723496,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TIRA = REGISTRY.register("tira", () -> new TiraItem());
	public static final RegistryObject<Item> RAWBAROPODMEAT = REGISTRY.register("rawbaropodmeat", () -> new RawbaropodmeatItem());
	public static final RegistryObject<Item> COOKEDBAROPODMEAT = REGISTRY.register("cookedbaropodmeat", () -> new CookedbaropodmeatItem());
	public static final RegistryObject<Item> TYLOPHYTA = doubleBlock(MinecraftTiraEditionModBlocks.TYLOPHYTA,
			MinecraftTiraEditionModTabs.TAB_TIRA_TAB);
	public static final RegistryObject<Item> ALLOBRACHID = REGISTRY.register("allobrachid_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.ALLOBRACHID, -15592942, -14729932,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EULEPTOPODMEAT = REGISTRY.register("euleptopodmeat", () -> new EuleptopodmeatItem());
	public static final RegistryObject<Item> COOKEDEULEPTOPODMEAT = REGISTRY.register("cookedeuleptopodmeat", () -> new CookedeuleptopodmeatItem());
	public static final RegistryObject<Item> POLISHIA = REGISTRY.register("polishia_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.POLISHIA, -7043214, -66327,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DROMEOPODA = REGISTRY.register("dromeopoda_spawn_egg",
			() -> new ForgeSpawnEggItem(MinecraftTiraEditionModEntities.DROMEOPODA, -8383457, -15659759,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
