package com.taem.web.person;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity
@Component
@Table(name="PERSON")
public class Person {
	@Id
	@GeneratedValue
	@Column(name="ID", nullable=false) 
	private Long id;
	@Column(name="USERID",length = 64, nullable=false) 
	private String userid;
	@Column(name="PASSWD",length = 64, nullable=false) 
	private String passwd;
	@Column(name="NAME",length = 64, nullable=false) 
	private String name;
	@Temporal(TemporalType.DATE)
	@Column(name="BIRTHDAY", nullable=false) 
	private Date birthday;
	@Column(name="GENDER", nullable=false)
	private String gender;
	@Column(name="HAK", nullable=false)
	private String hak;
	@Column(name="BAN", nullable=false)
	private String ban;
	@Column(name="SCORE", nullable=false)
	private String score;
}
