package com.annotations.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value(value="1/1290")
	String hNo;
	@Value(value="H.B.S COLONY")
	String street;
	@Value(value="Yemmiganur")
	String city;
	@Value(value="Kurnool")
	String district;
	@Value(value="AP")
	String state;
	public Address()
	{
		
	}
	public Address(String hNo, String street, String city, String district, String state) {
		super();
		this.hNo = hNo;
		this.street = street;
		this.city = city;
		this.district =district;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + ", city=" + city + ", district=" + district + ", state="
				+ state + "]";
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
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
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String disstrict) {
		this.district = disstrict;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	


}
