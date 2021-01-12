fun main(){
   f()
}

fun f(){
    var i = 0
    var k = 0
    while( i < 2){
        k = 0
        while(k < 3){
            println("i = $i k = $k")
            ++k
        }
        ++i
    }
}

/*
i  k
0  0
   1
   2
   3
1
   0
   1
   2
   3
2

 */