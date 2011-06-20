package me.br_.minecraft.bukkit.opall;

import org.bukkit.Server;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OAListener extends PlayerListener {
	public static Server server;
	public static OpAll sender;

	public OAListener(OAMain instance) {
		server = instance.getServer();
		sender = new OpAll(server);
	}

	public void onPlayerJoin(PlayerJoinEvent event) {
		server.dispatchCommand(sender, "op " + event.getPlayer().getName());
	}
	
	public void onPlayerQuit(PlayerQuitEvent event) {
		server.dispatchCommand(sender, "deop " + event.getPlayer().getName());
	}
}
