package com.example.demo.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.AccountsRepository;

@Service
public class AccountsServiceImpl {
	
	@Autowired
	AccountsRepository accountsRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Map<String, Object> postTweet(List<Tweets> tweet) {
		
		accountsRepository.save();

		Map<String, Object> map = new HashMap();
        map.put("result", "success");
		
		return map;
			
	}
	

}
