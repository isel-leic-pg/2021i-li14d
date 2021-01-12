data class Student(val name: String, val livesIn: String = "Lisboa")

fun main(){
    val students : List<Student> = listOf(Student("Ana"),
                                    Student("Marco","Porto"),
                                    Student("Sofia"))
    printStudentsLivingInLisbon(students)


}

fun printStudentsLivingInLisbon(l: List<Student>){
    println("Estudantes a viverem em Lisboa")
    val stdsName = getNameOfStudentsLivingInLisbon(l)
    return stdsName.forEach {println(" Nome : $it")}

    /*l.filter {std -> std.livesIn == "Lisboa"}
        .map {it.name}
        .forEach {println(" Nome : $it")}

     */
}


fun getNameOfStudentsLivingInLisbon(l: List<Student>): List<String> =
    getStudentsLivingIn(l, "Lisboa").map {it.name}


/*{
    val stds = getStudentsLivingIn(l, "Lisboa")
    return stds.map {it.name}

}*/

fun getStudentsLivingIn(l: List<Student>, local : String): List<Student> =
        l.filter {std -> std.livesIn == local}
        //l.filter {it.livesIn == local}