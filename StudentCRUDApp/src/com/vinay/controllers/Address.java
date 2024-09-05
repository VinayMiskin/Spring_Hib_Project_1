package com.vinay.controllers;

import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotBlank;
@Embeddable
public class Address {
	@NotBlank
	private String street;
	@NotBlank
	private String city;
	@NotBlank
	private String pinCode;
	public Address() {
		
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((pinCode == null) ? 0 : pinCode.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (pinCode == null) {
			if (other.pinCode != null)
				return false;
		} else if (!pinCode.equals(other.pinCode))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	public Address(String street, String city, String pinCode) {
		super();
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address(Address a) {
		this.street = a.street;
		this.city = a.city;
		this.pinCode = a.pinCode;
	}
	
}
