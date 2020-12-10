import pt.isel.canvas.Canvas
import pt.isel.canvas.GREEN

const val UFO_WIDTH = 30
const val UFO_HEIGHT = UFO_WIDTH / 2

/**
 * UFO information
 * [x,y], [dx,dy], [width], [height]
 * @property [x,y] ufo position
 * @property [dx,dy] ufo  velocity
 * @property [width], [height] the size of the ufo  
 */
data class Ufo(val x : Int, val y : Int, val dx : Int, val dy : Int, val width : Int, val height : Int)

fun createUfo(maxWidth: Int, maxHeight: Int) : Ufo =
    Ufo((0.. maxWidth - UFO_WIDTH).random(), (0..maxHeight-UFO_HEIGHT).random(),
            (-2..2).random(),(-2..2).random(), UFO_WIDTH ,UFO_HEIGHT)


fun Ufo.step(maxWidth: Int, maxHeight: Int) : Ufo =
    when {
        x !in 0..maxWidth - width -> Ufo(x - dx, y, -dx, dy, width, height)
        y !in 0..maxHeight - height -> Ufo(x, y - dy, dx, -dy, width, height)
        else -> Ufo(x + dx, y + dy, dx, dy, width, height)
    }

/*
  ******
**********
**********
**********
  ******
 */
fun Ufo.draw(cv : Canvas){
    val blockSize = width / 10
    cv.drawRect(x + blockSize * 2, y, blockSize * 6, blockSize, GREEN)
    cv.drawRect(x , y  + blockSize, width, blockSize * 3, GREEN)
    cv.drawRect(x + blockSize * 2, y + blockSize * 4, blockSize *6, blockSize, GREEN)
}