package aula23

fun main(){
    var b: String? = null // can be set null
    println(b)

    println(if(b !=null) b.length else null)
    println(b?.length) //safe call operator

    println(if(b !=null) b.length else 10)
    println(b?.length?:10) //elvis operator

    b?.let{printlnLength(b.length)}

}

fun printlnLength(l :Int){
    println("Length = $l")
}


