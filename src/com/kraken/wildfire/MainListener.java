package com.kraken.wildfire;

import java.util.ArrayList;
import java.util.Random;
import java.util.WeakHashMap;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

public class MainListener implements Listener {
	
	Main plugin;
	WeakHashMap<String, Boolean> options = new WeakHashMap<>();
	String language;
	
	ArrayList<Player> cooldown = new ArrayList<>();
	
    public MainListener(Main plugin, String language) {
  	  
  	  plugin.getServer().getPluginManager().registerEvents(this, plugin);
  	  this.plugin = plugin;
  	  this.language = language;
  	  
    }
    
    public void setOption(String option, boolean setting) {
    	options.put(option, setting);
    }
    
    public void setLanguage(String language) {
    	this.language = language;
    }
    
    @EventHandler
    public void onBlockIgnite(BlockIgniteEvent event) {
    	
    	//Get the block stuff
    	Block block = event.getBlock();
    	Location loc = block.getLocation();
    	
    	//Roll 1/10 chance to cause a wildfire
    	Random random = new Random();
    	int roll = random.nextInt(10);
    	
    	if ( roll == 9 && options.get("enabled") ) {
    		
    		Location b1 = block.getLocation().add(0, -1, 1);
    		Location b2 = block.getLocation().add(0, -1, -1);
    		Location b3 = block.getLocation().add(1, -1, 0);
    		Location b4 = block.getLocation().add(-1, -1, 0);
    		Location b5 = block.getLocation().add(1, -1, 1);
    		Location b6 = block.getLocation().add(1, -1, -1);
    		Location b7 = block.getLocation().add(-1, -1, -1);
    		Location b8 = block.getLocation().add(-1, -1, 1);
    		Location b9 = block.getLocation().add(2, -1, 0);
    		Location b10 = block.getLocation().add(-2, -1, 0);
    		Location b11 = block.getLocation().add(0, -1, 2);
    		Location b12 = block.getLocation().add(0, -1, -2);
    		Location b13 = block.getLocation().add(4, -1, 0);
    		Location b14 = block.getLocation().add(-4, -1, 0);
    		Location b15 = block.getLocation().add(0, -1, 4);
    		Location b16 = block.getLocation().add(0, -1, -4);
    		
    		b1.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b2.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b3.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b4.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b5.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b6.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b7.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b8.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b9.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b10.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b11.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b12.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b13.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b14.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b15.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		b16.getBlock().getRelative(BlockFace.UP).setType(Material.FIRE);
    		
    		System.out.println("Wildfire started @ coords x:" + loc.getX() + ", y:" + loc.getY() + ", z:" + loc.getZ() + "!");
    		
    	}
    	
    }

    
}
