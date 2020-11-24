
import pt.isel.canvas.*

fun drawTriangle(cv : Canvas, p1x : Int, p1y : Int, p2x : Int, p2y : Int, p3x : Int, p3y : Int){
    cv.drawLine(p1x,p1y,p2x,p2y)
    cv.drawLine(p1x,p1y,p3x,p3y)
    cv.drawLine(p2x,p2y,p3x,p3y)
}

fun drawSnowman(cv : Canvas){
    drawTriangle(cv, 100,50, 50,150, 150, 150 )
    cv.drawCircle(100, 200, 50, RED)
    cv.drawCircle(100, 350, 100, RED)
}

fun main() {
    onStart {
        val cv = Canvas(400, 600)
        drawSnowman(cv)

    }
    onFinish {
        // ...
    }
}


