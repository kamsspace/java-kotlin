
abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}


open class Planet(name: String, diameter: Int, val logger: Logger) : SpaceBody(name) {
    open var population: Long = 0
    init {
        println("We've been created with name: $name")
        population = 0
    }

    val radius: Int = diameter/2
    constructor(name: String, diameter: Int, gaseous: Boolean, logger: Logger) : this(name, diameter, logger)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean, logger: Logger) : this(name, diameter, logger)

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        // do some work
    }
    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        logger.debug("Starting the model")
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }

    override fun calculateMotion() {

    }

}

class HabitablePlanet(name: String, diameter: Int, logger: Logger) : Planet(name, diameter, logger) {
    override var population: Long = 0

    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0
    }

    override fun calculateMotion() {

    }
}