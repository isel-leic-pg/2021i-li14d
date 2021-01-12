fun main(){
    println(isPrime(4))
}
//[2,n-1]
fun isPrime(n : Int): Boolean{
    var i = 2
    var p = true
    while(p && i < n){
        if(n % i ==0){
            p = false
        }
        ++i
    }
    return p
}

fun isPrimeBreak(n : Int): Boolean{
    var i = 2
    var p = true
    while(i < n){
        if(n % i ==0){
            p = false
            break;
        }
        ++i
    }
    return p
}

fun isPrimeReturn(n : Int): Boolean{
    var i = 2
    while(i < n){
        if(n % i ==0){
            return false
        }
        ++i
    }
    return true
}


/*
n   i    p
4   2    true
         false

 */

/*
n   i    p
7   2    true
    3
    4
    5
    6
    7


 */