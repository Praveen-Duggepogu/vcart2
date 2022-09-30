package com.vcart.entity;

import javax.persistence.Column;
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
	@Column(unique = true)
	private int productid;
	
	@Column(unique = true)
	
	private int userid;
	private String productname;
	private int productstock;
	private float productprice;

}
