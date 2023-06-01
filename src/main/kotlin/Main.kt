import spaceships.SpaceShip
import java.io.File

fun main(args: Array<String>) {
    val file = File("text.txt")
    file.writeToFileAndSend()
    //val ship1 = SpaceShip("ship1", 500)
    //ship1.switchToWarpMode()
    //ship1.runSystemDiagnostic()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}
fun File.writeToFileAndSend() {
    val message = "some message"
    createNewFile()
    writeText(message)
    println("message: \"$message\" added to file $name and send ")
}

