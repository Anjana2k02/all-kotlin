fun main(){
    //when
val number = 3

    val type = when(number){
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        else -> "unknown Number"
    }
    println(type)

    //when adv
    val x = 10

    when {
        x % 2 == 0 -> println("x is even")
        x % 2 != 0 -> println("x is odd")
    }

    when (x) {
        in 1..10 -> println("x is in the range 1 to 10")
        !in 11..20 -> println("x is not in the range 11 to 20")
        else -> println("x is outside the considered ranges")
    }
    //for loops
    for(i in 1 .. 10){
        println(i)
    }

    for(i in 1 until 10){
        println(i)
    }

    for(i in 5 .. 20 step 5){
        println(i)
    }

    //continue

    println("continue")
    for(i in 1 .. 10 step 2){

        if(i == 5){
            continue
        }
        println(i)
    }

    //break
    println("Break")
    for(i in 1 .. 10 step 2){

        if(i == 5){
            break
        }
        println(i)
    }

}

