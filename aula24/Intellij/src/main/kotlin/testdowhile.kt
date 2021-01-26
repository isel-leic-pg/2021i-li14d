package aula23

fun main(){
    val  i = readInt()
    println(i)

}

fun readInt():Int{
    var v = -1
    do{
        println("Introduza valor?")
        v = readLine()!!.toInt()
    }while(v < 0)
    return v
}