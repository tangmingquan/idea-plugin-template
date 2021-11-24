package com.github.tangmingquan.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.tangmingquan.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
