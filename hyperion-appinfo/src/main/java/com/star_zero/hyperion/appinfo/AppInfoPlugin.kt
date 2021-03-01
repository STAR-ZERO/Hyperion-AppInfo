package com.star_zero.hyperion.appinfo

import com.google.auto.service.AutoService
import com.willowtreeapps.hyperion.plugin.v1.Plugin
import com.willowtreeapps.hyperion.plugin.v1.PluginModule

@AutoService(Plugin::class)
class AppInfoPlugin : Plugin() {
    override fun createPluginModule(): PluginModule {
        return AppInfoModule()
    }
}