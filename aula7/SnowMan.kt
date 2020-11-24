import pt.isel.canvas.*

fun drawTriangle(cv : Canvas, p1x : Int, p1y : Int, p2x : Int, p2y : Int, p3x : Int, p3y : Int){
    //usar cv.drawLine para ligar os pontos
    cv.drawLine(p1x,p1y,p2x,p2y)
    //...
}

fun drawSnowman(cv : Canvas){
    //cv.drawTriangle
    //cv.drawCircle
    //...
}


fun main() {
    onStart {
        val cv = Canvas(400, 600)
        drawTriangle(cv, 50,50,0, 100, 100, 100)
        //...
    }
    onFinish {
        // ...
    }
}


