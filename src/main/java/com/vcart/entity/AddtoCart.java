package com.vcart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	
	@Column(unique = true)
	private int id;
	
	private String productname;
	private int productstock;
	private float productprice;

}
