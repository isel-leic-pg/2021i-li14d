import pt.isel.canvas.Canvas
import pt.isel.canvas.GREEN

const val UFO_WIDTH = 30
const val UFO_HEIGHT = UFO_WIDTH / 10 * 4

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


fun step(maxWidth: Int, maxHeight: Int, u : Ufo) : Ufo =
    when {
        u.x !in 0..maxWidth - u.width -> Ufo(u.x - u.dx, u.y, -u.dx, u.dy, u.width, u.height)
        u.y !in 0..maxHeight - u.height -> Ufo(u.x, u.y - u.dy, u.dx, -u.dy, u.width, u.height)
        else -> Ufo(u.x + u.dx, u.y + u.dy, u.dx, u.dy, u.width, u.height)
    }


fun draw(cv : Canvas, u: Ufo){
    val blockSize = u.width / 10
    cv.drawRect(u.x + blockSize * 2, u.y, blockSize * 6, blockSize, GREEN)
    cv.drawRect(u.x , u.y  + blockSize, u.width, blockSize * 2, GREEN)
    cv.drawRect(u.x + blockSize * 2, u.y + blockSize * 3, blockSize *6, blockSize, GREEN)
}