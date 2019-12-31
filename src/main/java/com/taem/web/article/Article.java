package com.taem.web.article;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.taem.web.person.Person;
import com.taem.web.proxy.Proxy;

import javassist.SerialVersionUID;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author user
 *
 */
@Entity
@Component
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@Table(name="ARTICLE")
public class Article extends Proxy implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ARTICLEID") @NotNull
	private Long articleid;
	@Column(name="USERID") @NotNull
	private String userid;
	@Column(name="TITLE") @NotNull
	private String title;
	@Column(name="CONTENT") @NotNull
	private String content;
	@Column(name="RATING") @NotNull
	private int rating;
	@Temporal(TemporalType.DATE)
	@Column(name="regdate") @NotNull
	private Date regdate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personid")
    private Person personid;
	
	@Builder
	private Article(String userid, String title, String content, int rating, Date regdate) {
	    this.userid = userid;
	    this.title = title;
	    this.content = content;
	    this.rating = rating;
	    this.regdate = regdate;
	}
}
