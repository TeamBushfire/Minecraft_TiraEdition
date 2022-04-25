
package net.mcreator.minecraft_tira_edition.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.minecraft_tira_edition.init.MinecraftTiraEditionModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class BrachyphytablockFeature extends OreFeature {
	public static BrachyphytablockFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new BrachyphytablockFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("minecraft_tira_edition:brachyphytablock", FEATURE, new OreConfiguration(
				BrachyphytablockFeatureRuleTest.INSTANCE, MinecraftTiraEditionModBlocks.BRACHYPHYTABLOCK.get().defaultBlockState(), 64));
		PLACED_FEATURE = PlacementUtils.register("minecraft_tira_edition:brachyphytablock", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(64), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("minecraft_tira_edition:smoothshallowocean"),
			new ResourceLocation("minecraft_tira_edition:tirasteppe"), new ResourceLocation("minecraft_tira_edition:densealtiphytejungle"),
			new ResourceLocation("minecraft_tira_edition:xylophyteforesthills"), new ResourceLocation("minecraft_tira_edition:altiphytetropichills"),
			new ResourceLocation("minecraft_tira_edition:highxylophyteforest"), new ResourceLocation("minecraft_tira_edition:smoothocean"),
			new ResourceLocation("minecraft_tira_edition:opentirasteppe"), new ResourceLocation("minecraft_tira_edition:jaggedocean"),
			new ResourceLocation("minecraft_tira_edition:tiraswamp"), new ResourceLocation("minecraft_tira_edition:ocean"),
			new ResourceLocation("minecraft_tira_edition:jaggedshallowocean"), new ResourceLocation("minecraft_tira_edition:sparsealtyphytetropics"),
			new ResourceLocation("minecraft_tira_edition:tropicalaltiphyteforest"), new ResourceLocation("minecraft_tira_edition:shallowocean"),
			new ResourceLocation("minecraft_tira_edition:xylophyteforest"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD,
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minecraft_tira_edition:tira")));

	public BrachyphytablockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class BrachyphytablockFeatureRuleTest extends RuleTest {
		static final BrachyphytablockFeatureRuleTest INSTANCE = new BrachyphytablockFeatureRuleTest();
		private static final com.mojang.serialization.Codec<BrachyphytablockFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<BrachyphytablockFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("minecraft_tira_edition:brachyphytablock_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.GRASS_BLOCK);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
