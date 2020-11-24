fun main(){

    println(">")
    val line1 : String = readLine()!!
    println(">") 
    val line2 : String = readLine()!! 
    
    val op1 : Int = line1.toInt()
    val op2 : Int = line2.toInt()
    
    val add : Int = op1 + op2
    val sub : Int = op1 - op2
    val mul : Int = op1 * op2
    val div : Int = op1 / op2
    val rem : Int = op1 % op2

    println("ADD = " + add)
    println("SUB = " + sub)
    println("MUL = " + mul)
    println("DIV = " + div)
    println("REM = " + rem)
    
}