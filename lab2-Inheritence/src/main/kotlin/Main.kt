//superclass
open class Bird{
    var color="green"
    var type=""
}

//subclass
class Parrot:Bird(){
    fun myFunction(){
        println(color)
    }
}
fun main(){
    var obj1 = Parrot ()
    println(obj1.color)
}