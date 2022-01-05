package me.daseul.com

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player
import org.bukkit.event.player.PlayerAdvancementDoneEvent

class Command: TabExecutor {

    var TabCommand1: MutableList<String>? = ArrayList<String>()
    var TabCommand2: MutableList<String>? = ArrayList<String>()
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
                        p.sendTitle( "게임을 시작합니다", "KotlinsendTitleTestGame", 0, 20, 0)
                    } else if (args[1] == "end"){
                        p.sendTitle("게임을 종료합니다", "KotlinsendTitleTestGame", 0, 20, 0)
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
        if(sender is Player){
            val p: Player = sender
            if(args.size > 0){
                if(args[0] == "build"){
                    if(args[1] == "code"){
                        if(args[2] == readLine()){
                            var input = args[2]
                            p.sendMessage(input + "을(를) Build 했습니다!")
                            p.sendTitle(p.health.toString(), "완료!", 0, 15, 0)
                            p.sendMessage("By Daseul")
                        }
                    }
                    if(args[1] == "info"){
                        p.sendMessage("(/)Build 명령어는 MKP_1의 자체 제작 Build Tool입니다")
                    }
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
            return TabCommand1()
        }
        if(args.size == 2){
            return TabCommand2()
        }
        return null
    }
    fun TabCommand1(): MutableList<String>? {
        TabCommand1?.add("testcommand")
        TabCommand1?.add("info")
        TabCommand1?.add("game")
        TabCommand1?.add("kotlin")
        TabCommand1?.add("build")
        return TabCommand1
    }
    fun TabCommand2(): MutableList<String>? {
        TabCommand2?.add("start")
        TabCommand2?.add("end")
        TabCommand2?.add("code")
        return TabCommand2
    }
}