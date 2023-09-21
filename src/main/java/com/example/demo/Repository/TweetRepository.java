package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Tweet;

/** Accountsテーブル:RepositoryImpl */
public interface TweetRepository extends CrudRepository<Tweet, Integer> {

}