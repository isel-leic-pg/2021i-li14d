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

 (x,y) width
     --------
     |      |   height
     |      |
     --------
 */
data class Ufo(val x : Int, val y : Int, val dx : Int, val dy : Int, val width : Int, val height : Int, val color :Int)

fun createUfo(maxWidth: Int, maxHeight: Int, c : Int = GREEN) : Ufo =
    Ufo((0.. maxWidth - UFO_WIDTH).random(), (0..maxHeight-UFO_HEIGHT).random(),
            (-2..2).random(),2, UFO_WIDTH ,UFO_HEIGHT, c)


fun step(maxWidth: Int, maxHeight: Int, u : Ufo) : Ufo =
    when {
        u.x !in 0..maxWidth - u.width -> Ufo(u.x - u.dx, u.y, -u.dx, u.dy, u.width, u.height, u.color)
        u.y !in 0..maxHeight - u.height -> Ufo(u.x, u.y - u.dy, u.dx, -u.dy, u.width, u.height, u.color)
        else -> Ufo(u.x + u.dx, u.y + u.dy, u.dx, u.dy, u.width, u.height, u.color)
    }

/*
  ******
**********
**********
**********
  ******
 */

fun draw(cv : Canvas, u: Ufo){
    val blockSize = u.width / 10
    cv.drawRect(u.x + blockSize * 2, u.y, blockSize * 6, blockSize, u.color)
    cv.drawRect(u.x , u.y  + blockSize, u.width, blockSize * 3, u.color)
    cv.drawRect(u.x + blockSize * 2, u.y + blockSize * 4, blockSize *6, blockSize, u.color)
}