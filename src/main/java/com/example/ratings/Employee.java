package com.example.ratings;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="employees")
public class Employee{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Contact")
	private Integer contact;
	@Column(name="Rating")
	private Integer rating;

//	public Integer getId(){
//		return id;
//	}
//
//	public void setId(Integer id){
//		this.id=id;
//	}
//
//	public String getName(){
//		return name;
//	}
//
//	public void setName(String name){
//		this.name=name;
//	}
//
//	public String getEmail(){
//		return email;
//	}
//
//	public void setEmail(String email){
//		this.email=email;
//	}
//
//	public Integer getContact(){
//		return contact;
//	}
//
//	public void setContact(Integer contact){
//		this.contact=contact;
//	}
//
//	public Integer getRating(){
//		return rating;
//	}
//
//	public void setRating(Integer rating){
//		this.rating=rating;
//	}
}