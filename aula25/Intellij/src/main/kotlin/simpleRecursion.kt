fun main(){
    println(f(0))
}

fun f(i : Int) : Int{
    if(i == 3) return 1;
    val res : Int = f(i+1)
    return res + 1
}