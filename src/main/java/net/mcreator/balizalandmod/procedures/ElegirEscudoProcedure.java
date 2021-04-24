package net.mcreator.balizalandmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.balizalandmod.BalizalandmodModElements;

import java.util.Map;
import java.util.HashMap;

@BalizalandmodModElements.ModElement.Tag
public class ElegirEscudoProcedure extends BalizalandmodModElements.ModElement {
	public ElegirEscudoProcedure(BalizalandmodModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ElegirEscudo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			MaterialEscudoProcedure.executeProcedure($_dependencies);
		}
	}
}
