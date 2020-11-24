import pt.isel.canvas.*

const val RADIUS : Int = 30

data class Ball(val px : Int, val py : Int, val color : Int)

fun drawBall(c: Canvas, b : Ball){
    c.erase()
    c.drawCircle(b.px, b.py, RADIUS, b.color)
}

fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, CYAN)
        var ball = Ball(RADIUS, cv.height / 2, GREEN)
        drawBall(cv, ball)

        cv.onKeyPressed { key ->
            println(key.char)
            ball = when(key.char)
            {
                'm' ->  if (ball.px == RADIUS) Ball(cv.width - RADIUS, ball.py, ball.color)
                        else Ball(RADIUS, ball.py, ball.color)
                'c' -> Ball(cv.width / 2 , cv.height/2, GREEN)
                'u' -> Ball(cv.width / 2, RADIUS, RED)
                'd' -> Ball(cv.width / 2, cv.height - RADIUS, BLUE)
                else -> ball
            }
            drawBall(cv, ball)
        }

        cv.onMouseDown { m : MouseEvent ->
            println(" X = ${m.x} Y = ${m.y}")
            ball = Ball(m.x, m.y, YELLOW)
            drawBall(cv, ball)
        }
    }
    onFinish {
        // ...
    }
}