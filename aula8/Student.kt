

data class Student(val name : String, val number : Int)

fun main(){

    val s1 : Student = Student("Filipe", 48735)
    val s2 : Student = Student("Joana", 48300)

    println(s1.name)
    println(s1.toString())

}