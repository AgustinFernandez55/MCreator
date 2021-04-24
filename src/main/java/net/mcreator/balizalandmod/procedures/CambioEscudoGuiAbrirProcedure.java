package net.mcreator.balizalandmod.procedures;

@BalizalandmodModElements.ModElement.Tag
public class CambioEscudoGuiAbrirProcedure extends BalizalandmodModElements.ModElement {

	public CambioEscudoGuiAbrirProcedure(BalizalandmodModElements instance) {
		super(instance, 14);

	}

	public static void executeProcedure(Map<String, Object> dependencies){
		if(dependencies.get("entity") == null) {
			if(!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CambioEscudoGuiAbrir!");
			return;
		}

				Entity entity = (Entity) dependencies.get("entity");

		while((==1)) {if(entity instanceof PlayerEntity) {
	Container _current = ((PlayerEntity) entity).openContainer;
	if(_current instanceof Supplier) {
		Object invobj = ((Supplier) _current).get();
		if(invobj instanceof Map) {
			ItemStack _setstack = new ItemStack(Items.BONE, (int)(1));
			_setstack.setCount((int) 1);
			((Slot) ((Map) invobj).get((int)(0))).putStack(_setstack);
			_current.detectAndSendChanges();
		}
	}
}(new ItemStack(Items.BONE, (int)(1))).setDisplayName(new StringTextComponent("Escudo de Huesos"));}

	}

}
