import spaceships.SpaceShip

fun main(args: Array<String>) {
    val ship1 = SpaceShip("ship1", 500)
    ship1.switchToWarpMode()
    ship1.runSystemDiagnostic()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}