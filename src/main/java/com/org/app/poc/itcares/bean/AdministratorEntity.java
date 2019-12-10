package com.org.app.poc.itcares.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="administrators")
public class AdministratorEntity {
	
	/**
	 * The id property is annotated with @Id so that JPA will recognize it as the object’s ID. Also, 
	 * @GeneratedValue annotation enable its value generated automatically.
	 */
	@Id
	@GeneratedValue
	private long id;
	
	@Column (name = "user_id")
	private String userId;
	
	@Column(name = "password")
	private String pwd;
	
	


	@Override
    public String toString() {
        return "AdministrorEntity [id=" + userId + ", firstName=" + pwd + "]";
    }

}
