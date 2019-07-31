package kr.or.connect.mvcexam.dto;

import java.sql.Date;

public class Movie {
	public String name;
	public int remainSet;
	public int bookPeople;
	public Date startTime;
	public Date endTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRemainSet() {
		return remainSet;
	}
	public void setRemainSet(int remainSet) {
		this.remainSet = remainSet;
	}
	public int getBookPeople() {
		return bookPeople;
	}
	public void setBookPeople(int bookPeople) {
		this.bookPeople = bookPeople;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", remainSet=" + remainSet + ", bookPeople=" + bookPeople + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
	
	
	
}
