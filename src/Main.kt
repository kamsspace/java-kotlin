@JvmInline
value class Score(val score: Int) {
    init {
        if (score < 0 || score > 100) throw IllegalArgumentException()
    }
}

class Exam {
    fun score(name: String, studentScore: Score) {

    }

    fun amendScore (id: Int, newScore: Score) {

    }
}


fun main() {

    val simple = object {
        val name = "Jayk"

        fun printValue() {
            println(name)
        }
    }

    println(simple.name)
    simple.printValue()
    val logger: Logger = NullLogger()
    val earth = Planet("Earth", 12742, logger)

    earth.population = 7_000_000_000
    val newPopulation = earth.runPopulationModel(0,1000,100)
    println("new population is $newPopulation")
}