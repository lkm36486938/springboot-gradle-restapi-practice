package com.example.demo.controller;

import org.springframework.http.HttpStatus; // Http status �� �ֱ����� (200, 404, ... )
import org.springframework.web.bind.annotation.RequestMapping; // �����ּҶ� �޼���
import org.springframework.web.bind.annotation.RestController; // ����Ʈ ��Ʈ�ѷ����� ���
import org.springframework.web.bind.annotation.RequestMethod; // ������Ʈ �ż��� Ÿ������ 
import org.springframework.web.bind.annotation.ResponseStatus; // ���°� 

@RestController
public class ApiController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String hello() {
        return "Hello world!";
    }
	
}
