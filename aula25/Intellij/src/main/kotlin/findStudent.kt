data class Student(val number: Int, val name : String )

fun main(){
    val students = listOf(Student(1,"name1"),
                          Student(2,"name2"),
                          Student(3,"name3"))

    println(find(students){it.name=="name2"})
    println(find(students){it.number==1})
    println(find(students){it.number==5})

}


fun find(students : List<Student>, predicate : (Student) -> Boolean) :Student? {

    for(i in students.indices){
        if(predicate(students[i])) return students[i]
    }
    return null
}