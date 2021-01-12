fun main(){

   /* println("File")

    val s1 : String? = readLine()
    val s2 : String? = readLine()
    println(s1)
    println(s2)*/



    println("File")

    val lines = readLines()
    //lines.forEach {println(it)}

    /*val linesFiltered = lines.filter {it.contains( "programas")}
    linesFiltered.forEach {println(it)}*/

    lines.filter {it.contains( "programas")}.forEach {println(it)}


}


fun readLines():List<String>{

    var lines : List<String> = emptyList()
    var line : String? = readLine()
    while(line != null){
        lines = lines + line
        line  = readLine()
    }
    return lines

}