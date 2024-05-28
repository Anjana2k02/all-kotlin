fun main(){

    //Generics

    //immutable
    val immutableList = listOf(1, 2, 3, 4, 5)
    println(immutableList)  // Output: [1, 2, 3, 4, 5]

    val immutableSet = setOf(1, 2, 3, 4, 5)
    println(immutableSet)  // Output: [1, 2, 3, 4, 5]

    val immutableMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(immutableMap)  // Output: {1=One, 2=Two, 3=Three}

    //mutable
    //list
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)  // Output: [1, 2, 3, 4, 5]

    mutableList[0] = 10
    println(mutableList)  // Output: [10, 2, 3, 4, 5]

    //set
    val mutableSet = mutableSetOf(1, 2, 3, 4, 5)
    println(mutableSet)  // Output: [1, 2, 3, 4, 5]

    mutableSet.add(6)
    println(mutableSet)  // Output: [1, 2, 3, 4, 5, 6]

    //map
    val mutableMap = mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(mutableMap)  // Output: {1=One, 2=Two, 3=Three}

    mutableMap[1] = "Uno"
    println(mutableMap)  // Output: {1=Uno, 2=Two, 3=Three}


    //exe
    // Part a: Create a mutable list that contains multiplications of 3 from 0 to 100
    val multiplesOfThree = mutableListOf<Int>()
    for (i in 0..100 step 3) {
        multiplesOfThree.add(i)
    }
    println("Original list: $multiplesOfThree")

    // Part b: Replace all the even numbers in the above list with 999
    for (i in multiplesOfThree.indices) {
        if (multiplesOfThree[i] % 2 == 0) {
            multiplesOfThree[i] = 999
        }
    }

    println("Modified list: $multiplesOfThree")
}