import org.scalatest.FunSpec

class FizzBuzzTest extends FunSpec{
  describe("#isDivisibleBy3") {
    it("returns true if divisible by 3") {
      assert(FizzBuzz.isDivisibleBy3(6) === true)
    }
    it("returns false if not divisible by 3") {
      assert(FizzBuzz.isDivisibleBy3(5) === false)
    }
  }

  describe("#isDivisibleBy5") {
    it("returns true if divisible by 3") {
      assert(FizzBuzz.isDivisibleBy5(15) === true)
    }
    it("returns false if not divisible by 3") {
      assert(FizzBuzz.isDivisibleBy5(7) === false)
    }
  }

  describe("#result") {
    it("returns FizzBuzz if divisible by 15") {
      assert(FizzBuzz.result(30) === "FizzBuzz")
    }
    it("returns Fizz if divisible by 3") {
      assert(FizzBuzz.result(6) === "Fizz")
    }
    it("returns Buzz if divisible by 5") {
      assert(FizzBuzz.result(10) === "Buzz")
    }
    it("returns the number if not divisible 15, 5, or 3") {
      assert(FizzBuzz.result(7) === "7")
    }
  }




}
