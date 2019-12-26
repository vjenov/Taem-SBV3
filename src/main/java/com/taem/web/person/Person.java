package com.taem.web.person;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity
@Component
@Table(name= "PERSON",
uniqueConstraints={
	@UniqueConstraint(
		columnNames={"USERID"}
	)
})
public class Person {
	@Id
	@GeneratedValue
	@Column(name="ID", nullable=false) 
	private Long id;
	@Column(name="USERID", nullable=false) 
	private String userid;
	@Column(name="PASSWD", nullable=false) 
	private String passwd;
	@Column(name="NAME", nullable=false) 
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
	@Column(name="ROLE", nullable=false)
	private String role;
}
