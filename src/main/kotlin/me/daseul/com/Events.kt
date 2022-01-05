package me.daseul.com

import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerGameModeChangeEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import org.bukkit.event.server.TabCompleteEvent
class Events: Listener{

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent): Unit {
        val p: Player = e.player
        e.joinMessage = "[" + ChatColor.GREEN + "+" + ChatColor.WHITE + "] " + p.name + "님이 서버에 접속하셨습니다!" + " | " + "현재 온라인 상태 " + ChatColor.GREEN + "[" + p.isOnline + "]"
    }
    @EventHandler
    fun onPlayerGameModeChangeEvent(e: PlayerGameModeChangeEvent): Unit {
        val p: Player = e.player
        p.sendMessage(p.name + " 님이 게임모드를 " + p.gameMode + "로 변경했습니다!")
    }
    @EventHandler
    fun onPlayerQuitEvent(e: PlayerQuitEvent): Unit {
        val p: Player = e.player
        e.quitMessage = "[" + ChatColor.RED + "-" + ChatColor.WHITE + "] " + p.name + "님이 퇴장하셨습니다!" + " | " + "현재 온라인 상태 " + ChatColor.RED + "[" + p.isOnline + "]"
    }
}
