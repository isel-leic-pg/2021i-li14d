fun main(){

    println("Total Seconds?")
    val totalSeconds : Int = readLine()!!.toInt()

    val hours : Int = totalSeconds / 3600
    val remainder : Int = totalSeconds % 3600
    val minutes : Int = remainder / 60
    val seconds : Int = remainder % 60


    println("Hours = " + hours)
    println("Minutes = " + minutes)
    println("Seconds = " + seconds)
    
}