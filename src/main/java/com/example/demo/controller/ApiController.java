package com.example.demo.controller;

import org.springframework.http.HttpStatus; // Http status 를 주기위함 (200, 404, ... )
import org.springframework.web.bind.annotation.RequestMapping; // 매핑주소랑 메서드
import org.springframework.web.bind.annotation.RestController; // 레스트 컨트롤러임을 명시
import org.springframework.web.bind.annotation.RequestMethod; // 리퀘스트 매서드 타입정의 
import org.springframework.web.bind.annotation.ResponseStatus; // 상태값 

@RestController
public class ApiController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String hello() {
        return "Hello world!";
    }
	
}
