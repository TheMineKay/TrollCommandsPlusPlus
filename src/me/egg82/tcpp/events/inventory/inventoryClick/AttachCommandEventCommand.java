package me.egg82.tcpp.events.inventory.inventoryClick;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import ninja.egg82.patterns.ServiceLocator;
import ninja.egg82.plugin.commands.EventCommand;
import ninja.egg82.plugin.reflection.nbt.INBTHelper;
import ninja.egg82.plugin.utils.CommandUtil;
import ninja.egg82.plugin.utils.TaskUtil;

public class AttachCommandEventCommand extends EventCommand<InventoryClickEvent> {
	//vars
	private INBTHelper nbtHelper = ServiceLocator.getService(INBTHelper.class);
	
	//constructor
	public AttachCommandEventCommand(InventoryClickEvent event) {
		super(event);
	}
	
	//public

	//private
	protected void onExecute(long elapsedMilliseconds) {
		if (event.isCancelled()) {
			return;
		}
		
		ItemStack item = null;
		InventoryAction action = event.getAction();
		
		Inventory bottom = event.getView().getBottomInventory();
		Inventory top = event.getView().getTopInventory();
		Inventory clicked = event.getClickedInventory();
		
		if (action == InventoryAction.MOVE_TO_OTHER_INVENTORY) {
			item = event.getCurrentItem();
			
			if (!nbtHelper.hasTag(item, "tcppCommand")) {
				return;
			}
			
			if (clicked == top) {
				InventoryHolder holder = bottom.getHolder();
				if (holder instanceof Player) {
					Player sender = CommandUtil.getPlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class));
					if (sender != null) {
						CommandUtil.dispatchCommandAtPlayerLocation(sender, (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
					} else {
						if (CommandUtil.getOfflinePlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class)).isOp()) {
							CommandUtil.dispatchCommandAtPlayerLocation(Bukkit.getConsoleSender(), (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
						} else {
							Bukkit.dispatchCommand((Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
						}
					}
					
					nbtHelper.removeTag(item, "tcppSender");
					nbtHelper.removeTag(item, "tcppCommand");
				}
			} else {
				ItemMeta meta = item.getItemMeta();
				ArrayList<String> lore = new ArrayList<String>(meta.getLore());
				int removeLine = -1;
				for (int i = 0; i < lore.size(); i++) {
					if (lore.get(i).contains("Command to run:")) {
						removeLine = i;
						break;
					}
				}
				if (removeLine > -1) {
					lore.remove(removeLine);
					lore.remove(removeLine);
				}
				meta.setLore(lore);
				item.setItemMeta(meta);
				
				update((Player) event.getWhoClicked());
				
				InventoryHolder holder = top.getHolder();
				if (holder instanceof Player) {
					Player sender = CommandUtil.getPlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class));
					if (sender != null) {
						CommandUtil.dispatchCommandAtPlayerLocation(sender, (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
					} else {
						if (CommandUtil.getOfflinePlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class)).isOp()) {
							CommandUtil.dispatchCommandAtPlayerLocation(Bukkit.getConsoleSender(), (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
						} else {
							Bukkit.dispatchCommand((Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
						}
					}
					
					nbtHelper.removeTag(item, "tcppSender");
					nbtHelper.removeTag(item, "tcppCommand");
				}
			}
		} else if (
			action == InventoryAction.HOTBAR_MOVE_AND_READD
			|| action == InventoryAction.HOTBAR_SWAP
			|| action == InventoryAction.PLACE_ALL
			|| action == InventoryAction.PLACE_ONE
			|| action == InventoryAction.PLACE_SOME
			|| action == InventoryAction.SWAP_WITH_CURSOR
		) {
			item = event.getCursor();
			
			if (!nbtHelper.hasTag(item, "tcppCommand")) {
				return;
			}
			
			if (clicked == top) {
				ItemMeta meta = item.getItemMeta();
				ArrayList<String> lore = new ArrayList<String>(meta.getLore());
				int removeLine = -1;
				for (int i = 0; i < lore.size(); i++) {
					if (lore.get(i).contains("Command to run:")) {
						removeLine = i;
						break;
					}
				}
				if (removeLine > -1) {
					lore.remove(removeLine);
					lore.remove(removeLine);
				}
				meta.setLore(lore);
				item.setItemMeta(meta);
				
				update((Player) event.getWhoClicked());
				
				InventoryHolder holder = top.getHolder();
				if (holder instanceof Player) {
					Player sender = CommandUtil.getPlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class));
					if (sender != null) {
						CommandUtil.dispatchCommandAtPlayerLocation(sender, (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
					} else {
						if (CommandUtil.getOfflinePlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class)).isOp()) {
							CommandUtil.dispatchCommandAtPlayerLocation(Bukkit.getConsoleSender(), (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
						} else {
							Bukkit.dispatchCommand((Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
						}
					}
					
					nbtHelper.removeTag(item, "tcppSender");
					nbtHelper.removeTag(item, "tcppCommand");
				}
			} else {
				if (item.getItemMeta().getLore() == null) {
					InventoryHolder holder = bottom.getHolder();
					if (holder instanceof Player) {
						Player sender = CommandUtil.getPlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class));
						if (sender != null) {
							CommandUtil.dispatchCommandAtPlayerLocation(sender, (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
						} else {
							if (CommandUtil.getOfflinePlayerByUuid(nbtHelper.getTag(item, "tcppSender", String.class)).isOp()) {
								CommandUtil.dispatchCommandAtPlayerLocation(Bukkit.getConsoleSender(), (Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
							} else {
								Bukkit.dispatchCommand((Player) holder, nbtHelper.getTag(item, "tcppCommand", String.class));
							}
						}
						
						nbtHelper.removeTag(item, "tcppSender");
						nbtHelper.removeTag(item, "tcppCommand");
					}
				}
			}
		} else {
			return;
		}
	}
	
	private void update(Player player) {
		TaskUtil.runSync(new Runnable() {
			public void run() {
				player.updateInventory();
			}
		}, 1L);
	}
}
