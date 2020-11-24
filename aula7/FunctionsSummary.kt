fun main(){

    funWithoutParameters()
    funWithParameters(1,"2") //Chamada com argumentos posicionais
    funWithParameters( parm2="2", parm1=1) //Chamada com argumentos passados por nome

    val intRet : Int = funReturnsInt()
    println(intRet)
    val stringRet : String = funReturnsString()
    println(stringRet)

    funWithSameName(1)
    funWithSameName(2, "3")
    funWithSameName("4", 5)

    funWithDefaultArgument()
    funWithDefaultArgument("Hello World")

    val intExpRet = funSingleExpression(10)
    println(intExpRet)

}

//Função sem parâmetros
fun funWithoutParameters(){
    println("Function Without Parameters")
    //return Não é necessário
}

//Função com parâmetros
fun funWithParameters(parm1 : Int, parm2: String){
    println("Function With Parameters")
    println("Parameter 1 = ${parm1}")
    println("Parameter 2 = ${parm2}")
}

//Função com retorno

fun funReturnsInt() : Int{
    println("Function that returns an Int")
    return 12
}

fun funReturnsString() : String{
    println("Function that returns a String")
    return "HELLO WORLD"
}

//Função com o mesmo no nome - overload


fun funWithSameName(parm1 : Int){
    println("Function With Same Name one parameter")
    println("Parameter 1 = ${parm1}")
}


fun funWithSameName(parm1 : Int, parm2: String){
    println("Function With Same Name two parameter Int first and String")
    println("Parameter 1 = ${parm1}")
    println("Parameter 1 = ${parm2}")
}


fun funWithSameName(parm1 : String, parm2: Int){

    println("Function With Same Name two parameter String first and Int")
    println("Parameter 1 = ${parm1}")
    println("Parameter 1 = ${parm2}")

}

//Função com argumento por omissão

fun funWithDefaultArgument(parm1 : String = "Default") {

    println("Function With Default Argument")
    println("Parameter 1 = ${parm1}")

}

//Expressão como corpo da função
fun funSingleExpression(v : Int) : Int = v * v


//Não é possivel mudar valor do parâmetro
fun parameterTest(parm1 : Int){
    //parm1 = 12 //Erro de compilação
}