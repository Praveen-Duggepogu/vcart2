package com.vcart.entity;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	
	private String pname;
	private Blob pimage;
	private String pdesc;
	private float pprice;
	private String plocation;
	private int pstock;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AddtoCart addtocart;

}
