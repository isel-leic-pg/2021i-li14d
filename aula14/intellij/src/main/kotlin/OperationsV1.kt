
fun doAdd(){
    val op1 : Int = readInt("Valor 1 ?")
    val op2 : Int = readInt("Valor 2 ?")
    println(" $op1 + $op2 = ${op1 + op2}")

}

fun doSub(){
    val op1 : Int = readInt("Valor 1 ?")
    val op2 : Int = readInt("Valor 2 ?")
    println(" $op1 - $op2 = ${op1 - op2}")
}

fun main(){
    doAdd()
    doSub()
}