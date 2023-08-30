package com.nisaefendioglu.routes

import com.nisaefendioglu.data.model.Alf
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private const val BASE_URL = "http://192.168.1.33:8100"
private val alf = listOf(
    Alf("$BASE_URL/alf/alf1.jpeg"),
    Alf("$BASE_URL/alf/alf2.jpeg"),
    Alf("$BASE_URL/alf/alf3.jpeg"),
    Alf("$BASE_URL/alf/alf4.jpeg"),
    Alf("$BASE_URL/alf/alf5.jpeg"),
    Alf("$BASE_URL/alf/alf6.jpeg"),
    Alf("$BASE_URL/alf/alf7.jpeg"),
    Alf("$BASE_URL/alf/alf8.jpeg"),
    Alf("$BASE_URL/alf/alf9.jpeg"),
    Alf("$BASE_URL/alf/alf10.jpeg"),
    Alf("$BASE_URL/alf/alf11.jpeg"),
    Alf("$BASE_URL/alf/alf12.jpeg"),
    Alf("$BASE_URL/alf/alf13.jpeg"),
    Alf("$BASE_URL/alf/alf14.jpeg"),
    Alf("$BASE_URL/alf/alf15.jpeg"),
    Alf("$BASE_URL/alf/alf16.jpeg"),
    Alf("$BASE_URL/alf/alf17.jpeg"),
    Alf("$BASE_URL/alf/alf18.jpeg"),
    Alf("$BASE_URL/alf/alf19.jpeg"),
    Alf("$BASE_URL/alf/alf20.jpeg"),
    Alf("$BASE_URL/alf/alf21.jpeg"),
    Alf("$BASE_URL/alf/alf22.jpeg"),
    Alf("$BASE_URL/alf/alf23.jpeg"),
    Alf("$BASE_URL/alf/alf24.jpeg")
)


fun Route.randomAlf(){
    get("/randomalf"){
        call.respond(
            HttpStatusCode.OK,
            alf.random()
        )

    }
}