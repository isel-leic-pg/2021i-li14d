fun main(){

    val c1 : Char = 'A'
    val c2 : Char = 65.toChar()

    println(c1) // A
    println(c1.toInt()) //65
    println(c2) // A

    val c3  : Char = c1 + 2 // 2 + c1 Erro
    println(c3) // B

    val c4  : Char = 'C' - 2  
    println(c4) // A

    val c5 : Char = '\u0041'
    println(c5) // A

    val s : String = "XPTO"
    println(s) //XPTO
    println(s[0]) //X
    println(s[1]) //P
    println(s[2]) //T
    println(s[3]) //O
    println(s.length) //4

    val c6 : Char = s[0]
    println(c6) //X

    val part1 : String = "Hello"
    val part2 : String = "World"

    val concate : String = part1 + part2

    println(concate) //HelloWorld

    val n : Int = 5

    //Expressões embutidas
    val s4 : String = "number = ${c6+1} e ${n}"
    println(s4) //number = Y e 5

    val s5 : String = " \"Hello\" \\"
    println(s5) // "Hello" \

}