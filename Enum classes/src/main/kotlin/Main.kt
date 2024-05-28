enum class Day(val dayOfWeek: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATARAY(6),
    SUNDAY(7),

}

fun main(){
    val today = Day.THURSDAY
    println("Today is ${today.name}, Which is the ${today.dayOfWeek}th day")

}