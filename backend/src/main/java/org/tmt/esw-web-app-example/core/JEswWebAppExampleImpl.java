package org.tmt.esw-web-app-example.core;

import esw.http.template.wiring.JCswServices;
import org.tmt.esw-web-app-example.core.models.GreetResponse;

import java.util.concurrent.CompletableFuture;

public class JEswWebAppExampleImpl {
  JCswServices jCswServices;

  public JEswWebAppExampleImpl(JCswServices jCswServices) {
    this.jCswServices = jCswServices;
  }

  public CompletableFuture<GreetResponse> sayBye() {
    return CompletableFuture.completedFuture(new GreetResponse("Bye!!!"));
  }

}
