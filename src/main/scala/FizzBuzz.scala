object FizzBuzz {

  def isDivisibleBy3(number: Int): Boolean = {
    number % 3 == 0
  }

  def isDivisibleBy5(number: Int): Boolean = {
    number % 5 == 0
  }

  def isDivisibleBy15(number: Int): Boolean = {
    isDivisibleBy3(number) && isDivisibleBy5(number)
  }

  def result(num: Int): String = (isDivisibleBy3(num), isDivisibleBy5(num)) match {
    case (true, true) => "FizzBuzz"
    case (true, false) => "Fizz"
    case (false, true) => "Buzz"
    case (false, false) => num.toString
  }

}
