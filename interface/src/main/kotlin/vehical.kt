interface vehicle {
    fun start()
    fun stop()
}

class car : vehicle {
    override fun start() {

    }

    override fun stop() {

    }
}

fun main(){
    val obj = car()
    obj.start()
    obj.stop()
}