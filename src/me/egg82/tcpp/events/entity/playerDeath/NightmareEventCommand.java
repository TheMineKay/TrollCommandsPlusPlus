package me.egg82.tcpp.events.entity.playerDeath;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.egg82.tcpp.services.NightmareRegistry;
import ninja.egg82.patterns.IRegistry;
import ninja.egg82.patterns.ServiceLocator;
import ninja.egg82.plugin.commands.EventCommand;
import ninja.egg82.plugin.reflection.protocol.IFakeLivingEntity;

public class NightmareEventCommand extends EventCommand {
	//vars
	private IRegistry nightmareRegistry = (IRegistry) ServiceLocator.getService(NightmareRegistry.class);
	
	//constructor
	public NightmareEventCommand(Event event) {
		super(event);
	}
	
	//public
	
	//private
	@SuppressWarnings("unchecked")
	protected void onExecute(long elapsedMilliseconds) {
		PlayerDeathEvent e = (PlayerDeathEvent) event;
		Player player = e.getEntity();
		String uuid = player.getUniqueId().toString();
		
		if (!nightmareRegistry.hasRegister(uuid)) {
			return;
		}
		
		for (IFakeLivingEntity entity : (List<IFakeLivingEntity>) nightmareRegistry.getRegister(uuid)) {
			entity.destroy();
		}
		nightmareRegistry.setRegister(uuid, List.class, null);
	}
}