package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface AccountsService {
	
	public Map<String, Object> postTweet(List<Tweet> tweet);
	
}
