
package net.mcreator.minecraft_tira_edition.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import net.mcreator.minecraft_tira_edition.world.features.treedecorators.TropicalaltiphyteforestTrunkDecorator;
import net.mcreator.minecraft_tira_edition.world.features.treedecorators.TropicalaltiphyteforestLeaveDecorator;
import net.mcreator.minecraft_tira_edition.init.MinecraftTiraEditionModBlocks;
import net.mcreator.minecraft_tira_edition.init.MinecraftTiraEditionModBiomes;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class TropicalaltiphyteforestBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285)
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.CRIMSON_SPORE, 0.005f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("minecraft_tira_edition:tree_tropicalaltiphyteforest",
						FeatureUtils.register("minecraft_tira_edition:tree_tropicalaltiphyteforest", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(
										BlockStateProvider.simple(MinecraftTiraEditionModBlocks.ALTIPHYTELOG.get().defaultBlockState()),
										new MegaJungleTrunkPlacer(30, 2, 19),
										BlockStateProvider.simple(MinecraftTiraEditionModBlocks.ALTIPHYTELEAF.get().defaultBlockState()),
										new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2), new TwoLayersFeatureSize(1, 1, 2))
												.decorators(ImmutableList.of(TropicalaltiphyteforestLeaveDecorator.INSTANCE,
														TropicalaltiphyteforestTrunkDecorator.INSTANCE))
												.build()),
						List.of(CountPlacement.of(240), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING))));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.JUNGLE).temperature(0.7f)
				.downfall(0.7999999999999999f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY,
				BuiltinRegistries.BIOME.getKey(MinecraftTiraEditionModBiomes.TROPICALALTIPHYTEFOREST.get())), BiomeDictionary.Type.JUNGLE);
	}
}
