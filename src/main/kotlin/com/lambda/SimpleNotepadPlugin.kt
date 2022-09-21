package com.lambda

import com.lambda.client.plugin.api.Plugin
import com.lambda.modules.SimpleNotepadModule

internal object SimpleNotepadPlugin : Plugin() {

    override fun onLoad() {
        modules.add(SimpleNotepadModule)
    }

    override fun onUnload() {
    }
}