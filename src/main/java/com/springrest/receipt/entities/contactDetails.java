package com.springrest.receipt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="donarContactdetails")
public class contactDetails {
	
	public contactDetails() {};
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long donarId;
	
	
	@Column(nullable=false)
	private String Phone;
	
	private String Email;
	
	private String pan;
	
	private String Address;
	
	private String note;
	
	
	public long getDonarId() {
		return donarId;
	}

	public void setDonarId(long donarId) {
		this.donarId = donarId;
	}	
	
	public contactDetails(String phone, String email, String pan, String address, String note) {
		Phone = phone;
		Email = email;
		this.pan = pan;
		Address = address;
		this.note = note;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
