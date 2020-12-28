import pt.isel.canvas.Canvas
import pt.isel.canvas.RED
import pt.isel.canvas.WHITE

data class Cannon(val x : Int, val  y: Int, val active : Boolean)

fun Cannon.move(x : Int, y : Int) : Cannon = Cannon(x, y, active)

fun Cannon.enable() : Cannon = Cannon(x, y, true)

fun Cannon.disable() : Cannon = Cannon(x, y, false)

fun Cannon.draw(cv : Canvas){
    if(active) {
        drawLaserShoot(cv)
    }else {
        drawSight(cv)
    }
}

fun Cannon.drawSight(cv : Canvas){
    cv.drawLine(x -10, y, x + 10, y,  WHITE )
    cv.drawLine(x, y - 10, x, y + 10 ,  WHITE)
}

fun Cannon.drawLaserShoot(cv : Canvas){
    cv.drawLine(0,0,  x, y,  RED )
    cv.drawLine(0, cv.height,  x, y,  RED )
    cv.drawLine(cv.width,0,  x, y,  RED )
    cv.drawLine(cv.width, cv.height,  x, y,  RED )
}