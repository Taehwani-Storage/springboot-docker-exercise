package com.example.springbootdocker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
class SpringbootDockerExerciseApplicationTests {

	@Test
	void contextLoads() {
	}

	@GetMapping("/Hello")
	public String[] hello() {
		return new String[] {"Hello", "World"};
	}

}

