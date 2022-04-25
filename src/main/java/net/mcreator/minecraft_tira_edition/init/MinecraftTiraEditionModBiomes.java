
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft_tira_edition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.minecraft_tira_edition.world.biome.XylophyteforesthillsBiome;
import net.mcreator.minecraft_tira_edition.world.biome.XylophyteforestBiome;
import net.mcreator.minecraft_tira_edition.world.biome.TropicalaltiphyteforestBiome;
import net.mcreator.minecraft_tira_edition.world.biome.TiraswampBiome;
import net.mcreator.minecraft_tira_edition.world.biome.TirasteppeBiome;
import net.mcreator.minecraft_tira_edition.world.biome.TirandesertBiome;
import net.mcreator.minecraft_tira_edition.world.biome.TiradeserthillsBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SparsealtyphytetropicsBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SnowytirahillsBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SnowytiraBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SnowynodophytetaigaBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SnowynodophyteplainsBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SmoothshallowoceanBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SmoothoceanBiome;
import net.mcreator.minecraft_tira_edition.world.biome.ShallowoceanBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SeasonalsteppeBiome;
import net.mcreator.minecraft_tira_edition.world.biome.SeasonaldesertBiome;
import net.mcreator.minecraft_tira_edition.world.biome.OpentiraplainsBiome;
import net.mcreator.minecraft_tira_edition.world.biome.OceanBiome;
import net.mcreator.minecraft_tira_edition.world.biome.NodophytetaigaBiome;
import net.mcreator.minecraft_tira_edition.world.biome.NodophyteplainsBiome;
import net.mcreator.minecraft_tira_edition.world.biome.JaggedshallowoceanBiome;
import net.mcreator.minecraft_tira_edition.world.biome.JaggedoceanBiome;
import net.mcreator.minecraft_tira_edition.world.biome.HighxylophyteforestBiome;
import net.mcreator.minecraft_tira_edition.world.biome.DryseasonalsteppeBiome;
import net.mcreator.minecraft_tira_edition.world.biome.DryerseasonalsteppeBiome;
import net.mcreator.minecraft_tira_edition.world.biome.DensealtiphytejungleBiome;
import net.mcreator.minecraft_tira_edition.world.biome.CrescentiaBiome;
import net.mcreator.minecraft_tira_edition.world.biome.AltiphytetropichillsBiome;
import net.mcreator.minecraft_tira_edition.MinecraftTiraEditionMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftTiraEditionModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MinecraftTiraEditionMod.MODID);
	public static final RegistryObject<Biome> TIRASTEPPE = REGISTRY.register("tirasteppe", () -> TirasteppeBiome.createBiome());
	public static final RegistryObject<Biome> SHALLOWOCEAN = REGISTRY.register("shallowocean", () -> ShallowoceanBiome.createBiome());
	public static final RegistryObject<Biome> TIRASWAMP = REGISTRY.register("tiraswamp", () -> TiraswampBiome.createBiome());
	public static final RegistryObject<Biome> XYLOPHYTEFOREST = REGISTRY.register("xylophyteforest", () -> XylophyteforestBiome.createBiome());
	public static final RegistryObject<Biome> XYLOPHYTEFORESTHILLS = REGISTRY.register("xylophyteforesthills",
			() -> XylophyteforesthillsBiome.createBiome());
	public static final RegistryObject<Biome> OCEAN = REGISTRY.register("ocean", () -> OceanBiome.createBiome());
	public static final RegistryObject<Biome> SMOOTHSHALLOWOCEAN = REGISTRY.register("smoothshallowocean",
			() -> SmoothshallowoceanBiome.createBiome());
	public static final RegistryObject<Biome> JAGGEDSHALLOWOCEAN = REGISTRY.register("jaggedshallowocean",
			() -> JaggedshallowoceanBiome.createBiome());
	public static final RegistryObject<Biome> SMOOTHOCEAN = REGISTRY.register("smoothocean", () -> SmoothoceanBiome.createBiome());
	public static final RegistryObject<Biome> JAGGEDOCEAN = REGISTRY.register("jaggedocean", () -> JaggedoceanBiome.createBiome());
	public static final RegistryObject<Biome> SNOWYTIRA = REGISTRY.register("snowytira", () -> SnowytiraBiome.createBiome());
	public static final RegistryObject<Biome> HIGHXYLOPHYTEFOREST = REGISTRY.register("highxylophyteforest",
			() -> HighxylophyteforestBiome.createBiome());
	public static final RegistryObject<Biome> TIRANDESERT = REGISTRY.register("tirandesert", () -> TirandesertBiome.createBiome());
	public static final RegistryObject<Biome> TIRADESERTHILLS = REGISTRY.register("tiradeserthills", () -> TiradeserthillsBiome.createBiome());
	public static final RegistryObject<Biome> TROPICALALTIPHYTEFOREST = REGISTRY.register("tropicalaltiphyteforest",
			() -> TropicalaltiphyteforestBiome.createBiome());
	public static final RegistryObject<Biome> SNOWYTIRAHILLS = REGISTRY.register("snowytirahills", () -> SnowytirahillsBiome.createBiome());
	public static final RegistryObject<Biome> OPENTIRASTEPPE = REGISTRY.register("opentirasteppe", () -> OpentiraplainsBiome.createBiome());
	public static final RegistryObject<Biome> DENSEALTIPHYTEJUNGLE = REGISTRY.register("densealtiphytejungle",
			() -> DensealtiphytejungleBiome.createBiome());
	public static final RegistryObject<Biome> SPARSEALTYPHYTETROPICS = REGISTRY.register("sparsealtyphytetropics",
			() -> SparsealtyphytetropicsBiome.createBiome());
	public static final RegistryObject<Biome> ALTIPHYTETROPICHILLS = REGISTRY.register("altiphytetropichills",
			() -> AltiphytetropichillsBiome.createBiome());
	public static final RegistryObject<Biome> NODOPHYTETAIGA = REGISTRY.register("nodophytetaiga", () -> NodophytetaigaBiome.createBiome());
	public static final RegistryObject<Biome> SNOWYNODOPHYTETAIGA = REGISTRY.register("snowynodophytetaiga",
			() -> SnowynodophytetaigaBiome.createBiome());
	public static final RegistryObject<Biome> SNOWYNODOPHYTEPLAINS = REGISTRY.register("snowynodophyteplains",
			() -> SnowynodophyteplainsBiome.createBiome());
	public static final RegistryObject<Biome> NODOPHYTEPLAINS = REGISTRY.register("nodophyteplains", () -> NodophyteplainsBiome.createBiome());
	public static final RegistryObject<Biome> SEASONALSTEPPE = REGISTRY.register("seasonalsteppe", () -> SeasonalsteppeBiome.createBiome());
	public static final RegistryObject<Biome> DRYERSEASONALSTEPPE = REGISTRY.register("dryerseasonalsteppe",
			() -> DryerseasonalsteppeBiome.createBiome());
	public static final RegistryObject<Biome> SEASONALDESERT = REGISTRY.register("seasonaldesert", () -> SeasonaldesertBiome.createBiome());
	public static final RegistryObject<Biome> DRYSEASONALSTEPPE = REGISTRY.register("dryseasonalsteppe", () -> DryseasonalsteppeBiome.createBiome());
	public static final RegistryObject<Biome> CRESCENTIA = REGISTRY.register("crescentia", () -> CrescentiaBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TirasteppeBiome.init();
			ShallowoceanBiome.init();
			TiraswampBiome.init();
			XylophyteforestBiome.init();
			XylophyteforesthillsBiome.init();
			OceanBiome.init();
			SmoothshallowoceanBiome.init();
			JaggedshallowoceanBiome.init();
			SmoothoceanBiome.init();
			JaggedoceanBiome.init();
			SnowytiraBiome.init();
			HighxylophyteforestBiome.init();
			TirandesertBiome.init();
			TiradeserthillsBiome.init();
			TropicalaltiphyteforestBiome.init();
			SnowytirahillsBiome.init();
			OpentiraplainsBiome.init();
			DensealtiphytejungleBiome.init();
			SparsealtyphytetropicsBiome.init();
			AltiphytetropichillsBiome.init();
			NodophytetaigaBiome.init();
			SnowynodophytetaigaBiome.init();
			SnowynodophyteplainsBiome.init();
			NodophyteplainsBiome.init();
			SeasonalsteppeBiome.init();
			DryerseasonalsteppeBiome.init();
			SeasonaldesertBiome.init();
			DryseasonalsteppeBiome.init();
			CrescentiaBiome.init();
		});
	}

	@Mod.EventBusSubscriber
	public static class BiomeInjector {
		@SubscribeEvent
		public static void onServerAboutToStart(ServerAboutToStartEvent event) {
			MinecraftServer server = event.getServer();
			Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
			Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
			WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
			for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
				DimensionType dimensionType = entry.getValue().typeHolder().value();
				if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
					ChunkGenerator chunkGenerator = entry.getValue().generator();
					// Inject biomes to biome source
					if (chunkGenerator.getBiomeSource()instanceof MultiNoiseBiomeSource noiseSource) {
						List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
						parameters.add(new Pair<>(CrescentiaBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, CRESCENTIA.getId()))));

						MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters),
								noiseSource.preset);
						chunkGenerator.biomeSource = moddedNoiseSource;
						chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
					}
					// Inject surface rules
					if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
						NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
						SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
						if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
							List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
							surfaceRules.add(1,
									overworldRule(ResourceKey.create(Registry.BIOME_REGISTRY, CRESCENTIA.getId()),
											MinecraftTiraEditionModBlocks.BRACHYPHYTABLOCK.get().defaultBlockState(),
											MinecraftTiraEditionModBlocks.TIRANDIRT.get().defaultBlockState()));
							NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
									noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
									noiseGeneratorSettings.noiseRouter(),
									SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
									noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
									noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(),
									noiseGeneratorSettings.useLegacyRandomSource());
							noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
						}
					}
				}
			}
		}

		private static SurfaceRules.RuleSource overworldRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock) {
			return SurfaceRules
					.ifTrue(SurfaceRules.isBiome(biomeKey),
							SurfaceRules
									.ifTrue(SurfaceRules.abovePreliminarySurface(),
											SurfaceRules.sequence(
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
															SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
																	SurfaceRules.state(groundBlock)), SurfaceRules.state(undergroundBlock))),
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR),
															SurfaceRules.state(undergroundBlock)))));
		}
	}
}
