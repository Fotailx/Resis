package net.fotailx

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
class Main : JavaPlugin(), Listener{
    override fun onEnable() {
        logger.info("加载插件中...")
        logger.info("Resis by Kitsunetsuka_Kyuju")
        logger.info("for Gold Coast and Empire Fox")
    }
}