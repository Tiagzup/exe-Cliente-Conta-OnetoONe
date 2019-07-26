package com.br.zup.helpers;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class DetailsErrors {
	
	private Date date;
	private int status;
	private String message;
	private String origin;
	
	public DetailsErrors(HttpStatus status, String message, String origin) {
		super();
		this.date = new Date ();
		this.status = status.value();
		this.message = message;
		this.origin = origin;
	}

	public Date getDate() {
		return date;
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public String getOrigin() {
		return origin;
	}
		
}
