
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft_tira_edition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.minecraft_tira_edition.world.features.plants.TylophytaFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.TallpagophyteFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.TallcryptophyteFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.TallbrachyphytaFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.SmalleucaulophytacaeaFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.PagophytesprouteFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.PagophyteFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.CryptophytesprouteFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.CryptophyteFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.CarnophytaFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.BushlikeeucaulophytacaeaFeature;
import net.mcreator.minecraft_tira_edition.world.features.plants.BrachyphytaFeature;
import net.mcreator.minecraft_tira_edition.world.features.ores.TirandirtFeature;
import net.mcreator.minecraft_tira_edition.world.features.ores.Tiradirt3Feature;
import net.mcreator.minecraft_tira_edition.world.features.ores.Tiradirt2Feature;
import net.mcreator.minecraft_tira_edition.world.features.ores.PagophyteblockFeature;
import net.mcreator.minecraft_tira_edition.world.features.ores.EucalophytacaeaFeature;
import net.mcreator.minecraft_tira_edition.world.features.ores.CryptophyteblockFeature;
import net.mcreator.minecraft_tira_edition.world.features.ores.BrachyphytablockFeature;
import net.mcreator.minecraft_tira_edition.world.features.Xylophyte5Feature;
import net.mcreator.minecraft_tira_edition.world.features.Xylophyte4Feature;
import net.mcreator.minecraft_tira_edition.world.features.Xylophyte3Feature;
import net.mcreator.minecraft_tira_edition.world.features.Xylophyte2Feature;
import net.mcreator.minecraft_tira_edition.world.features.Xylophyte1Feature;
import net.mcreator.minecraft_tira_edition.world.features.Tallcoelophyta1wetblockgenFeature;
import net.mcreator.minecraft_tira_edition.world.features.Tallcoelophyta1crescentiagenFeature;
import net.mcreator.minecraft_tira_edition.world.features.Swampisle4Feature;
import net.mcreator.minecraft_tira_edition.world.features.Swampisle3Feature;
import net.mcreator.minecraft_tira_edition.world.features.Swampisle2Feature;
import net.mcreator.minecraft_tira_edition.world.features.Swampisle1Feature;
import net.mcreator.minecraft_tira_edition.world.features.Smallcoelophyta1wetbiomegenFeature;
import net.mcreator.minecraft_tira_edition.world.features.Smallcoelophyta1Feature;
import net.mcreator.minecraft_tira_edition.world.features.Smallaltiphyte5x52Feature;
import net.mcreator.minecraft_tira_edition.world.features.Smallaltiphyte5x51Feature;
import net.mcreator.minecraft_tira_edition.world.features.Smallaltiphyte3x32Feature;
import net.mcreator.minecraft_tira_edition.world.features.Smallaltiphyte3x31Feature;
import net.mcreator.minecraft_tira_edition.world.features.SmallCoelophyta1crescentiagenFeature;
import net.mcreator.minecraft_tira_edition.world.features.Mediumaltiphyte8x82Feature;
import net.mcreator.minecraft_tira_edition.world.features.Mediumaltiphyte8x81Feature;
import net.mcreator.minecraft_tira_edition.world.features.Mediumaltiphyte5x52Feature;
import net.mcreator.minecraft_tira_edition.world.features.Mediumaltiphyte5x51Feature;
import net.mcreator.minecraft_tira_edition.world.features.EucaulophytacaeaspawnFeature;
import net.mcreator.minecraft_tira_edition.world.features.Eucalophytacaea3Feature;
import net.mcreator.minecraft_tira_edition.world.features.Eucalophytacaea2Feature;
import net.mcreator.minecraft_tira_edition.world.features.Coelophyta1wetbiomegenFeature;
import net.mcreator.minecraft_tira_edition.world.features.Coelophyta1crescentiagenFeature;
import net.mcreator.minecraft_tira_edition.world.features.Coelophyta1Feature;
import net.mcreator.minecraft_tira_edition.world.features.ArcheanthostomaspawnFeature;
import net.mcreator.minecraft_tira_edition.world.features.AltiphyteFeature;
import net.mcreator.minecraft_tira_edition.world.features.Altiphyte14x142Feature;
import net.mcreator.minecraft_tira_edition.world.features.Altiphyte14x141Feature;
import net.mcreator.minecraft_tira_edition.MinecraftTiraEditionMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MinecraftTiraEditionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MinecraftTiraEditionMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> BRACHYPHYTABLOCK = register("brachyphytablock", BrachyphytablockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BrachyphytablockFeature.GENERATE_BIOMES,
					BrachyphytablockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TIRANDIRT = register("tirandirt", TirandirtFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TirandirtFeature.GENERATE_BIOMES, TirandirtFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PAGOPHYTEBLOCK = register("pagophyteblock", PagophyteblockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PagophyteblockFeature.GENERATE_BIOMES,
					PagophyteblockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TIRADIRT_2 = register("tiradirt_2", Tiradirt2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Tiradirt2Feature.GENERATE_BIOMES, Tiradirt2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYPTOPHYTEBLOCK = register("cryptophyteblock", CryptophyteblockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CryptophyteblockFeature.GENERATE_BIOMES,
					CryptophyteblockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TIRADIRT_3 = register("tiradirt_3", Tiradirt3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Tiradirt3Feature.GENERATE_BIOMES, Tiradirt3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BRACHYPHYTA = register("brachyphyta", BrachyphytaFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BrachyphytaFeature.GENERATE_BIOMES, BrachyphytaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TALLBRACHYPHYTA = register("tallbrachyphyta", TallbrachyphytaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, TallbrachyphytaFeature.GENERATE_BIOMES,
					TallbrachyphytaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PAGOPHYTESPROUTE = register("pagophytesproute", PagophytesprouteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PagophytesprouteFeature.GENERATE_BIOMES,
					PagophytesprouteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PAGOPHYTE = register("pagophyte", PagophyteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PagophyteFeature.GENERATE_BIOMES, PagophyteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TALLPAGOPHYTE = register("tallpagophyte", TallpagophyteFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, TallpagophyteFeature.GENERATE_BIOMES, TallpagophyteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYPTOPHYTESPROUTE = register("cryptophytesproute", CryptophytesprouteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CryptophytesprouteFeature.GENERATE_BIOMES,
					CryptophytesprouteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYPTOPHYTE = register("cryptophyte", CryptophyteFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CryptophyteFeature.GENERATE_BIOMES, CryptophyteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TALLCRYPTOPHYTE = register("tallcryptophyte", TallcryptophyteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, TallcryptophyteFeature.GENERATE_BIOMES,
					TallcryptophyteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLEUCAULOPHYTACAEA = register("smalleucaulophytacaea", SmalleucaulophytacaeaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SmalleucaulophytacaeaFeature.GENERATE_BIOMES,
					SmalleucaulophytacaeaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BUSHLIKEEUCAULOPHYTACAEA = register("bushlikeeucaulophytacaea",
			BushlikeeucaulophytacaeaFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					BushlikeeucaulophytacaeaFeature.GENERATE_BIOMES, BushlikeeucaulophytacaeaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CARNOPHYTA = register("carnophyta", CarnophytaFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CarnophytaFeature.GENERATE_BIOMES, CarnophytaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EUCALOPHYTACAEA = register("eucalophytacaea", EucalophytacaeaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EucalophytacaeaFeature.GENERATE_BIOMES,
					EucalophytacaeaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> XYLOPHYTE_1 = register("xylophyte_1", Xylophyte1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Xylophyte1Feature.GENERATE_BIOMES, Xylophyte1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> XYLOPHYTE_2 = register("xylophyte_2", Xylophyte2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Xylophyte2Feature.GENERATE_BIOMES, Xylophyte2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> XYLOPHYTE_3 = register("xylophyte_3", Xylophyte3Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Xylophyte3Feature.GENERATE_BIOMES, Xylophyte3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> XYLOPHYTE_4 = register("xylophyte_4", Xylophyte4Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Xylophyte4Feature.GENERATE_BIOMES, Xylophyte4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> XYLOPHYTE_5 = register("xylophyte_5", Xylophyte5Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Xylophyte5Feature.GENERATE_BIOMES, Xylophyte5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SWAMPISLE_1 = register("swampisle_1", Swampisle1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Swampisle1Feature.GENERATE_BIOMES, Swampisle1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SWAMPISLE_2 = register("swampisle_2", Swampisle2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Swampisle2Feature.GENERATE_BIOMES, Swampisle2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SWAMPISLE_3 = register("swampisle_3", Swampisle3Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Swampisle3Feature.GENERATE_BIOMES, Swampisle3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SWAMPISLE_4 = register("swampisle_4", Swampisle4Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Swampisle4Feature.GENERATE_BIOMES, Swampisle4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> ALTIPHYTE = register("altiphyte", AltiphyteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AltiphyteFeature.GENERATE_BIOMES, AltiphyteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EUCAULOPHYTACAEASPAWN = register("eucaulophytacaeaspawn", EucaulophytacaeaspawnFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EucaulophytacaeaspawnFeature.GENERATE_BIOMES,
					EucaulophytacaeaspawnFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ARCHEANTHOSTOMASPAWN = register("archeanthostomaspawn", ArcheanthostomaspawnFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ArcheanthostomaspawnFeature.GENERATE_BIOMES,
					ArcheanthostomaspawnFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COELOPHYTA_1 = register("coelophyta_1", Coelophyta1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Coelophyta1Feature.GENERATE_BIOMES, Coelophyta1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> COELOPHYTA_1WETBIOMEGEN = register("coelophyta_1wetbiomegen",
			Coelophyta1wetbiomegenFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					Coelophyta1wetbiomegenFeature.GENERATE_BIOMES, Coelophyta1wetbiomegenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLCOELOPHYTA_1 = register("smallcoelophyta_1", Smallcoelophyta1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Smallcoelophyta1Feature.GENERATE_BIOMES,
					Smallcoelophyta1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLCOELOPHYTA_1WETBIOMEGEN = register("smallcoelophyta_1wetbiomegen",
			Smallcoelophyta1wetbiomegenFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					Smallcoelophyta1wetbiomegenFeature.GENERATE_BIOMES, Smallcoelophyta1wetbiomegenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TALLCOELOPHYTA_1WETBLOCKGEN = register("tallcoelophyta_1wetblockgen",
			Tallcoelophyta1wetblockgenFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					Tallcoelophyta1wetblockgenFeature.GENERATE_BIOMES, Tallcoelophyta1wetblockgenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COELOPHYTA_1CRESCENTIAGEN = register("coelophyta_1crescentiagen",
			Coelophyta1crescentiagenFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					Coelophyta1crescentiagenFeature.GENERATE_BIOMES, Coelophyta1crescentiagenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALL_COELOPHYTA_1CRESCENTIAGEN = register("small_coelophyta_1crescentiagen",
			SmallCoelophyta1crescentiagenFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					SmallCoelophyta1crescentiagenFeature.GENERATE_BIOMES, SmallCoelophyta1crescentiagenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TALLCOELOPHYTA_1CRESCENTIAGEN = register("tallcoelophyta_1crescentiagen",
			Tallcoelophyta1crescentiagenFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					Tallcoelophyta1crescentiagenFeature.GENERATE_BIOMES, Tallcoelophyta1crescentiagenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TYLOPHYTA = register("tylophyta", TylophytaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, TylophytaFeature.GENERATE_BIOMES, TylophytaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLALTIPHYTE_3X_31 = register("smallaltiphyte_3x_31", Smallaltiphyte3x31Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Smallaltiphyte3x31Feature.GENERATE_BIOMES,
					Smallaltiphyte3x31Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLALTIPHYTE_5X_51 = register("smallaltiphyte_5x_51", Smallaltiphyte5x51Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Smallaltiphyte5x51Feature.GENERATE_BIOMES,
					Smallaltiphyte5x51Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDIUMALTIPHYTE_5X_51 = register("mediumaltiphyte_5x_51", Mediumaltiphyte5x51Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mediumaltiphyte5x51Feature.GENERATE_BIOMES,
					Mediumaltiphyte5x51Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDIUMALTIPHYTE_8X_81 = register("mediumaltiphyte_8x_81", Mediumaltiphyte8x81Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mediumaltiphyte8x81Feature.GENERATE_BIOMES,
					Mediumaltiphyte8x81Feature::placedFeature));
	public static final RegistryObject<Feature<?>> ALTIPHYTE_14X_141 = register("altiphyte_14x_141", Altiphyte14x141Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Altiphyte14x141Feature.GENERATE_BIOMES,
					Altiphyte14x141Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLALTIPHYTE_3X_32 = register("smallaltiphyte_3x_32", Smallaltiphyte3x32Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Smallaltiphyte3x32Feature.GENERATE_BIOMES,
					Smallaltiphyte3x32Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLALTIPHYTE_5X_52 = register("smallaltiphyte_5x_52", Smallaltiphyte5x52Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Smallaltiphyte5x52Feature.GENERATE_BIOMES,
					Smallaltiphyte5x52Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDIUMALTIPHYTE_5X_52 = register("mediumaltiphyte_5x_52", Mediumaltiphyte5x52Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mediumaltiphyte5x52Feature.GENERATE_BIOMES,
					Mediumaltiphyte5x52Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDIUMALTIPHYTE_8X_82 = register("mediumaltiphyte_8x_82", Mediumaltiphyte8x82Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mediumaltiphyte8x82Feature.GENERATE_BIOMES,
					Mediumaltiphyte8x82Feature::placedFeature));
	public static final RegistryObject<Feature<?>> ALTIPHYTE_14X_142 = register("altiphyte_14x_142", Altiphyte14x142Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Altiphyte14x142Feature.GENERATE_BIOMES,
					Altiphyte14x142Feature::placedFeature));
	public static final RegistryObject<Feature<?>> EUCALOPHYTACAEA_2 = register("eucalophytacaea_2", Eucalophytacaea2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Eucalophytacaea2Feature.GENERATE_BIOMES,
					Eucalophytacaea2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> EUCALOPHYTACAEA_3 = register("eucalophytacaea_3", Eucalophytacaea3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Eucalophytacaea3Feature.GENERATE_BIOMES,
					Eucalophytacaea3Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
