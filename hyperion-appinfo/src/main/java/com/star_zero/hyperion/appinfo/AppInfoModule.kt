package com.star_zero.hyperion.appinfo

import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.willowtreeapps.hyperion.plugin.v1.PluginModule

class AppInfoModule : PluginModule(), View.OnClickListener {

    override fun createPluginView(layoutInflater: LayoutInflater, parent: ViewGroup): View? {
        val view = layoutInflater.inflate(R.layout.hyperion_app_info_item_plugin, parent, false)
        view.setOnClickListener(this)
        return view
    }

    override fun onClick(view: View) {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        intent.data = Uri.parse("package:${view.context.packageName}")
        view.context.startActivity(intent)
    }
}