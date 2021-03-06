package com.mockup.properties.service.model;

/**
 * Created by h13640 on 11/25/2015.
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="application_properties")
@NamedQuery(name="ApplicationProperties.findAll", query="SELECT e from ApplicationProperties e")
public class ApplicationProperties implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -103944218283254557L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name="customer")
    private String customer;
    
	@Column(name="key")
    private String key;
    
	@Column(name="value")
    private String value;
    
    @Column(name = "create_at", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date create_at;
    
    @Column(name = "update_at", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date update_at;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ApplicationProperties [id=" + id + ", customer=" + customer
				+ ", key=" + key + ", value=" + value + ", create_at="
				+ create_at + ", update_at=" + update_at + ", getId()="
				+ getId() + ", getCustomer()=" + getCustomer() + ", getKey()="
				+ getKey() + ", getValue()=" + getValue() + ", getCreate_at()="
				+ getCreate_at() + ", getUpdate_at()=" + getUpdate_at()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((create_at == null) ? 0 : create_at.hashCode());
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result
				+ ((update_at == null) ? 0 : update_at.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		ApplicationProperties other = (ApplicationProperties) obj;
		if (create_at == null) {
			if (other.create_at != null)
				return false;
		} else if (!create_at.equals(other.create_at))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (id != other.id)
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (update_at == null) {
			if (other.update_at != null)
				return false;
		} else if (!update_at.equals(other.update_at))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
    
    
    
    
}
