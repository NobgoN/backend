package com.example.demo.controller;

import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class MainController {
	
	
	
	// 例外処理を検知してJSONで失敗結果を返す
	@ExceptionHandler({ IllegalArgumentException.class })
	public Map<String, String> testExceptionHandle(IllegalArgumentException e) {
		String stackTrace = ExceptionUtils.getStackTrace(e);
		return Map.of("success", "failure");
		
		
	}
	
	
}
