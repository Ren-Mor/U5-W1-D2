package com.epicode.U5D1;

import com.epicode.U5D1.entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class U5D1Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(U5D1Application.class, args);

		Menu m = context.getBean(Menu.class);
		m.printMenu();


	}
}
