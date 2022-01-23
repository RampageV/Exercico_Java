package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static util.DesafioUlti.*;
public class Hooks {

	@Before()
	public void setup() {
		acessarSistema();
	}
	
	@After()
	public void tearDown() {
	
	}
}
