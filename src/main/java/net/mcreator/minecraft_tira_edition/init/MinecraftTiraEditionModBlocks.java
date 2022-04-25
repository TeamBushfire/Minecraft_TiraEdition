
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft_tira_edition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraft_tira_edition.block.XylophytewoodBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytetrapdoorBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytestairsBlock;
import net.mcreator.minecraft_tira_edition.block.XylophyteslabBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytesaplingBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytepressureplateBlock;
import net.mcreator.minecraft_tira_edition.block.XylophyteplanksBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytelogBlock;
import net.mcreator.minecraft_tira_edition.block.XylophyteleavesBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytegateBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytefenceBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytedoorBlock;
import net.mcreator.minecraft_tira_edition.block.XylophytebuttonBlock;
import net.mcreator.minecraft_tira_edition.block.TylophytaBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteWoodBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteStairsBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteSlabBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophytePressurePlateBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophytePlanksBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteLogBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteLeavesBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteFenceGateBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteFenceBlock;
import net.mcreator.minecraft_tira_edition.block.TundraNodophyteButtonBlock;
import net.mcreator.minecraft_tira_edition.block.TirandirtBlock;
import net.mcreator.minecraft_tira_edition.block.Tiradirt3Block;
import net.mcreator.minecraft_tira_edition.block.Tiradirt2Block;
import net.mcreator.minecraft_tira_edition.block.TiraPortalBlock;
import net.mcreator.minecraft_tira_edition.block.TallpagophyteBlock;
import net.mcreator.minecraft_tira_edition.block.TallcryptophyteBlock;
import net.mcreator.minecraft_tira_edition.block.TallbrachyphytaBlock;
import net.mcreator.minecraft_tira_edition.block.SmalleucaulophytacaeaBlock;
import net.mcreator.minecraft_tira_edition.block.PolisheddarkstoneBlock;
import net.mcreator.minecraft_tira_edition.block.PagophytesprouteBlock;
import net.mcreator.minecraft_tira_edition.block.PagophyteblockBlock;
import net.mcreator.minecraft_tira_edition.block.PagophyteBlock;
import net.mcreator.minecraft_tira_edition.block.NodophytetrapdoorBlock;
import net.mcreator.minecraft_tira_edition.block.NodophytedoorBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteWoodBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteStairsBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteSlabBlock;
import net.mcreator.minecraft_tira_edition.block.NodophytePressurePlateBlock;
import net.mcreator.minecraft_tira_edition.block.NodophytePlanksBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteLogBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteLeavesBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteFenceGateBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteFenceBlock;
import net.mcreator.minecraft_tira_edition.block.NodophyteButtonBlock;
import net.mcreator.minecraft_tira_edition.block.EucalophytacaeaBlock;
import net.mcreator.minecraft_tira_edition.block.DarkstonepillarBlock;
import net.mcreator.minecraft_tira_edition.block.DarkstonebricksBlock;
import net.mcreator.minecraft_tira_edition.block.DarkstoneBlock;
import net.mcreator.minecraft_tira_edition.block.CryptophytesprouteBlock;
import net.mcreator.minecraft_tira_edition.block.CryptophyteblockBlock;
import net.mcreator.minecraft_tira_edition.block.CryptophyteBlock;
import net.mcreator.minecraft_tira_edition.block.CrackeddarkstonebricksBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaWoodBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaStairsBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaSlabBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaRootsBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaPressurePlateBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaPlanksBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaLogBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaLeavesBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaFenceGateBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaFenceBlock;
import net.mcreator.minecraft_tira_edition.block.CoelophytaButtonBlock;
import net.mcreator.minecraft_tira_edition.block.CobbleddarkstoneBlock;
import net.mcreator.minecraft_tira_edition.block.ChiseledpolisheddarkstoneBlock;
import net.mcreator.minecraft_tira_edition.block.CarnophytaBlock;
import net.mcreator.minecraft_tira_edition.block.BushlikeeucaulophytacaeaBlock;
import net.mcreator.minecraft_tira_edition.block.BrachyphyteinfesteddarkstonebricksBlock;
import net.mcreator.minecraft_tira_edition.block.BrachyphytablockBlock;
import net.mcreator.minecraft_tira_edition.block.BrachyphytaBlock;
import net.mcreator.minecraft_tira_edition.block.ArcheanthostomaBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytewoodBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytetrapdoorBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytestairsBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphyteslabBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytepressureplateBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphyteplanksBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytelogBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphyteleafBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytegateBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytefenceBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytedoorBlock;
import net.mcreator.minecraft_tira_edition.block.AltiphytebuttonBlock;
import net.mcreator.minecraft_tira_edition.MinecraftTiraEditionMod;

