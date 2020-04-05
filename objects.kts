/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

open class instance() {
    open fun abc() {
        println("Not OK")
    }
}

class objects(var m: String, var n: Int) : instance() {
    var msg: String
    var number: Int
    /*constructor(m: String, n: Int) {
        this.msg = m
        this.number = n    
    }*/
    init {
        this.msg = m
        this.number = n
    }
    override fun abc() {
        println("OK")
    }
    fun printMessage(message: String) {
        println(message + this.msg)
    }

    fun returnValues(): Int {
        return this.number
    }
}

val obj = objects("abc", 0)
obj.printMessage("ABC ")
println(obj.returnValues())