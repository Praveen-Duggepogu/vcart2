package com.vcart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class AddtoCart {
	
	@Id
	 private int pid;
	 private int uid;
	private String pname;
	private float pprice;
	private int numofitems;
	

	
	
	

}
