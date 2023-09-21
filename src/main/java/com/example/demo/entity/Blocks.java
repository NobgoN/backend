package com.example.demo.entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="block")
public class Blocks {

	@Id
	int block_id;
	
	@ManyToOne
    Accounts blocker_id;
	
	@ManyToOne
    Accounts blocked_id;
	
}
