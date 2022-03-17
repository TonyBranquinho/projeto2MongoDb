package com.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String tect;
	private Date date;
	private AuthorDTO author;

	public CommentDTO() {
	}

	public CommentDTO(String tect, Date date, AuthorDTO author) {
		super();
		this.tect = tect;
		this.date = date;
		this.author = author;
	}

	public String getTect() {
		return tect;
	}

	public void setTect(String tect) {
		this.tect = tect;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
