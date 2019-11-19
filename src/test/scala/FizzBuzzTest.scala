import org.scalatest.FunSpec

class FizzBuzzTest extends FunSpec{
  describe("#result") {
    it("should return 'fizz' when number is 3") {
      assert(FizzBuzz.result(3) === "Fizz")
    }
    it("should return the same number when number is not 3") {
      assert(FizzBuzz.result(5) === "5")
    }
  }
}
