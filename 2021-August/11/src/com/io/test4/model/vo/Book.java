package com.io.test4.model.vo;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable {

	private String title;
	private String author;
	private int price;
	private Calendar dates;

	public Book() {
	}

	public Book(String title, String author, int price, Calendar dates) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return this.dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return String.format("%s 저 《%s》 %04d년 %02d월 %02d일 %d원", author, title, dates.get(Calendar.YEAR),
				dates.get(Calendar.MONTH) + 1, dates.get(Calendar.DAY_OF_MONTH), price);
	}

}