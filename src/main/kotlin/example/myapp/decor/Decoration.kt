package example.myapp.decor

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver:
String){
}
fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
// Assign all properties to variables.
    val (rock, _, diver) = d5
    println(rock)
    println(diver)
}
fun main(){
    makeDecorations()
}