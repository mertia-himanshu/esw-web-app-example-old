package org.tmt.esw-web-app-example

import akka.http.scaladsl.server.Route
import esw.http.template.wiring.ServerWiring
import org.tmt.esw-web-app-example.core.{JEswWebAppExampleImpl, EswWebAppExampleImpl}
import org.tmt.esw-web-app-example.http.{JEswWebAppExampleImplWrapper, EswWebAppExampleRoute}

class EswWebAppExampleWiring(val port: Option[Int]) extends ServerWiring {
  override val actorSystemName: String = "esw-web-app-example-actor-system"

  lazy val jEswWebAppExampleImpl: JEswWebAppExampleImpl = new JEswWebAppExampleImpl(jCswServices)
  lazy val esw-web-app-exampleImpl               = new EswWebAppExampleImpl()
  lazy val esw-web-app-exampleImplWrapper        = new JEswWebAppExampleImplWrapper(jEswWebAppExampleImpl)

  import actorRuntime.ec
  override lazy val routes: Route = new EswWebAppExampleRoute(esw-web-app-exampleImpl, esw-web-app-exampleImplWrapper, securityDirectives).route
}
