package org.tmt.esw-web-app-example

import caseapp.{CommandName, ExtraName, HelpMessage}

sealed trait EswWebAppExampleAppCommand

object EswWebAppExampleAppCommand {

  @CommandName("start")
  final case class StartCommand(
     @HelpMessage("port of the app")
     @ExtraName("p")
     port: Option[Int]
   ) extends EswWebAppExampleAppCommand

}
