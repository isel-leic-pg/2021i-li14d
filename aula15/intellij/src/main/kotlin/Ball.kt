import pt.isel.canvas.Canvas
import pt.isel.canvas.WHITE

data class Ball(val px : Int, val py : Int, val vx :Int, val color : Int = WHITE)

fun Ball.step(maxWidth: Int) :Ball =
    //alterar para usar intervalo
    when{
        this.px + RADIUS > maxWidth -> Ball(this.px - 10, this.py, -10,  this.color)
        this.px - RADIUS < 0 -> Ball(this.px + 10, this.py, 10 ,this.color)
        else -> Ball(this.px + this.vx, this.py, this.vx,  this.color)
    }

fun Canvas.drawBall(b : Ball){
    this.drawCircle(b.px, b.py, RADIUS, b.color)
}