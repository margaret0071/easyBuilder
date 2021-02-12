package com.github.margaret0071.easybuilder.services

import com.github.margaret0071.easybuilder.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
