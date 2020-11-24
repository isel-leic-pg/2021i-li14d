//Para compilar kotlinc PGGrade Input.kt

fun main(){

    /*println("Ficha1?")
    val f1 : Int = readLine()!!.toInt()
    println("Ficha2")
    val f2 : Int = readLine()!!.toInt()
    println("Ficha3?")
    val f3 : Int = readLine()!!.toInt()

    println("Teorica?")
    val t : Int = readLine()!!.toInt()
    println("Pratica?")
    val p : Int = readLine()!!.toInt()*/

    //O valores obtidos do utlizador poderiam ser Reais
    //Para "arrendondar" apenas estamos a usar 0.5 que tem as limitações faladas na aula

    val f1 : Int = readInt("Ficha1?")
    val f2 : Int = readInt("Ficha2?")
    val f3 : Int = readInt("Ficha3?")
    val p : Int = readInt("Pratica?")
    val t : Int = readInt("Teorica?")

    val grade : Double = ((f1+f2+f3)/3.0 * 0.2 + t * 0.4 + p * 0.4) + 0.5

    println("Nota de programacao " + grade.toInt())
}

