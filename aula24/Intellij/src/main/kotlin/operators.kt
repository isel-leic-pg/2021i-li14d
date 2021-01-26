package aula23

fun main(){
    var i1 = 0
    println(++i1) //1
    println(i1)

    var i2 = 0
    println(i2++) //0
    println(i2)   //1

    var i3 = 5
    val i4 = 2 + ++i3 //8
    println(i4)

    var i5 = 5
    val i6 = 2 + i5++ //7
    println(i6)
    println(i5)

    var i7 = 7
    ++i7
    println(i7) //8

    var i8 = 7
    i8++
    println(i8) //8

    var i9 = 9
    i9+=2  //i9 = i9 + 2
    i9-=5  //i9 = i9 - 5
    i9/=7  //i9 = i9 / 7
    i9*=6  //i9 = i9 * 6
    i9%=2  //i9 = i9 % 2


}