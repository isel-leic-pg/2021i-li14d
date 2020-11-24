fun main(){
    //                          0  1  2  3
    val l1 : List<Int> = listOf(6, 10, 5 ,7)

    println(l1.size) //4
    println(l1[0]) //1
    println(l1[3]) //4

    l1.forEach(::printDouble)

    val l2 : List<Char> = listOf('a', 'b', 'c' ,'d', 'e')

    println(l2.size) //5
    println(l2[1]) //b
    println(l2[4]) //e

    l2.forEach(::printCharAndCode)

    val l3 : List<Int> = l1 + 9 //listOf(6, 10 , 5 , 7 , 9)
    val l4 : List<Int> = l1 - 6//listOf(10 , 5 , 7)
    val l5 : List<Int> = l1 - 4//listOf(6, 10 , 5 , 7)

    println(l3.toString())
    println(l4.toString())
    println(l5.toString())



}

fun printDouble(i :Int){
    println(" 2*${i} = ${i}")
}


fun printCharAndCode(ch :Char){
    println(" $ch = ${ch.toInt()}")
}