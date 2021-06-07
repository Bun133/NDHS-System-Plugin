package com.ndsl.ndhs.sysplugin

import com.ndsl.ndhs.NDHS
import com.ndsl.ndhs.plugin.*

class SystemPluginMain(ndhs: NDHS) : NDHSPlugin(ndhs){
    override fun getAll(): MutableList<PluginContent>  = mutableListOf()
    override fun getConfigLoader(): MutableList<PluginConfigLoader>  = mutableListOf()
    override fun getEncoder(): MutableList<PluginEncoder> = mutableListOf()
    override fun getFilters(): MutableList<PluginFilter>  = mutableListOf()
    override fun getTickCallables(): MutableList<PluginTickCallable>  = mutableListOf()
    override fun getTimeLineLoader(): MutableList<PluginTimeLineLoader>  = mutableListOf()
    override fun isEnabled(): Boolean = true
    override fun onRegister(): Boolean {
        return true
    }
}