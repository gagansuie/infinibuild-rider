package com.jetbrains.rider.plugins.infinibuild

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import kotlinx.coroutines.*
import org.http4k.client.OkHttp
import org.http4k.core.Method
import org.http4k.core.Request

class BuildAction() : AnAction() {

    @OptIn(DelicateCoroutinesApi::class)
    override fun actionPerformed(p0: AnActionEvent) {
        GlobalScope.launch(Dispatchers.Main) {
            val client = OkHttp()
            val response = client(Request(Method.GET, Constants.BASE_URL))
//            withContext(Dispatchers.IO) {
//                Thread.sleep(5000)
//            }
//            Utils.uploadFiles(Constants.BASE_URL, arrayOf())
            Messages.showMessageDialog(
                p0.project,
                response.bodyString(),
                "Response",
                Messages.getInformationIcon()
            )
        }
    }
}