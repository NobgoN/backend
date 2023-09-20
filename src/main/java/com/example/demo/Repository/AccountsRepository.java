package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.sns.entity.Accounts;

/** Accountsテーブル:RepositoryImpl */
public interface AccountsRepository extends CrudRepository<Accounts, Integer> {

}