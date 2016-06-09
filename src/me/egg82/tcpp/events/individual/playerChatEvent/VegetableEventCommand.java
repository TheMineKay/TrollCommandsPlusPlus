package me.egg82.tcpp.events.individual.playerChatEvent;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.egg82.tcpp.enums.PermissionsType;
import me.egg82.tcpp.enums.PluginServiceType;
import ninja.egg82.patterns.ServiceLocator;
import ninja.egg82.plugin.commands.EventCommand;
import ninja.egg82.registry.interfaces.IRegistry;

public class VegetableEventCommand extends EventCommand {
	//vars
	private IRegistry vegetableRegistry = (IRegistry) ServiceLocator.getService(PluginServiceType.VEGETABLE_REGISTRY);
	
	//constructor
	public VegetableEventCommand(Event event) {
		super(event);
	}
	
	//public
	
	//private
	protected void execute() {
		AsyncPlayerChatEvent e = (AsyncPlayerChatEvent) event;
		Player player = e.getPlayer();
		
		if (vegetableRegistry.contains(player.getName().toLowerCase())) {
			if (!permissionsManager.playerHasPermission(player, PermissionsType.CHAT_WHILE_VEGETABLE)) {
				e.setCancelled(true);
				e.getPlayer().sendMessage("Vegetables can't talk, silly!");
			}
		}
	}
}
