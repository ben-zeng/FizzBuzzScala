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

  def result(number: Int): String = {
    val result = if (isDivisibleBy15(number)) "FizzBuzz" else number.toString
    result
  }



}
