package org.tmt.esw-web-app-example.http

import org.tmt.esw-web-app-example.core.JEswWebAppExampleImpl
import org.tmt.esw-web-app-example.core.models.GreetResponse

import scala.compat.java8.FutureConverters.CompletionStageOps
import scala.concurrent.Future

class JEswWebAppExampleImplWrapper(jEswWebAppExampleImpl: JEswWebAppExampleImpl) {
  def sayBye(): Future[GreetResponse] = jEswWebAppExampleImpl.sayBye().toScala
}
