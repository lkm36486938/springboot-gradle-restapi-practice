package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = RestapiExampleApplication.class) // ��θ� ������ִ� ������ com.example.demo �� ��Ʈ�����̹Ƿ� ���� �����൵ �Ǵ°Ű���
public class RestapiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiExampleApplication.class, args);
	}

}
