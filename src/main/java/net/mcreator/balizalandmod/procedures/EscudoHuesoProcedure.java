package net.mcreator.balizalandmod.procedures;

@BalizalandmodModElements.ModElement.Tag
public class EscudoHuesoProcedure extends BalizalandmodModElements.ModElement {

	public EscudoHuesoProcedure(BalizalandmodModElements instance) {
		super(instance, 15);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure EscudoHueso!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity) {
			ItemStack _setstack = new ItemStack(Blocks.CHISELED_SANDSTONE, (int) (1));
			_setstack.setCount((int) 1);
			((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}

	}

}
