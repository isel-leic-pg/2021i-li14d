import pt.isel.canvas.*

fun drawCounter(cv : Canvas, counter : Int){
    cv.erase()
    cv.drawText(0,cv.height/2, counter.toString() , WHITE, 100)
}

fun main() {
    onStart {
        val cv: Canvas = Canvas(300, 300, BLACK)
        var counter : Int = 0
        drawCounter(cv,counter)

        cv.onTimeProgress(1000){
            counter = counter + 1
            drawCounter(cv,counter)
        }
    }

    onFinish { }
}