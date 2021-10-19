// https://www.bezkoder.com/spring-boot-jpa-h2-example/
// http://localhost:8081/h2-console/  for Hit H2 db
package com.oneToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
		//System.out.println("OneToOneMappingApplication running................");
	}

}
