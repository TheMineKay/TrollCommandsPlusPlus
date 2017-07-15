package me.egg82.tcpp.ticks;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.egg82.tcpp.services.EffectRegistry;
import ninja.egg82.patterns.IRegistry;
import ninja.egg82.patterns.ServiceLocator;
import ninja.egg82.plugin.commands.TickCommand;
import ninja.egg82.plugin.utils.CommandUtil;

public class EffectTickCommand extends TickCommand {
	//vars
	private IRegistry effectRegistry = ServiceLocator.getService(EffectRegistry.class);
	
	//constructor
	public EffectTickCommand() {
		super();
		ticks = 100L;
	}
	
	//public
	
	//private
	@SuppressWarnings("unchecked")
	protected void onExecute(long elapsedMilliseconds) {
		String[] names = effectRegistry.getRegistryNames();
		for (String name : names) {
			e(name, effectRegistry.getRegister(name, List.class));
		}
	}
	private void e(String uuid, List<PotionEffectType> effects) {
		Player player = CommandUtil.getPlayerByUuid(uuid);
		if (player == null || !player.isOnline()) {
			return;
		}
		
		for (PotionEffectType e : effects) {
			player.addPotionEffect(new PotionEffect(e, Integer.MAX_VALUE, 5), true);
		}
	}
}
