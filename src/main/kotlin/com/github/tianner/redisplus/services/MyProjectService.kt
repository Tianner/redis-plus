package com.github.tianner.redisplus.services

import com.github.tianner.redisplus.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
