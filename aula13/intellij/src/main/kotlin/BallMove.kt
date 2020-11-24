import pt.isel.canvas.*

const val RADIUS : Int = 15

data class Ball(val px : Int, val py : Int, val vx :Int, val color : Int = WHITE)

fun drawBall(c: Canvas, b : Ball){

    c.drawCircle(b.px, b.py, RADIUS, b.color)
}

fun step(maxWidth: Int, b: Ball) :Ball =
    when{
        b.px + RADIUS > maxWidth -> Ball(b.px - 10, b.py, -10,  b.color)
        b.px - RADIUS < 0 -> Ball(b.px + 10, b.py, 10 ,b.color)
        else -> Ball(b.px + b.vx, b.py, b.vx,  b.color)
    }


fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, BLACK)
        var ball1 : Ball = Ball(RADIUS, cv.height/2, 10)
        var ball2 : Ball = Ball(RADIUS, RADIUS, 10)
        drawBall(cv,ball1)
        drawBall(cv,ball2)

        cv.onTimeProgress(50){
            ball1 = step(cv.width, ball1)
            ball2 = step(cv.width, ball2)
            cv.erase()
            drawBall(cv,ball1)
            drawBall(cv,ball2)
        }

    }
    onFinish {
        // ...
    }
}