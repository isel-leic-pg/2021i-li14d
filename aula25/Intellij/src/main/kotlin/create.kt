data class A(val x:Int , val y:Int, val z:Int)
fun A.create(x : Int = this.x, y : Int =  this.y, z : Int = this.z) = A(x,y,z)

/*fun A.step() : A{

    if() return this
    return A(1,2,3,)


}*/

fun main(){
    val a1 = A(1,2,3)

    val a2 = A(a1.x,a1.y,7)
    val a3 = a1.create(z=7)
    val a4 = a1.create()

    println(a1)
    println(a1.toString())

}