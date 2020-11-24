import pt.isel.canvas.*

const val RADIUS : Int = 15

data class Ball(val px : Int, val py : Int, val vx :Int, val color : Int = WHITE)

fun Canvas.drawBall(b : Ball){
    this.drawCircle(b.px, b.py, RADIUS, b.color)
}

fun Ball.step(maxWidth: Int) :Ball =
    when{
        this.px + RADIUS > maxWidth -> Ball(this.px - 10, this.py, -10,  this.color)
        this.px - RADIUS < 0 -> Ball(this.px + 10, this.py, 10 ,this.color)
        else -> Ball(this.px + this.vx, this.py, this.vx,  this.color)
    }

fun main() {
    onStart {
        val cv : Canvas = Canvas(1024, 768, BLACK)
        var ball1 : Ball = Ball(RADIUS, cv.height/2, 10)
        var ball2 : Ball = Ball(RADIUS, RADIUS, 10)
        cv.drawBall(ball1)
        cv.drawBall(ball2)

        cv.onTimeProgress(50){
            ball1 = ball1.step(cv.width)
            ball2 = ball2.step(cv.width)
            cv.erase()
            cv.drawBall(ball1)
            cv.drawBall(ball2)
        }

    }
    onFinish {
        // ...
    }
}


