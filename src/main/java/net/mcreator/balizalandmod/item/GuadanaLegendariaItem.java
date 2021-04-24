
package net.mcreator.balizalandmod.item;

@BalizalandmodModElements.ModElement.Tag
public class GuadanaLegendariaItem extends BalizalandmodModElements.ModElement {

	@ObjectHolder("balizalandmod:guadana_legendaria")
	public static final Item block = null;

	public GuadanaLegendariaItem(BalizalandmodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 258;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("guadana_legendaria"));
	}

}
