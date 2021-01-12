data class Position(val x : Int = 1, val y : Int = 2)

operator fun Position.plus(v: Velocity) = Position(x + v.dx, y + v.dy)
operator fun Position.plus(p: Position) = Position(x + p.x, y + p.y)

data class Velocity(val dx : Int, val dy : Int)

fun main(){
    val p1 = Position( 4, 6)
    println(p1)//x=4 y=6
    val p2 = Position()
    println(p2) //x=1 y=2
    val p3 = Position(y=6)
    println(p3)//x=1 y=6

    val i1 = Position(y=6).x
    println(i1)//1

    val v1 = Velocity(-1,-2)
    val p4 = Position(p1.x + v1.dx, p1.y + v1.dy)
    println(p4) //x=3 y=4

    val p5 : Position = p1 + v1
    println(p5)

    val p6 : Position = p1 + p3
    println(p6)




}