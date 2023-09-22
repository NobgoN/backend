package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import com.example.demo.Entity.Tweet;

public interface TweetsService {

	public Map<String,String> postTweet(Tweet tweet);
	
}
