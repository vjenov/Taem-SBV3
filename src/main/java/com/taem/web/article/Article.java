package com.taem.web.article;


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
@Table(name="ARTICLE")
public class Article {
	@Id
	@GeneratedValue
	@Column(name="SEQ", nullable=false) 
	private Long seq;
	@Column(name="USERID",length = 64, nullable=false) 
	private String userid;
	@Column(name="TITLE",length = 64, nullable=false) 
	private String title;
	@Column(name="CONTENT",length = 128, nullable=false) 
	private String content;
	@Column(name="RATING", nullable=false) 
	private int rating;
	@Temporal(TemporalType.DATE)
	@Column(name="regdate", nullable=false) 
	private Date regdate;
}
