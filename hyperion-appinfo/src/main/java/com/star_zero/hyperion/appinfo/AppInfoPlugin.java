package com.star_zero.hyperion.appinfo;

import androidx.annotation.Nullable;

import com.google.auto.service.AutoService;
import com.willowtreeapps.hyperion.plugin.v1.Plugin;
import com.willowtreeapps.hyperion.plugin.v1.PluginModule;

@AutoService(Plugin.class)
public class AppInfoPlugin extends Plugin {
    @Nullable
    @Override
    public PluginModule createPluginModule() {
        return new AppInfoModule();
    }
}
