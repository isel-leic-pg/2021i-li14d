fun main(){
    val l1 = listOf(5,4,3,2,1)
    println(sort(l1))
    //l1.add(2) erro de compilação


    val l2 = mutableListOf(1,7,3,2,5)
    l2.add(6)
    l2.remove(1)
    println(sortMutable(l1))
}


fun sort(vals : List<Int>) : List<Int>{
    var vl = vals
    var res = emptyList<Int>()
    while(vl.isNotEmpty()){
        val m = min(vl)
        res = res + m
        vl = vl - m
    }
    return res
}

fun sortMutable(vals : List<Int>) : List<Int>{
    val vl : MutableList<Int> = vals.toMutableList()
    var res : MutableList<Int> = mutableListOf()
    while(vl.isNotEmpty()){
        val m = min(vl)
        res.add(m)
        vl.remove(m)
    }
    return res
}

fun min(l : List<Int>) :Int {
    var m = l[0]
    for(idx in 1 until l.size ) {
        m = if(l[idx] < m ) l[idx] else m
    }
    return m
}