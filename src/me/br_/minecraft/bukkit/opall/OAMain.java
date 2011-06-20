package me.br_.minecraft.bukkit.opall;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class OAMain extends JavaPlugin {

	@Override
	public void onDisable() {
		System.out.println("[OpAll] Disabled.");
	}

	@Override
	public void onEnable() {
		OAListener pL = new OAListener(this);
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_JOIN, pL, Event.Priority.Normal,
				this);
		pm.registerEvent(Event.Type.PLAYER_QUIT, pL, Event.Priority.Normal,
				this);
		System.out.println("[OpAll] Enabled.");
	}
}
