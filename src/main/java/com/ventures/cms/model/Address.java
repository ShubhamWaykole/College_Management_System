package com.ventures.cms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	private String addline;
	private String city;
	private Long postalcode;

	public String getAddline() {
		return addline;
	}

	public void setAddline(String addline) {
		this.addline = addline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(Long postalcode) {
		this.postalcode = postalcode;
	}

	@Override
	public String toString() {
		return "Address [addline=" + addline + ", city=" + city + ", postalcode=" + postalcode + "]";
	}
}
