package com.springrest.receipt.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="donar")
public class donarDetails {
	
	public donarDetails() {};

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long donarId;
	
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String amount;
	
	@Column(nullable=false)
	private String paymentMethod;
	
	@Column(nullable=false)
	private String category;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="contact_details_id")
    private contactDetails cdetails;
	
	public donarDetails(String name, 
			String amount, String paymentMethod, 
			String category) {
		this.name = name;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.category = category;
	}
	
	

	public contactDetails getDdetails() {
		return cdetails;
	}



	public void setDdetails(contactDetails ddetails) {
		this.cdetails = ddetails;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public long getDonarId() {
		return donarId;
	}
	public void setDonarId(long donarId) {
		this.donarId = donarId;
	}


}
