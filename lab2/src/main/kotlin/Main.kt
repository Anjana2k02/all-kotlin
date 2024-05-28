class Bird{   //object
    var type=""
    var color=""
}


class Dog(var type: String, var color: String) //primary constructer {assign value to object}
fun main(){
    var b1 = Bird()
    b1.type = "parrot"
    b1.color = "Green"
    println(b1.type)
    println(b1.color)

    var d1 = Dog("BullMustif", "Brown")
    var d2 = Dog("Dalmantion" , "Black , White")

    println(d1)
    println(d2)
    println(d1.type)
    println(d2.color)
}
