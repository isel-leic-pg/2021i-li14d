import pt.isel.canvas.*

/**
* LaserBlast implementation without extension functions
* */

fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, BLACK)
        var game : Game = startGame(cv.width, cv.height)
        draw(cv, game)

        cv.onMouseMove { me ->
            game = moveCannon(me.x, me.y, game)
        }

        cv.onMouseDown { me ->
            game = enableCannon(me.x, me.y, game)
            cv.onTime( 100){
                game = disableCannon(game)
            }
        }

        cv.onTimeProgress( 10){
            game = step(game)
            draw(cv, game)
        }

        cv.onKeyPressed {
            game = addUfo(game)
        }
    }
    onFinish {

    }
}


