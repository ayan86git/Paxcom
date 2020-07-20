package com.paxcom.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.paxcom.task.services"})
public class PaxcomRoundUpDownApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaxcomRoundUpDownApplication.class, args);
	}

}
