fun main(){
    println("Radius?")
    //val line : String = readLine()!!
    //val radius: Float = line.toFloat() 
    
    val radius: Float = readLine()!!.toFloat()
    val area: Double = circleArea(radius)
    
    println("Circle Area = " + area)
}

fun circleArea(r : Float) : Double{
    val a : Double = 3.14 * r * r
    return a
}