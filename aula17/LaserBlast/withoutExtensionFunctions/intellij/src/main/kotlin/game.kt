import pt.isel.canvas.Canvas

/**
 * Game information
 * [cannon], [ufos], [width], [height]
 * @property cannon the player cannon
 * @property ufos the ufos of the game
 * @property [width], [height] the size of the game
 */
data class Game(val cannon : Cannon, val ufos : List<Ufo>, val width : Int, val height : Int)

/**
 * Creates the starting game with an empty list of ufos
 * @param [width] width of the game
 * @param [height] height of the game
 */
fun startGame(width : Int, height : Int):Game{
    val c = Cannon(width/2, height/2, false)
    return Game(c, listOf(), width, height)
}

/**
 * Draws all elements of the game
 * @param [canvas]
 * @param [g] game to draw
 */
fun draw(cv: Canvas, g : Game){
    cv.erase()
    draw(cv, g.cannon)
    g.ufos.forEach({ufo -> draw(cv,ufo)})
}

/**
 * Moves cannon sight
 * @return the modified game
 */
fun moveCannon(x: Int, y: Int, g : Game) : Game{
    val c : Cannon = move(x, y, g.cannon)
    return Game(c, g.ufos, g.width, g.height)
}

/**
 * Enables cannon laser
 * @return the modified game
 */
fun enableCannon(x: Int, y: Int, g : Game) : Game{
    val c : Cannon = enable(x, y)
    return Game(c, g.ufos, g.width, g.height)
}

/**
 * Disable cannon laser
 * @return the modified game
 */
fun disableCannon(g : Game) : Game{
    val c : Cannon = disable(g.cannon)
    return Game(c, g.ufos, g.width, g.height)
}

/**
 * Called for every step of the game.
 * Moves all ufos and then checks if the laser hits them
 * @return the modified game
 */
fun step(g : Game) : Game{
    val movedUfos : List<Ufo> = g.ufos.map ({ ufo -> step(g.width,g.height, ufo)})
    val leftUfos: List<Ufo> = if (g.cannon.active) movedUfos.filter({ ufo -> !hitsUfo(ufo,g) }) else movedUfos
    return Game(g.cannon, leftUfos, g.width, g.height)
}

/**
 * Checks if an UFO has been hit.
 * @return true if the laser hits an UFO
 */
fun hitsUfo(ufo : Ufo, g : Game) : Boolean =
    g.cannon.x in (ufo.x .. ufo.x + ufo.width) && g.cannon.y in (ufo.y .. ufo.y + ufo.height)


/**
 * Adds a new Ufo to the game
 * @return the modified game
 */
fun addUfo(g: Game) : Game{
    val us : List<Ufo> = g.ufos + createUfo(g.width, g.height)
    return Game(g.cannon, us, g.width, g.height)
}


