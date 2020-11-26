import pt.isel.canvas.*


fun main() {
    onStart {
        val cv : Canvas = Canvas(300, 300, BLACK)
        var counter = 0
        cv.drawText(0,cv.height/2, counter.toString(), WHITE, 100)

        cv.onTimeProgress(1000){
            counter = counter + 1
            cv.erase()
            cv.drawText(0,cv.height/2, counter.toString(), WHITE, 100)
        }
    }
    onFinish {
        // ...
    }
}