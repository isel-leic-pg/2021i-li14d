import pt.isel.canvas.Canvas

//Extension functions, o uso do this é opcional, só na função draw está a ser usado para efeitos de exemplo

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
fun Game.draw(cv: Canvas){
    cv.erase()
    this.cannon.draw(cv)
    this.ufos.forEach({ufo -> ufo.draw(cv)})
}

/**
 * Moves cannon sight
 * @return the modified game
 */
fun Game.moveCannon(x: Int, y: Int) : Game{
    val c : Cannon = cannon.move(x, y)
    return Game(c, ufos, width, height)
}

/**
 * Enables cannon laser
 * @return the modified game
 */
fun Game.enableCannon() : Game{
    val c : Cannon = cannon.enable()
    return Game(c, ufos, width, height)
}

/**
 * Disable cannon laser
 * @return the modified game
 */
fun Game.disableCannon() : Game{
    val c : Cannon = cannon.disable()
    return Game(c, ufos, width, height)
}

/**
 * Called for every step of the game.
 * Moves all ufos and then checks if the laser hits them
 * @return the modified game
 */
fun Game.step() : Game{
    val movedUfos : List<Ufo> = ufos.map ({ ufo -> ufo.step(width,height)})
    val leftUfos: List<Ufo> = if (cannon.active) movedUfos.filter({ ufo -> !hitsUfo(ufo) }) else movedUfos
    return Game(cannon, leftUfos, width, height)
}

/**
 * Checks if an UFO has been hit.
 * @return true if the laser hits an UFO
 */
fun Game.hitsUfo(ufo : Ufo) : Boolean =
    cannon.x in (ufo.x .. ufo.x + ufo.width) && cannon.y in (ufo.y .. ufo.y + ufo.height)


/**
 * Adds a new Ufo to the game
 * @return the modified game
 */
fun Game.addUfo() : Game{
    val us : List<Ufo> = ufos + createUfo(width, height)
    return Game(cannon, us, width, height)
}


