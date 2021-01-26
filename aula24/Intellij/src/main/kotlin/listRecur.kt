package aula23

fun main(args: Array<String>) {
    val lt = listOf(5,10,15,20)
    println(find(lt, 0, 15))

    //printList(lt,0)
    //println(find(listOf(1,2,3), 0, 1))
    //println(findBinary(listOf(1,2,3), 1, 0, 2))
    //println(findBinaryIter(listOf(1,2,3), 1))

}

fun printList(l: List<Int>, i :Int){
    if(i == l.size) return
    println(l[i])
    printList(l, i + 1)
}

fun find(l: List<Int>, i :Int, v: Int): Int?{
    //if(i == l.size) return null
    //if(l[i] == v) return i
    val res = find(l, i + 1, v)
    return res
}

fun findWhen(l: List<Int>, i :Int, v: Int): Int? =
    when {
        i == l.size -> null
        l[i] == v -> i
        else -> findWhen(l, i + 1, v)
    }


fun findBinary(l: List<Int>, v: Int, min : Int, max : Int): Int?{
    if(min > max) return null
    val middle = (min + max)/2
    if(v == l[middle]) return middle
    if(v > l[middle])
        return findBinary(l, v, middle + 1, max)
    else
        return findBinary(l, v, min, middle - 1)
}

fun findBinaryIter(l: List<Int>, v: Int): Int?{
    var min = 0
    var max = l.size-1
    while(min <= max){
        val middle = (min + max)/2
        if(v == l[middle]) return middle
        if(v > l[middle]) min = middle + 1
        else max = middle - 1
    }
    return null
}
