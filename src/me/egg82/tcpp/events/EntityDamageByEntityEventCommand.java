package me.egg82.tcpp.events;

import java.util.List;

import org.bukkit.event.Event;

import ninja.egg82.plugin.commands.EventCommand;
import ninja.egg82.utils.ReflectUtil;

public class EntityDamageByEntityEventCommand extends EventCommand {
	//vars
	
	//constructor
	public EntityDamageByEntityEventCommand(Event event) {
		super(event);
	}
	
	//public

	//private
	protected void onExecute(long elapsedMilliseconds) {
		List<Class<? extends EventCommand>> commands = ReflectUtil.getClasses(EventCommand.class, "me.egg82.tcpp.events.entity.entityDamageByEntity");
		for (int i = 0; i < commands.size(); i++) {
			EventCommand c = null;
			try {
				c = commands.get(i).getDeclaredConstructor(Event.class).newInstance(event);
			} catch (Exception ex) {
				continue;
			}
			c.start();
		}
	}
}