import pt.isel.canvas.Canvas

data class Game(val cannon : Cannon /*lista de ovnis*/)

fun draw(cv: Canvas, g : Game){
    cv.erase()
    draw(cv, g.cannon)
    //draw ovnis
}

fun moveCannon(x: Int, y: Int, g : Game) : Game{
    val c : Cannon = move(x, y, g.cannon)
    return Game(c)
}

fun enableCannon(x: Int, y: Int) : Game{
    val c : Cannon = enableLaser(x, y)
    return Game(c)
}

fun disableCannon(g : Game) : Game{
    val c : Cannon = disableLaser(g.cannon)
    return Game(c)
}

