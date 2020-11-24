//Para compilar kotlinc HMSToS.kt Input.kt Time.kt

fun main(){
    /*println("Hours?")
    val hours : Int = readLine()!!.toInt()
    println("Minutes?")
    val minutes : Int = readLine()!!.toInt()
    println("Seconds?")
    val seconds : Int = readLine()!!.toInt()*/

    val hours : Int = readInt("Hours?")
    val minutes : Int = readInt("Minutes?")
    val seconds : Int = readInt("Seconds?")

    //val result : Int = hours * 3600 + minutes * 60 + seconds
    val result : Int =  toSeconds(hours, minutes, seconds)
    println("Total Seconds = " + result) 
}

fun readInt(text : String) : Int{
    println(text)
    val v : Int = readLine()!!.toInt()
    return v
}




