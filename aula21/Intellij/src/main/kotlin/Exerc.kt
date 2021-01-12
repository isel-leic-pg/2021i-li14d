

fun main(){
    val l : List<Int> = listOf(1,2,3)
    println(doubleEach(l))
}


fun doubleEach(l: List<Int>) : List<Int> {
    var newList : List<Int> = emptyList()
    l.forEach {i -> newList = newList + 2*i}
    return newList
}

fun doubleEachMap(l: List<Int>) : List<Int> = l.map {i -> 2*i}
