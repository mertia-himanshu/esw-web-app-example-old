package org.tmt.esw-web-app-example.core

import org.tmt.esw-web-app-example.core.models.{AdminGreetResponse, GreetResponse, UserInfo}

import scala.concurrent.Future

class EswWebAppExampleImpl() {
  def greeting(userInfo: UserInfo): Future[GreetResponse] = Future.successful(GreetResponse(userInfo))

  def adminGreeting(userInfo: UserInfo): Future[AdminGreetResponse] =
    Future.successful(AdminGreetResponse(userInfo))
}
