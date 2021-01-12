
fun main(){

    val l1 : List<Int> = listOf(6,10,5,7)
    val sum = sumAll(l1)
    println(sum)//28

    val sumAllUsingFold = l1.fold(0, { acc,e ->  acc + e})
    println(sumAllUsingFold)

    val sumEven = sumAllEven(l1)
    println(sumEven)

    val c : Int = l1.random()
    println(c)


}

fun sumAll(l : List<Int>) : Int{
    var acc : Int = 0
    l.forEach({ e -> acc = acc + e})
    return acc
}



// 6 ret 0 + 6
//10 ret 6 + 10
//5 ret 16 + 5
//7 ret 21 + 7

fun sumAllEven(l : List<Int>) : Int{
    var acc : Int = 0
    l.forEach({ e -> acc = if(e % 2 ==0) acc + e else acc})
    return acc
}