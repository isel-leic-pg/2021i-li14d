package aula23

fun main(){
    val l1 = createListRange(20, 25)
    println(l1)

    println(findFor(l1,21))

    val l2 = listOf(10,15,20,5)
    println(l2.minFor())

}

fun createListInt(from : Int, to : Int): List<Int>{
    var res = emptyList<Int>()
    var elem = from
    while(elem <= to){
        res+=elem //res = res + elem
        ++elem
    }
    return res
}

fun createListFor(from : Int, to : Int): List<Int>{
    var res = emptyList<Int>()
    for(elem in from..to){
        res+=elem //res = res + elem
    }
    return res
}

fun createListRange(from : Int, to : Int): List<Int> = (from..to).toList()

// 20, 21, 22, 23, 24, 25         21
fun findWhile(l:List<Int>, elem : Int) :Int?{
    var idx = 0
    while(idx < l.size){
        if(elem == l[idx]) return idx
        ++idx
    }
    return null
}

fun findFor(l:List<Int>, elem : Int) :Int?{
    for(idx in 0 until l.size){
        if(elem == l[idx]) return idx
    }
    return null
}

fun List<Int>.minFor() :Int {
    var m = this[0]
    for(idx in 1 until size ) {
        m = if(this[idx] < m ) this[idx] else m
    }
    return m
}


fun sort(vals : List<Int>) : List<Int>{
    var vl = vals
    var res = emptyList<Int>()
    while(vl.isNotEmpty()){
        val m = vl.minFor()
        res = res + m
        vl = vl - m
    }
    return res
}
// 10,15,20,5

//vl = 10,15,20,5
//res = empty

//m = 5
//res = 5
//vl = 10,15,20

//m=10
//res = 5,10
//vl = 15,20





