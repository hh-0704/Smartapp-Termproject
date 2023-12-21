package kr.ac.kumoh.ce.s20191248.termproject

import retrofit2.http.GET

interface GameApi {
    @GET("game")
    suspend fun getGames(): List<Game>
}