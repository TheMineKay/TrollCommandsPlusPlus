package me.egg82.tcpp.ticks;

import java.util.Iterator;
import java.util.List;

import org.bukkit.entity.Player;

import me.egg82.tcpp.services.AmnesiaMessageRegistry;
import me.egg82.tcpp.services.AmnesiaRegistry;
import ninja.egg82.patterns.IRegistry;
import ninja.egg82.patterns.ServiceLocator;
import ninja.egg82.plugin.commands.TickCommand;

public class AmnesiaTickCommand extends TickCommand {
	//vars
	private IRegistry amnesiaRegistry = (IRegistry) ServiceLocator.getService(AmnesiaRegistry.class);
	private IRegistry amnesiaMessageRegistry = (IRegistry) ServiceLocator.getService(AmnesiaMessageRegistry.class);
	
	//constructor
	public AmnesiaTickCommand() {
		super();
		ticks = 20L;
	}
	
	//public
	
	//private
	protected void onExecute(long elapsedMilliseconds) {
		String[] names = amnesiaMessageRegistry.getRegistryNames();
		for (String name : names) {
			e(name, (Player) amnesiaRegistry.getRegister(name));
		}
	}
	@SuppressWarnings("unchecked")
	private void e(String uuid, Player player) {
		if(!player.isOnline()) {
			return;
		}
		
		List<String> messages = (List<String>) amnesiaMessageRegistry.getRegister(uuid);
		Iterator<String> i = messages.iterator();
		
		while (i.hasNext()) {
			String v = i.next();
			
			if (Math.random() <= 0.1d) {
				player.sendMessage(v);
				i.remove();
			}
		}
	}
}
