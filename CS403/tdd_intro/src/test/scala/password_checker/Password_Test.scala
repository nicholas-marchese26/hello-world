package password_checker
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._
class Password_Test extends AnyFunSpec with Matchers {
    describe("A password checker") {
        describe("determines proper length") {
            it("rejects passwords that are less than 6 characters") {
                val tooShort = "abcdeihjg"
                val longEnough = "abcdef"
                val evenLonger = "abcdefghi"
                Password.isValid(tooShort)
                Password.isValid(longEnough)
                Password.isValid(evenLonger)
            }
        }
    }
}