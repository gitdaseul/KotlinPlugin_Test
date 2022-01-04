package me.daseul.com

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin(){
    override fun onEnable() {
        logger.info("플러그인이 활성화 되었습니다")
        Bukkit.getPluginManager().registerEvents(Events(), this)
        getCommand("kotlinplugin")?.setExecutor(Command())
    }

    override fun onDisable() {
        logger.info("플러그인이 비활성화 되었습니다")
    }
}