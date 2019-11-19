import org.scalatest.FunSpec

class FizzBuzzTest extends FunSpec{
  describe("#result") {
    it("should return 'fizz' when number is 3") {
      assert Fizzbuzz.result(3) === "fizz"
    }
  }
}
