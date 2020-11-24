fun main(){

    val line : String = readLine()!!
    val symb : Char = line[0]

    //TPC isLetter é true quando symb é letra minuscula ou maiuscula
    val isLetter : Boolean = symb >= 'A' && symb <= 'Z'
    val isDigit : Boolean = symb >= '0' && symb <= '9'

    println("Is Letter = " + isLetter)
    println("Is Digit = " + isDigit)
}
