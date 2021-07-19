package org.tmt.esw-web-app-example.core;

import esw.http.template.wiring.JCswServices;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.scalatestplus.junit.JUnitSuite;
import org.tmt.esw-web-app-example.core.models.GreetResponse;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.MatcherAssert.assertThat;

public class JEswWebAppExampleImplTest extends JUnitSuite {

  @Test
  public void shouldCallBye() throws ExecutionException, InterruptedException {
    JCswServices mock = Mockito.mock(JCswServices.class);
    JEswWebAppExampleImpl jEswWebAppExample = new JEswWebAppExampleImpl(mock);
    GreetResponse greetResponse = new GreetResponse("Bye!!!");
    assertThat(jEswWebAppExample.sayBye().get(), CoreMatchers.is(greetResponse));
  }
}
