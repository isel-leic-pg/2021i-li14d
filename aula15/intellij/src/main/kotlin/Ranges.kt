fun readInt(text : String) : Int{
    print(text)
    return readLine()!!.toInt()
}

fun main(){

    val i : Int = readInt("Valor ?")

    println( i >= 1 && i <=10) //[1,10]
    println( i in 1..10) //[1,10]
    println( i in 1 until 10) //[1,10[

    val c : Char = readLine()!![0]

    println(if(c in 'A'..'Z' || c in 'a'..'z') "Letra" else "Nao e Letra")

}