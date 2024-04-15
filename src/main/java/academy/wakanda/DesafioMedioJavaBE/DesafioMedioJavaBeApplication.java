package academy.wakanda.DesafioMedioJavaBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class DesafioMedioJavaBeApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Pessoa Endereco - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioMedioJavaBeApplication.class, args);
	}

}
