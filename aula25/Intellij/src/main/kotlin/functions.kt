fun main(){

    val l = listOf(4,2,3,1)

    println(l.sum())
    println(l.reduce{acc, i -> acc + i})
    println(l.fold(0){acc, i -> acc + i})
    println(l.any{i -> i==2})

    val s = "123"
    s.forEach{println(it)}
    val i = s.toInt()
}