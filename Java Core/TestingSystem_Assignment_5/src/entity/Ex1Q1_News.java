package entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import backend.BeEx1Q1_INews;

public class Ex1Q1_News implements BeEx1Q1_INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	int[] rates = new int[3];
	
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public String getContent() {
		return content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public void display() {
		System.out.println("Title: " + getTitle());
		System.out.println("Public Date: " + getPublishDate());
		System.out.println("Author: " + getAuthor());
		System.out.println("Content: " + getContent());
		System.out.println("Average Rate: " + getAverageRate());
	}
			
	@Override
	public float calculate() {
		averageRate = (rates[0] + rates[1] + rates[2]) / 3;
		return averageRate;
		
	}
	
	public void insertNews() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tiêu đề: ");
		title = scanner.nextLine();
		
		System.out.println("Nhập ngày public: ");
		publishDate = scanner.nextLine();
		
		System.out.println("Nhập tên tác giả: ");
		author = scanner.nextLine();
		
		System.out.println("Nhập nội dung: ");
		content = scanner.nextLine();
		
		System.out.println("Nhập 3 đánh giá");	
		System.out.println("Đánh giá thứ nhất: ");
		int rate1 = scanner.nextInt();
		System.out.println("Đánh giá thứ hai: ");
		int rate2 = scanner.nextInt();
		System.out.println("Đánh giá thứ ba: ");
		int rate3 = scanner.nextInt();
		scanner.nextLine();
		rates[0] = rate1;
		rates[1] = rate2;
		rates[2] = rate3;
		
		
	}
}
