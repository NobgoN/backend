package com.example.demo.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entity.Tweet;
import com.example.demo.Repository.TweetRepository;

@Service
public class TweetsServiceImpl implements TweetsService{

	@Autowired
	TweetRepository tweetRepository;
	
	
	@Transactional(readOnly = true)
	@Override
	public Map<String,String> postTweet(Tweet tweet) {
		
		tweetRepository.save(tweet);
		
		Map<String,String> map = new HashMap<>();
		map.put("result", "success");
		
		return map;
	}
}
