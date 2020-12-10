import pt.isel.canvas.*

/**
* LaserBlast implementation using extension functions
* */

fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, BLACK)
        var game : Game = startGame(cv.width, cv.height)
        game.draw(cv)

        cv.onMouseMove { me ->
            game = game.moveCannon(me.x, me.y)
        }

        cv.onMouseDown { me ->
            game = game.enableCannon()
            cv.onTime( 100){
                game = game.disableCannon()
            }
        }

        cv.onTimeProgress( 10){
            game = game.step()
            game.draw(cv)
        }

        cv.onKeyPressed {
            game = game.addUfo()
        }
    }
    onFinish {

    }
}


