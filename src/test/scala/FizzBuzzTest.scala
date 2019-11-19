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

}
