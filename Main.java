package me.core.CowSpawn;

import org.bukkit.plugin.java.JavaPlugin;

import me.core.CowSpawn.commands.CowCommand;

public class Main extends JavaPlugin {

	
	@Override
	public void onEnable() {
		new CowCommand(this);
	}
}
