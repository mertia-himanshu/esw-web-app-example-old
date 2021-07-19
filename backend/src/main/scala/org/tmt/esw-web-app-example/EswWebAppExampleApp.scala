package org.tmt.esw-web-app-example

import caseapp.core.RemainingArgs
import csw.location.api.models.Metadata
import esw.http.template.wiring.ServerApp
import EswWebAppExampleAppCommand.StartCommand

object EswWebAppExampleApp extends ServerApp[EswWebAppExampleAppCommand] {
  override def appName: String    = getClass.getSimpleName.dropRight(1)

  override def run(command: EswWebAppExampleAppCommand, remainingArgs: RemainingArgs): Unit =
    command match {
      case StartCommand(port) =>
        val wiring = new EswWebAppExampleWiring(port)
        start(wiring, Metadata.empty)
    }
}
