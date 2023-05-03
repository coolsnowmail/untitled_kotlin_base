package spaceships

class SpaceShip(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode() {
         println("Переход $name в варп режим")
    }

    fun runSystemDiagnostic() {
         println("Запушенна система диагностики корабля: $name")
    }

}