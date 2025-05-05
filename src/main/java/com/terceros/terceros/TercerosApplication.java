package com.terceros.terceros;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@RestController
public class TercerosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TercerosApplication.class, args);
	}

	@RequestMapping(value="/", method=RequestMethod.GET)
    public String Hello() {
        // The response will include the return value
        return "Terceros API";
    }


}