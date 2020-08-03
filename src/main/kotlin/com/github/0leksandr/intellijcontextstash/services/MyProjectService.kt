package com.github.0leksandr.intellijcontextstash.services

import com.intellij.openapi.project.Project
import com.github.0leksandr.intellijcontextstash.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
