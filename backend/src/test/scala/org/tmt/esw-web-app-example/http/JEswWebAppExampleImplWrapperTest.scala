package org.tmt.esw-web-app-example.http

import java.util.concurrent.CompletableFuture

import org.mockito.MockitoSugar.{mock, verify, when}
import org.scalatest.concurrent.ScalaFutures.convertScalaFuture
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.tmt.esw-web-app-example.core.JEswWebAppExampleImpl
import org.tmt.esw-web-app-example.core.models.GreetResponse

class JEswWebAppExampleImplWrapperTest extends AnyWordSpec with Matchers {

  "EswWebAppExampleImplWrapper" must {
    "delegate sayBye to JEswWebAppExampleImpl.sayBye" in {
      val jEswWebAppExampleImpl       = mock[JEswWebAppExampleImpl]
      val esw-web-app-exampleImplWrapper = new JEswWebAppExampleImplWrapper(jEswWebAppExampleImpl)

      val esw-web-app-exampleResponse = mock[GreetResponse]
      when(jEswWebAppExampleImpl.sayBye()).thenReturn(CompletableFuture.completedFuture(esw-web-app-exampleResponse))

      esw-web-app-exampleImplWrapper.sayBye().futureValue should ===(esw-web-app-exampleResponse)
      verify(jEswWebAppExampleImpl).sayBye()
    }
  }
}
