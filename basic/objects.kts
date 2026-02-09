/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

 /*
private -> Visível apenas dentro da classe
protected -> Funciona como o "private", mas é visível em subclasses
public -> Visível em todo lugar, caso não seja definido é o padrão.
internal -> Lembra o Public, mas sua visibilidade é
restringida ao módulo, sendo então visível dentro de um
mesmo módulo.
*/

open class instance() {
    open fun abc() {
        println("Not OK")
    }
}

class objects(var m: String, var n: Int) : instance() {
    var msg: String
    var number: Int
    internal var value: Int = 0
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