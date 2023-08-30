package com.nisaefendioglu.plugins

import com.nisaefendioglu.routes.randomAlf
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        randomAlf()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
