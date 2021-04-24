package net.mcreator.balizalandmod.procedures;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.balizalandmod.BalizalandmodModVariables;
import net.mcreator.balizalandmod.BalizalandmodModElements;
import net.mcreator.balizalandmod.BalizalandmodMod;

import java.util.function.Supplier;
import java.util.Map;

@BalizalandmodModElements.ModElement.Tag
public class MaterialEscudoProcedure extends BalizalandmodModElements.ModElement {
	public MaterialEscudoProcedure(BalizalandmodModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MaterialEscudo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(Items.BONE, (int) (1)).getItem())) {
			if ((((entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BalizalandmodModVariables.PlayerVariables())).Shield_Bone) == 0)) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				{
					double _setval = (double) 1;
					entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Shield_Bone = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				BalizalandmodMod.LOGGER.warn("Material ya a\u00F1adido");
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(Items.STRING, (int) (1)).getItem())) {
			if ((((entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BalizalandmodModVariables.PlayerVariables())).Shield_Rope) == 0)) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				{
					double _setval = (double) 1;
					entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Shield_Rope = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				BalizalandmodMod.LOGGER.warn("Material ya a\u00F1adido");
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1))).getItem() == new ItemStack(Items.ARROW, (int) (1)).getItem())) {
			if ((((entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BalizalandmodModVariables.PlayerVariables())).Shield_Arrow) == 0)) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				{
					double _setval = (double) 1;
					entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Shield_Arrow = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				BalizalandmodMod.LOGGER.warn("Material ya a\u00F1adido");
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())) {
			if ((((entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BalizalandmodModVariables.PlayerVariables())).Shield_Wither) == 0)) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				{
					double _setval = (double) 1;
					entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Shield_Wither = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				BalizalandmodMod.LOGGER.warn("Material ya a\u00F1adido");
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(Items.PHANTOM_MEMBRANE, (int) (1)).getItem())) {
			if ((((entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BalizalandmodModVariables.PlayerVariables())).Shield_SoulEater) == 0)) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				{
					double _setval = (double) 1;
					entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Shield_SoulEater = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				BalizalandmodMod.LOGGER.warn("Material ya a\u00F1adido");
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(Items.GLISTERING_MELON_SLICE, (int) (1)).getItem())) {
			if ((((entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BalizalandmodModVariables.PlayerVariables())).Shield_Heal) == 0)) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				{
					double _setval = (double) 1;
					entity.getCapability(BalizalandmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Shield_Heal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				BalizalandmodMod.LOGGER.warn("Material ya a\u00F1adido");
			}
		}
	}
}
