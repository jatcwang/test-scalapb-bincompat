package custom

import custom.hello.Person

object HelloWorld extends App {
  println("Hello com.example.scalapb!")

  val v = Person("asdf", 5)


  v match {
    case Person("asdf", 5) =>
  }
}
