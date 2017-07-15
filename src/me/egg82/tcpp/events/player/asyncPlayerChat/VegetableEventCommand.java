package me.egg82.tcpp.events.player.asyncPlayerChat;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.egg82.tcpp.enums.PermissionsType;
import me.egg82.tcpp.services.VegetableItemRegistry;
import ninja.egg82.patterns.IRegistry;
import ninja.egg82.patterns.ServiceLocator;
import ninja.egg82.plugin.commands.EventCommand;
import ninja.egg82.plugin.utils.CommandUtil;

public class VegetableEventCommand extends EventCommand<AsyncPlayerChatEvent> {
	//vars
	private IRegistry vegetableItemRegistry = ServiceLocator.getService(VegetableItemRegistry.class);
	
	//constructor
	public VegetableEventCommand(AsyncPlayerChatEvent event) {
		super(event);
	}
	
	//public
	
	//private
	protected void onExecute(long elapsedMilliseconds) {
		if (event.isCancelled()) {
			return;
		}
		
		Player player = event.getPlayer();
		Item groundItem = vegetableItemRegistry.getRegister(player.getUniqueId().toString(), Item.class);
		
		if (groundItem == null) {
			return;
		}
		
		if (!CommandUtil.hasPermission(player, PermissionsType.CHAT_WHILE_VEGETABLE)) {
			String type = groundItem.getItemStack().getType().name();
			int underscore = type.indexOf('_');
			
			if (underscore > -1) {
				type = type.substring(0, underscore);
			}
			type = type.toLowerCase();
			
			String finalMessage = "";
			// An approximation of the message's actual length, represented in a single string (such as "potato")
			int numStrings = (int) Math.floor(event.getMessage().length() / type.length());
			
			for (int i = 0; i < Math.max(1, numStrings); i++) {
				finalMessage += type + " ";
			}
			
			event.setMessage(finalMessage.trim());
		}
	}
}
