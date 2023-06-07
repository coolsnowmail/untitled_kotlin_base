import spaceships.SpaceShip
import java.io.File


fun main(args: Array<String>) {
    val money = Money(100000000)
    val jeliry = Jeliry("Ring")

//    val case = Case<Money, Double>(money, 1000.2)
//    sayHi("123")
//    sayHi(money)
//    sayHi(jeliry)


    sayHi(Case(Money(100), "USD "))

}


fun <T> sayHi(item: T) {
    println("Hi $item")
}

