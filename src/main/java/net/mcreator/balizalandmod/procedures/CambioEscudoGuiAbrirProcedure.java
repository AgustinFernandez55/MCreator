package net.mcreator.balizalandmod.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.balizalandmod.BalizalandmodModVariables;
import net.mcreator.balizalandmod.BalizalandmodModElements;

import java.util.function.Supplier;
import java.util.Map;

@BalizalandmodModElements.ModElement.Tag
public class CambioEscudoGuiAbrirProcedure extends BalizalandmodModElements.ModElement {
	public CambioEscudoGuiAbrirProcedure(BalizalandmodModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CambioEscudoGuiAbrir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		while ((((entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new BalizalandmodModVariables.PlayerVariables())).Shield_Bone) == 1)) {
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(Items.BONE, (int) (1));
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (0))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			(new ItemStack(Items.BONE, (int) (1))).setDisplayName(new StringTextComponent("Escudo de Huesos"));
		}
	}
}
