package com.binam.movie.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes=MovieServiceApplicationTests.class)
//@RunWith(SpringRunner.class)
class MovieServiceApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(MovieServiceApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
