object Logger2 {
    fun debug(message: String) {
        println("** debug $this $message")
    }

    fun info(message: String) {
        println("** info $this $message")
    }
}

class Invoice {
    companion object Logger3 {
        fun debug(message: String) {
            println("($this) ${message}")
        }
    }

    fun calculate() {
        debug("calculating invoice")
    }
}

fun main() {
    val invoice = Invoice()
    invoice.calculate()

    val invoice2 = Invoice()
    invoice2.calculate()

    Invoice.debug("like a static")

    val hojiakbar = Person()
    hojiakbar.doWork()

    val oydinoy = Person()
    oydinoy.doWork()

    val window = Window()

    window.addMouseListener(object: MouseListener{
        override fun mouseClicked(e: MouseEvent) {

        }

        override fun mouseEntered(e: MouseEvent) {

        }
    })

}

class Person {
    fun doWork() {
        Logger2.debug("some message")
    }
}

class Window {
    fun addMouseListener(listener: MouseListener) {}
}

interface MouseListener {
    fun mouseClicked(e: MouseEvent)
    fun mouseEntered(e: MouseEvent)
}

class MouseEvent {

}