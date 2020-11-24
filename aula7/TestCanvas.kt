import pt.isel.canvas.*

fun main() {
    onStart {
        val cv = Canvas(800, 600)

        cv.drawRect(10,30,50,50)
        cv.drawRect(80,30,50,50, RED, 10)

        cv.drawCircle(100,150,40, BLUE)
        cv.drawArc(300,100, 30, 45, 360, YELLOW)
        cv.drawText(200,200, "HELLO WORLD", CYAN)
        cv.drawLine(400,400, 499,499)

    }
    onFinish {
        // ...
    }
}