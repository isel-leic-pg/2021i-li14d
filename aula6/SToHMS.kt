fun main(){

    println("Total Seconds?")
    val totalSeconds : Int = readLine()!!.toInt()

    val t : Time = toTime(totalSeconds)

    println("Hours = " + t.hours)
    println("Minutes = " + t.minutes)
    println("Seconds = " + t.seconds)
    
}

//TPC passar código abaixo para ficheiro Time.kt

data class Time(val hours : Int, val minutes : Int, val seconds : Int)

fun toTime(ts : Int) : Time{
    
    //Pode ser feito sem o valor remainder
    val hours : Int = ts / 3600
    val remainder : Int = ts % 3600
    val minutes : Int = remainder / 60
    val seconds : Int = remainder % 60

    val tx : Time = Time(hours, minutes, seconds)
    return tx

}