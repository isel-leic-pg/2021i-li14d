fun readInt(text : String) : Int{
    print(text)
    return readLine()!!.toInt()
}


fun main(){

    doOp('*') { a: Int, b: Int ->
        println("Vou fazer a multiplicação")
        a * b
    }
}

typealias Operation = (Int,Int) -> Int

fun doOp(operator : Char, operation : Operation){
    val op1 : Int = readInt("Valor 1?")
    val op2 : Int = readInt("Valor 2?")
    val res : Int = operation(op1, op2)
    println(" $op1 $operator $op2 = $res ")
}