public class MinecraftTiraEditionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftTiraEditionMod.MODID);
	public static final RegistryObject<Block> BRACHYPHYTABLOCK = REGISTRY.register("brachyphytablock", () -> new BrachyphytablockBlock());
	public static final RegistryObject<Block> TIRANDIRT = REGISTRY.register("tirandirt", () -> new TirandirtBlock());
	public static final RegistryObject<Block> PAGOPHYTEBLOCK = REGISTRY.register("pagophyteblock", () -> new PagophyteblockBlock());
	public static final RegistryObject<Block> TIRADIRT_2 = REGISTRY.register("tiradirt_2", () -> new Tiradirt2Block());
	public static final RegistryObject<Block> CRYPTOPHYTEBLOCK = REGISTRY.register("cryptophyteblock", () -> new CryptophyteblockBlock());
	public static final RegistryObject<Block> TIRADIRT_3 = REGISTRY.register("tiradirt_3", () -> new Tiradirt3Block());
	public static final RegistryObject<Block> XYLOPHYTELOG = REGISTRY.register("xylophytelog", () -> new XylophytelogBlock());
	public static final RegistryObject<Block> ALTIPHYTELOG = REGISTRY.register("altiphytelog", () -> new AltiphytelogBlock());
	public static final RegistryObject<Block> NODOPHYTE_LOG = REGISTRY.register("nodophyte_log", () -> new NodophyteLogBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_LOG = REGISTRY.register("tundra_nodophyte_log", () -> new TundraNodophyteLogBlock());
	public static final RegistryObject<Block> COELOPHYTA_LOG = REGISTRY.register("coelophyta_log", () -> new CoelophytaLogBlock());
	public static final RegistryObject<Block> XYLOPHYTEWOOD = REGISTRY.register("xylophytewood", () -> new XylophytewoodBlock());
	public static final RegistryObject<Block> ALTIPHYTEWOOD = REGISTRY.register("altiphytewood", () -> new AltiphytewoodBlock());
	public static final RegistryObject<Block> NODOPHYTE_WOOD = REGISTRY.register("nodophyte_wood", () -> new NodophyteWoodBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_WOOD = REGISTRY.register("tundra_nodophyte_wood",
			() -> new TundraNodophyteWoodBlock());
	public static final RegistryObject<Block> COELOPHYTA_WOOD = REGISTRY.register("coelophyta_wood", () -> new CoelophytaWoodBlock());
	public static final RegistryObject<Block> DARKSTONE = REGISTRY.register("darkstone", () -> new DarkstoneBlock());
	public static final RegistryObject<Block> COBBLEDDARKSTONE = REGISTRY.register("cobbleddarkstone", () -> new CobbleddarkstoneBlock());
	public static final RegistryObject<Block> POLISHEDDARKSTONE = REGISTRY.register("polisheddarkstone", () -> new PolisheddarkstoneBlock());
	public static final RegistryObject<Block> DARKSTONEBRICKS = REGISTRY.register("darkstonebricks", () -> new DarkstonebricksBlock());
	public static final RegistryObject<Block> CRACKEDDARKSTONEBRICKS = REGISTRY.register("crackeddarkstonebricks",
			() -> new CrackeddarkstonebricksBlock());
	public static final RegistryObject<Block> BRACHYPHYTEINFESTEDDARKSTONEBRICKS = REGISTRY.register("brachyphyteinfesteddarkstonebricks",
			() -> new BrachyphyteinfesteddarkstonebricksBlock());
	public static final RegistryObject<Block> CHISELEDPOLISHEDDARKSTONE = REGISTRY.register("chiseledpolisheddarkstone",
			() -> new ChiseledpolisheddarkstoneBlock());
	public static final RegistryObject<Block> DARKSTONEPILLAR = REGISTRY.register("darkstonepillar", () -> new DarkstonepillarBlock());
	public static final RegistryObject<Block> XYLOPHYTEPLANKS = REGISTRY.register("xylophyteplanks", () -> new XylophyteplanksBlock());
	public static final RegistryObject<Block> ALTIPHYTEPLANKS = REGISTRY.register("altiphyteplanks", () -> new AltiphyteplanksBlock());
	public static final RegistryObject<Block> NODOPHYTE_PLANKS = REGISTRY.register("nodophyte_planks", () -> new NodophytePlanksBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_PLANKS = REGISTRY.register("tundra_nodophyte_planks",
			() -> new TundraNodophytePlanksBlock());
	public static final RegistryObject<Block> COELOPHYTA_PLANKS = REGISTRY.register("coelophyta_planks", () -> new CoelophytaPlanksBlock());
	public static final RegistryObject<Block> XYLOPHYTESTAIRS = REGISTRY.register("xylophytestairs", () -> new XylophytestairsBlock());
	public static final RegistryObject<Block> ALTIPHYTESTAIRS = REGISTRY.register("altiphytestairs", () -> new AltiphytestairsBlock());
	public static final RegistryObject<Block> NODOPHYTE_STAIRS = REGISTRY.register("nodophyte_stairs", () -> new NodophyteStairsBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_STAIRS = REGISTRY.register("tundra_nodophyte_stairs",
			() -> new TundraNodophyteStairsBlock());
	public static final RegistryObject<Block> COELOPHYTA_STAIRS = REGISTRY.register("coelophyta_stairs", () -> new CoelophytaStairsBlock());
	public static final RegistryObject<Block> XYLOPHYTESLAB = REGISTRY.register("xylophyteslab", () -> new XylophyteslabBlock());
	public static final RegistryObject<Block> ALTIPHYTESLAB = REGISTRY.register("altiphyteslab", () -> new AltiphyteslabBlock());
	public static final RegistryObject<Block> NODOPHYTE_SLAB = REGISTRY.register("nodophyte_slab", () -> new NodophyteSlabBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_SLAB = REGISTRY.register("tundra_nodophyte_slab",
			() -> new TundraNodophyteSlabBlock());
	public static final RegistryObject<Block> COELOPHYTA_SLAB = REGISTRY.register("coelophyta_slab", () -> new CoelophytaSlabBlock());
	public static final RegistryObject<Block> BRACHYPHYTA = REGISTRY.register("brachyphyta", () -> new BrachyphytaBlock());
	public static final RegistryObject<Block> TALLBRACHYPHYTA = REGISTRY.register("tallbrachyphyta", () -> new TallbrachyphytaBlock());
	public static final RegistryObject<Block> PAGOPHYTESPROUTE = REGISTRY.register("pagophytesproute", () -> new PagophytesprouteBlock());
	public static final RegistryObject<Block> PAGOPHYTE = REGISTRY.register("pagophyte", () -> new PagophyteBlock());
	public static final RegistryObject<Block> TALLPAGOPHYTE = REGISTRY.register("tallpagophyte", () -> new TallpagophyteBlock());
	public static final RegistryObject<Block> CRYPTOPHYTESPROUTE = REGISTRY.register("cryptophytesproute", () -> new CryptophytesprouteBlock());
	public static final RegistryObject<Block> CRYPTOPHYTE = REGISTRY.register("cryptophyte", () -> new CryptophyteBlock());
	public static final RegistryObject<Block> TALLCRYPTOPHYTE = REGISTRY.register("tallcryptophyte", () -> new TallcryptophyteBlock());
	public static final RegistryObject<Block> SMALLEUCAULOPHYTACAEA = REGISTRY.register("smalleucaulophytacaea",
			() -> new SmalleucaulophytacaeaBlock());
	public static final RegistryObject<Block> BUSHLIKEEUCAULOPHYTACAEA = REGISTRY.register("bushlikeeucaulophytacaea",
			() -> new BushlikeeucaulophytacaeaBlock());
	public static final RegistryObject<Block> XYLOPHYTESAPLING = REGISTRY.register("xylophytesapling", () -> new XylophytesaplingBlock());
	public static final RegistryObject<Block> CARNOPHYTA = REGISTRY.register("carnophyta", () -> new CarnophytaBlock());
	public static final RegistryObject<Block> ARCHEANTHOSTOMA = REGISTRY.register("archeanthostoma", () -> new ArcheanthostomaBlock());
	public static final RegistryObject<Block> EUCALOPHYTACAEA = REGISTRY.register("eucalophytacaea", () -> new EucalophytacaeaBlock());
	public static final RegistryObject<Block> XYLOPHYTELEAVES = REGISTRY.register("xylophyteleaves", () -> new XylophyteleavesBlock());
	public static final RegistryObject<Block> NODOPHYTE_LEAVES = REGISTRY.register("nodophyte_leaves", () -> new NodophyteLeavesBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_LEAVES = REGISTRY.register("tundra_nodophyte_leaves",
			() -> new TundraNodophyteLeavesBlock());
	public static final RegistryObject<Block> COELOPHYTA_LEAVES = REGISTRY.register("coelophyta_leaves", () -> new CoelophytaLeavesBlock());
	public static final RegistryObject<Block> COELOPHYTA_ROOTS = REGISTRY.register("coelophyta_roots", () -> new CoelophytaRootsBlock());
	public static final RegistryObject<Block> ALTIPHYTELEAF = REGISTRY.register("altiphyteleaf", () -> new AltiphyteleafBlock());
	public static final RegistryObject<Block> XYLOPHYTEFENCE = REGISTRY.register("xylophytefence", () -> new XylophytefenceBlock());
	public static final RegistryObject<Block> ALTIPHYTEFENCE = REGISTRY.register("altiphytefence", () -> new AltiphytefenceBlock());
	public static final RegistryObject<Block> NODOPHYTE_FENCE = REGISTRY.register("nodophyte_fence", () -> new NodophyteFenceBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_FENCE = REGISTRY.register("tundra_nodophyte_fence",
			() -> new TundraNodophyteFenceBlock());
	public static final RegistryObject<Block> COELOPHYTA_FENCE = REGISTRY.register("coelophyta_fence", () -> new CoelophytaFenceBlock());
	public static final RegistryObject<Block> NODOPHYTE_BUTTON = REGISTRY.register("nodophyte_button", () -> new NodophyteButtonBlock());
	public static final RegistryObject<Block> XYLOPHYTEBUTTON = REGISTRY.register("xylophytebutton", () -> new XylophytebuttonBlock());
	public static final RegistryObject<Block> ALTIPHYTEBUTTON = REGISTRY.register("altiphytebutton", () -> new AltiphytebuttonBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_BUTTON = REGISTRY.register("tundra_nodophyte_button",
			() -> new TundraNodophyteButtonBlock());
	public static final RegistryObject<Block> COELOPHYTA_BUTTON = REGISTRY.register("coelophyta_button", () -> new CoelophytaButtonBlock());
	public static final RegistryObject<Block> XYLOPHYTEDOOR = REGISTRY.register("xylophytedoor", () -> new XylophytedoorBlock());
	public static final RegistryObject<Block> ALTIPHYTEDOOR = REGISTRY.register("altiphytedoor", () -> new AltiphytedoorBlock());
	public static final RegistryObject<Block> NODOPHYTEDOOR = REGISTRY.register("nodophytedoor", () -> new NodophytedoorBlock());
	public static final RegistryObject<Block> XYLOPHYTETRAPDOOR = REGISTRY.register("xylophytetrapdoor", () -> new XylophytetrapdoorBlock());
	public static final RegistryObject<Block> ALTIPHYTETRAPDOOR = REGISTRY.register("altiphytetrapdoor", () -> new AltiphytetrapdoorBlock());
	public static final RegistryObject<Block> NODOPHYTETRAPDOOR = REGISTRY.register("nodophytetrapdoor", () -> new NodophytetrapdoorBlock());
	public static final RegistryObject<Block> XYLOPHYTEGATE = REGISTRY.register("xylophytegate", () -> new XylophytegateBlock());
	public static final RegistryObject<Block> ALTIPHYTEGATE = REGISTRY.register("altiphytegate", () -> new AltiphytegateBlock());
	public static final RegistryObject<Block> NODOPHYTE_FENCE_GATE = REGISTRY.register("nodophyte_fence_gate", () -> new NodophyteFenceGateBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_FENCE_GATE = REGISTRY.register("tundra_nodophyte_fence_gate",
			() -> new TundraNodophyteFenceGateBlock());
	public static final RegistryObject<Block> COELOPHYTA_FENCE_GATE = REGISTRY.register("coelophyta_fence_gate",
			() -> new CoelophytaFenceGateBlock());
	public static final RegistryObject<Block> NODOPHYTE_PRESSURE_PLATE = REGISTRY.register("nodophyte_pressure_plate",
			() -> new NodophytePressurePlateBlock());
	public static final RegistryObject<Block> XYLOPHYTEPRESSUREPLATE = REGISTRY.register("xylophytepressureplate",
			() -> new XylophytepressureplateBlock());
	public static final RegistryObject<Block> ALTIPHYTEPRESSUREPLATE = REGISTRY.register("altiphytepressureplate",
			() -> new AltiphytepressureplateBlock());
	public static final RegistryObject<Block> TUNDRA_NODOPHYTE_PRESSURE_PLATE = REGISTRY.register("tundra_nodophyte_pressure_plate",
			() -> new TundraNodophytePressurePlateBlock());
	public static final RegistryObject<Block> COELOPHYTA_PRESSURE_PLATE = REGISTRY.register("coelophyta_pressure_plate",
			() -> new CoelophytaPressurePlateBlock());
	public static final RegistryObject<Block> TIRA_PORTAL = REGISTRY.register("tira_portal", () -> new TiraPortalBlock());
	public static final RegistryObject<Block> TYLOPHYTA = REGISTRY.register("tylophyta", () -> new TylophytaBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BrachyphytablockBlock.registerRenderLayer();
			TirandirtBlock.registerRenderLayer();
			PagophyteblockBlock.registerRenderLayer();
			Tiradirt2Block.registerRenderLayer();
			CryptophyteblockBlock.registerRenderLayer();
			Tiradirt3Block.registerRenderLayer();
			BrachyphytaBlock.registerRenderLayer();
			TallbrachyphytaBlock.registerRenderLayer();
			PagophytesprouteBlock.registerRenderLayer();
			PagophyteBlock.registerRenderLayer();
			TallpagophyteBlock.registerRenderLayer();
			CryptophytesprouteBlock.registerRenderLayer();
			CryptophyteBlock.registerRenderLayer();
			TallcryptophyteBlock.registerRenderLayer();
			SmalleucaulophytacaeaBlock.registerRenderLayer();
			BushlikeeucaulophytacaeaBlock.registerRenderLayer();
			XylophytesaplingBlock.registerRenderLayer();
			CarnophytaBlock.registerRenderLayer();
			ArcheanthostomaBlock.registerRenderLayer();
			EucalophytacaeaBlock.registerRenderLayer();
			XylophyteleavesBlock.registerRenderLayer();
			CoelophytaLeavesBlock.registerRenderLayer();
			CoelophytaRootsBlock.registerRenderLayer();
			AltiphyteleafBlock.registerRenderLayer();
			XylophytedoorBlock.registerRenderLayer();
			AltiphytedoorBlock.registerRenderLayer();
			NodophytedoorBlock.registerRenderLayer();
			XylophytetrapdoorBlock.registerRenderLayer();
			AltiphytetrapdoorBlock.registerRenderLayer();
			NodophytetrapdoorBlock.registerRenderLayer();
			TylophytaBlock.registerRenderLayer();
		}
	}
}
