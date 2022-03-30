package oz.sample.demoroutingfunction;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoRoutingFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRoutingFunctionApplication.class, args);
	}
	
	
	@Bean
	public Function<String, String> uppercase() {
		return v -> v.toUpperCase();
	}
}
