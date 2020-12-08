package com.website.batch;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;


@MapperScan("com.myself.crawler.batch.mapper")
@SpringBootTest
class BatchApplicationTests {


	@Test
	void contextLoads() {
		System.out.println("hello world!");
	}

}
