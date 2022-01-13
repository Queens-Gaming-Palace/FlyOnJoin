package net.gsociety.flyOnJoin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class flyOnJoin extends JavaPlugin implements Listener {
    public flyOnJoin() {
    }

    public void onEnable() {
        this.getLogger().info("[GSociety] [FlyOnJoin v0.06] started");
        this.getLogger().info("[FlyOnJoin] Attempting to register PlayerJoinEvent");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable() {
        this.getLogger().info("[GSociety] [FlyOnJoin v0.06] stopped.");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent evt) {
        this.getLogger().info("[FlyOnJoin] Player " + evt.getPlayer().getName() + " has joined. Testing for /fly");
        if (evt.getPlayer().hasPermission("essentials.fly")) {
            this.getLogger().info("Player " + evt.getPlayer().getName() + " has /fly. Enabling.");
            evt.getPlayer().chat("/fly");
        } else {
            this.getLogger().info("Player " + evt.getPlayer().getName() + " does not have /fly.");
        }

    }
}
