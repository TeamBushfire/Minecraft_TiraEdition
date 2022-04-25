
package net.mcreator.minecraft_tira_edition.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
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
import java.util.List;

public class CarnophytaFeature extends RandomPatchFeature {
	public static CarnophytaFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new CarnophytaFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("minecraft_tira_edition:carnophyta", FEATURE,
				FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
						new SimpleBlockConfiguration(BlockStateProvider.simple(MinecraftTiraEditionModBlocks.CARNOPHYTA.get().defaultBlockState())),
						List.of(), 70));
		PLACED_FEATURE = PlacementUtils.register("minecraft_tira_edition:carnophyta", CONFIGURED_FEATURE,
				List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(40)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("minecraft_tira_edition:densealtiphytejungle"),
			new ResourceLocation("minecraft_tira_edition:altiphytetropichills"),
			new ResourceLocation("minecraft_tira_edition:sparsealtyphytetropics"),
			new ResourceLocation("minecraft_tira_edition:tropicalaltiphyteforest"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("minecraft_tira_edition:tira")), Level.OVERWORLD);

	public CarnophytaFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
