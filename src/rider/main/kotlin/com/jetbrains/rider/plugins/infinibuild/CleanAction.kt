package com.jetbrains.rider.plugins.infinibuild

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class CleanAction : AnAction() {
    override fun actionPerformed(p0: AnActionEvent) {
        Messages.showMessageDialog(p0.project, "Hello", "infinibuild", Messages.getInformationIcon())
    }
}