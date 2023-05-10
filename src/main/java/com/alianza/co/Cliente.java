package com.alianza.co;

import java.util.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="clientes")
public class Cliente {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String sharedkey;
	@Column
	private String businessid;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private Date dataadded;
	
	public int getId() {return id;}
	public int setId() {return id;}
	
	public String getSharedkey() {return sharedkey;}
	public String setSharedkey() {return sharedkey;}
	
	public String getBusinessid() {return businessid;}
	public String setBusinessid() {return businessid;}
	
	public String getEmail() {return email;}
	public String setEmail() {return email;}
	
	public String getPhone() {return phone;}
	public String setPhone() {return phone;}
	
	public Date getDataadded() {return dataadded;}
	public Date setDataadded() {return dataadded;}
}
