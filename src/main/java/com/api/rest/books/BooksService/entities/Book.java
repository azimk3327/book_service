package com.api.rest.books.BooksService.entities;

public class Book {
	private int id;
	private String title;
	private String auther;
	private String sell;
	private String desc;
	private String releasedate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getSell() {
		return sell;
	}
	public void setSell(String sell) {
		this.sell = sell;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	
	public Book(int id, String title, String auther, String sell, String desc,String releasedate) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
		this.sell = sell;
		this.desc = desc;
		this.releasedate=releasedate;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auther=" + auther + ", sell=" + sell + ", desc=" + desc + "]";
	}
	
	
}
