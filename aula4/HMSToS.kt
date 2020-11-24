fun main(){

    println("Hours?")
    val lineHours : String = readLine()!!
    println("Minutes?")
    val lineMinutes : String = readLine()!!
    println("Seconds?")
    val lineSeconds : String = readLine()!!
       
    val hours : Int = lineHours.toInt()
    val minutes : Int = lineMinutes.toInt()
    val seconds : Int = lineSeconds.toInt()

    val result : Int =  toSeconds(hours, minutes, seconds)
    println("Total Seconds = " + result) 
}

fun toSeconds(h : Int, m : Int, s : Int): Int{
    val result : Int = h * 3600 + m * 60 + s
    return result
}