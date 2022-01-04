package me.daseul.com

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player
import org.bukkit.event.player.PlayerAdvancementDoneEvent

class Command: TabExecutor {

    var TapCommand1: MutableList<String>? = ArrayList<String>()
    var TapCommand2: MutableList<String>? = ArrayList<String>()
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender is Player){
            val p: Player = sender
            if(args.size > 0){
                if(args[0] == "testcommand"){
                    p.sendMessage("[TestCommand] 명령어가 사용되었습니다")
                }
            }
        }
        if(sender is Player){
            val p: Player = sender
            if(args.size > 0){
                if(args[0] == "info"){
                    p.sendMessage("[About MineCraftKotlinPlugin_1] Creat by Daseul. VS : 1.0_SNAPSHOT")
                }
            }
        }
        if(sender is Player){
            val p: Player = sender
            if(args.size > 0){
                if(args[0] == "game"){
                    if(args[1] == "start"){
                        p.sendTitle( "게임을 시작합니다", "KotlinsendTitleTestGame", 0, 10, 0)
                    } else if (args[1] == "end"){
                        p.sendTitle("게임을 종료합니다", "KotlinsendTitleTestGame", 0, 10, 0)
                    }
                }
            }
        }
        if(sender is Player){
            val p: Player = sender
            if(args.size > 0){
                if(args[0] == "kotlin"){
                    p.sendMessage("Kotlin!")
                }
            }
        }
        return false
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        alias: String,
        args: Array<out String>
    ): MutableList<String>? {
        if(args.size == 1){
            return TapCommand1()
        }
        if(args.size == 2){
            return TapCommand2()
        }
        return null
    }
    fun TapCommand1(): MutableList<String>? {
        TapCommand1?.add("testcommand")
        TapCommand1?.add("info")
        TapCommand1?.add("game")
        return TapCommand1
    }
    fun TapCommand2(): MutableList<String>? {
        TapCommand2?.add("start")
        TapCommand2?.add("end")
        return TapCommand2
    }
}