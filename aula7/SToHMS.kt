//Para compilar kotlinc SToHMS.kt Input.kt Time.kt

fun main(){

    /*println("Total Seconds?")
    val totalSeconds : Int = readLine()!!.toInt()*/
    val totalSeconds : Int = readInt("Total Seconds?")

    val t : Time = toTime(totalSeconds)
    
    println("Hours = " + t.hours)
    println("Minutes = " + t.minutes)
    println("Seconds = " + t.seconds)
    println(t)
    
}

fun toTime(ts : Int) : Time{
    
    //Pode ser feito sem o valor remainder
    val h : Int = ts / 3600
    val remainder : Int = ts % 3600
    val m : Int = remainder / 60
    val s : Int = remainder % 60

    val tx : Time = Time(h, m, s)
    return tx

    //return Time(h, m, s)

}


