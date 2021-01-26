package aula23

enum class Dir { UP, RIGHT, DOWN, LEFT }

fun main(){

    var motion : Dir = Dir.RIGHT
    println(motion.name) // -> RIGHT motion = Dir.UP
    println("$motion = ${motion.ordinal}") // -> UP = 0
    play(motion)
}

fun play(d :Dir){
    when(d) {
        Dir.UP -> println("Move Player UP")
        Dir.DOWN -> println("Move Player Down")
        Dir.LEFT -> println("Move Player Left")
        else -> println("Move Player Right")
    }
}