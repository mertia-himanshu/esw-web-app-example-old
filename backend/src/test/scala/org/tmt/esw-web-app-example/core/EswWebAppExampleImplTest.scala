package org.tmt.esw-web-app-example.core

import org.scalatest.concurrent.ScalaFutures.convertScalaFuture
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.tmt.esw-web-app-example.core.models.{AdminGreetResponse, GreetResponse, UserInfo}

class EswWebAppExampleImplTest extends AnyWordSpec with Matchers {

  "EswWebAppExampleImpl" must {
    "greeting should return greeting response of 'Hello user'" in {
      val esw-web-app-exampleImpl = new EswWebAppExampleImpl()
      esw-web-app-exampleImpl.greeting(UserInfo("John", "Smith")).futureValue should ===(GreetResponse("Hello user: John Smith!!!"))
    }

    "adminGreeting should return greeting response of 'Hello admin user'" in {
      val esw-web-app-exampleImpl = new EswWebAppExampleImpl()
      esw-web-app-exampleImpl.adminGreeting(UserInfo("John", "Smith")).futureValue should ===(AdminGreetResponse("Hello admin user: John Smith!!!"))
    }
  }
}
