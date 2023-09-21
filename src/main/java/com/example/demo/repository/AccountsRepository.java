package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Accounts;

/** Accountsテーブル:RepositoryImpl */
public interface AccountsRepository extends CrudRepository<Accounts, Integer> {

}