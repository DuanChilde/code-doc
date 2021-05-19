package com.github.duanchilde.codedoc.services

import com.github.duanchilde.codedoc.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
