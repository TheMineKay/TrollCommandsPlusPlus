package me.egg82.tcpp.events.player.playerRespawn;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.event.player.PlayerRespawnEvent;

import me.egg82.tcpp.services.VegetableLocationRegistry;
import ninja.egg82.patterns.IRegistry;
import ninja.egg82.patterns.ServiceLocator;
import ninja.egg82.plugin.commands.EventCommand;

public class VegetableEventCommand extends EventCommand<PlayerRespawnEvent> {
	//vars
	private IRegistry<UUID> vegetableLocationRegistry = ServiceLocator.getService(VegetableLocationRegistry.class);
	
	//constructor
	public VegetableEventCommand(PlayerRespawnEvent event) {
		super(event);
	}
	
	//public

	//private
	protected void onExecute(long elapsedMilliseconds) {
		Location itemLocation = vegetableLocationRegistry.getRegister(event.getPlayer().getUniqueId(), Location.class);
		if (itemLocation != null) {
			event.setRespawnLocation(itemLocation);
		}
	}
}
