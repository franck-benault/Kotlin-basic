package net.franckbenault

import java.lang.IllegalArgumentException

interface Exp

class Num(val value : Int) : Exp {
    override fun toString(): String {
        return "${value}"
    }
}
class Sum(val left: Exp, val right : Exp) : Exp {
    override fun toString(): String {
        return "(${left}) + (${right})"
    }
}

fun eval(e : Exp) : Int =
    when(e) {
        is Num -> {
            println("Num: ${e.value}")
            e.value
        }
        is Sum -> {
            println("Sum: ${e}")
            eval(e.left) + eval(e.right)
        }
        else -> throw IllegalArgumentException("unknow expression")
    }