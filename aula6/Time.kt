fun toSeconds(h : Int, m : Int, s : Int): Int{
    val r : Int = h * 3600 + m * 60 + s
    return r
}