import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}

class SamplePluginTest extends JUnit4(SamplePluginSpec)

object SamplePluginRunner extends ConsoleRunner(SamplePluginSpec)

object SamplePlugin extends Specification {
 "This wonderful system" should {
    "save the world" in {
      val list = Nil
      list must beEmpty
    }
  }

}
