package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import application.PrimeiroEscolaDeTiApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PrimeiroEscolaDeTiApplication.class)
@WebAppConfiguration
public class PrimeiroEscolaDeTiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
