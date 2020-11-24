fun main(){
    println("Hours?")
    val hours : Int = readLine()!!.toInt()
    println("Minutes?")
    val minutes : Int = readLine()!!.toInt()
    println("Seconds?")
    val seconds : Int = readLine()!!.toInt()
    
    val result : Int =  toSeconds(hours, minutes, seconds)
    println("Total Seconds = " + result) 
}

fun toSeconds(h : Int, m : Int, s : Int): Int{
    val r : Int = h * 3600 + m * 60 + s
    return r
}