package com.example.demo.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
public class Accounts {

	@Id
	private Integer id;
	
	private String user_name;
	
	private String real_name;
	
	private String email;
	
	private String mobile_number;
	
	private String password;
	
	private String status;
	
}
