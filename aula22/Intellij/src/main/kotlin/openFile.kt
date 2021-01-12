fun main(){
    println("File")

    val lines = readLines()

    val linesFiltered : List<String> = lines.filter {it.contains( "programas")}
    linesFiltered.forEach {println(it)}

    println("Print List")

    printList(linesFiltered)
    //lines.filter {it.contains( "programas")}.forEach {println(it)}

}

fun printList(lines : List<String>){
    var idx = 0
    while(idx < lines.size){
        println(lines[idx])
        ++idx //idx = idx + 1
     }
}

//size 4
//idx =0
//idx =1
//idx =2
//idx =3
//idx = 4 sai

fun readLines():List<String>{

    var lines : List<String> = emptyList()
    var line : String? = readLine()
    while(line != null){
        lines = lines + line
        line  = readLine()
    }
    return lines

}