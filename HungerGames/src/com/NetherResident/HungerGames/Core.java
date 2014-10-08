package com.NetherResident.HungerGames;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

	@Override
	public void onEnable(){
		
		new File(this.getDataFolder().getAbsolutePath() + File.separator + "users").mkdirs();
		
	}
	
	@Override
	public void onDisable(){
		
		
		
	}
	
}
