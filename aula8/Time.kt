data class Time(val hours : Int, val minutes : Int, val seconds : Int)

fun main(){

    val t1 : Time = Time(1,2,3)
    val t2 : Time = Time(9,7,4)

    println(t1.hours) // 1
    println(t1.minutes) // 2
    println(t1.seconds) // 3

    println(t2.hours) // 9
    println(t2.minutes) // 7
    println(t2.seconds) // 4

    val t3 : Time = t1

    println(t3.hours) // 1
    println(t3.minutes) // 2
    println(t3.seconds) //3

    println(t1.toString() + t2)

}