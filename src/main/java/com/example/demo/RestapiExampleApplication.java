package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = RestapiExampleApplication.class) // 경로를 명시해주는 거지만 com.example.demo 가 루트폴더이므로 굳이 안해줘도 되는거같음
public class RestapiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiExampleApplication.class, args);
	}

}
