import pt.isel.canvas.*

fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, BLACK)
        var game : Game = Game(Cannon(cv.width/2, cv.height/2, false))
        draw(cv, game)

        cv.onMouseMove { me ->
            game = moveCannon(me.x, me.y, game)
            cv.erase()
            draw(cv, game)
        }

        cv.onMouseDown { me ->
            game = enableCannon(me.x, me.y)// Cannon(me.x, me.y, true)
            cv.erase()
            draw(cv, game)
            cv.onTime(2000){
                game = disableCannon(game)//Cannon(cannon.x, cannon.y, false)
                cv.erase()
                draw(cv, game)
            }
        }
    }
    onFinish {
        // ...
    }
}


