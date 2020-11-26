fun doOperation(operator: Char, operation : (Int,Int)->Int){
    val op1 : Int = readInt("Valor 1 ?")
    val op2 : Int = readInt("Valor 2 ?")
    val res : Int = operation(op1, op2)
    println(" $op1 $operator $op2 = $res")
}

fun main(){

    val addition : (Int,Int)->Int = ::add
    val subtraction : (Int,Int)->Int = { a : Int, b : Int -> a-b}

    doOperation('+', addition)
    doOperation('-', subtraction)
    doOperation('*', { a : Int, b : Int -> a * b})
    doOperation('/', {a : Int, b : Int -> a / b})
    doOperation('%', {a : Int, b : Int -> a % b})
}

fun add(a : Int, b : Int) : Int = a+b
fun sub(a : Int, b : Int) : Int = a-b
fun mul(a : Int, b : Int) : Int = a*b
fun div(a : Int, b : Int) : Int = a/b
fun rem(a : Int, b : Int) : Int = a%b