import pt.isel.canvas.Canvas
import pt.isel.canvas.RED
import pt.isel.canvas.WHITE

data class Cannon(val x : Int, val  y: Int, val active : Boolean)

fun move(x : Int, y : Int, c: Cannon) : Cannon{
    return Cannon(x, y, c.active)
}

fun enableLaser(x : Int, y : Int) : Cannon{
    return Cannon(x, y, true)
}

fun disableLaser(c : Cannon) : Cannon{
    return Cannon(c.x, c.y, false)
}

fun draw(cv : Canvas, c : Cannon){
    if(c.active) {
        drawLaserShoot(cv, c)
    }else {
        drawSight(cv, c)
    }
}

fun drawSight(cv : Canvas, c : Cannon){
    cv.drawLine(c.x -10, c.y, c.x + 10, c.y,  WHITE )
    cv.drawLine(c.x, c.y - 10, c.x, c.y + 10 ,  WHITE)
}

fun drawLaserShoot(cv : Canvas, c : Cannon){
    cv.drawLine(0,0,  c.x, c.y,  RED )
    cv.drawLine(0, cv.height,  c.x, c.y,  RED )
    cv.drawLine(cv.width,0,  c.x, c.y,  RED )
    cv.drawLine(cv.width, cv.height,  c.x, c.y,  RED )
}