package com.vcart.entity;

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
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	
	private String Name;
	private String Password;
	private long Phonenumber;
	private String Address;
	private String Email;
	private boolean isVendor;
	private boolean isUser;
	
	@ManyToOne(cascade = CascadeType.ALL) 
	private AddtoCart addtocart;
	
	
}
