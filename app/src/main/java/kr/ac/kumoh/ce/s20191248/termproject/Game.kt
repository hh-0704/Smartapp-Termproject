package kr.ac.kumoh.ce.s20191248.termproject

data class Game(
    val id: Int,
    val title: String,
    val category: String,
    val rating: Int,
    val description: String,
    val image_uri: String,
)
