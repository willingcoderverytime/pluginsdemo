package com.github.willingcoderverytime.pluginsdemo.services

import com.intellij.openapi.project.Project
import com.github.willingcoderverytime.pluginsdemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
