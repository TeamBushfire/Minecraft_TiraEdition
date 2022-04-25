
package net.mcreator.minecraft_tira_edition.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.minecraft_tira_edition.init.MinecraftTiraEditionModTabs;

public class CookedbaropodmeatItem extends Item {
	public CookedbaropodmeatItem() {
		super(new Item.Properties().tab(MinecraftTiraEditionModTabs.TAB_TIRA_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(16).saturationMod(1.9000000000000001f)

						.meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 45;
	}
}
