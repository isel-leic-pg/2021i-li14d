fun doOperation(operation : Char){
    val op1 : Int = readInt("Valor 1 ?")
    val op2 : Int = readInt("Valor 2 ?")
    val res : Int = if(operation == '+') op1 + op2 else op1 - op2
    println(" $op1 $operation $op2 = $res")
}

fun main(){
    doOperation('+')
    doOperation('-')
}