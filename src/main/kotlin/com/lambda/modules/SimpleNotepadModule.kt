package com.lambda.modules

import com.lambda.SimpleNotepadPlugin
import com.lambda.client.module.Category
import com.lambda.client.plugin.api.PluginModule

internal object SimpleNotepadModule : PluginModule(
    name = "SimpleNotepad",
    category = Category.PLAYER,
    description = "Notepad... and nothing else",
    pluginMain = SimpleNotepadPlugin
) {
    private val lines by setting("Lines", 0, 0 .. 8, 1)

    private val line1 by setting("1", "", {lines >= 1})
    private val line2 by setting("2", "", {lines >= 2})
    private val line3 by setting("3", "", {lines >= 3})
    private val line4 by setting("4", "", {lines >= 4})
    private val line5 by setting("5", "", {lines >= 5})
    private val line6 by setting("6", "", {lines >= 6})
    private val line7 by setting("7", "", {lines >= 7})
    private val line8 by setting("8", "", {lines >= 8})
    private val line9 by setting("9", "", {lines >= 9})
    private val line10 by setting("10", "", {lines >= 10})
    private val line11 by setting("11", "", {lines >= 11})
    private val line12 by setting("12", "", {lines >= 12})
    private val line13 by setting("13", "", {lines >= 13})
    private val line14 by setting("14", "", {lines >= 14})
    private val line15 by setting("15", "", {lines >= 15})
    private val line16 by setting("16", "", {lines >= 16})
        
}