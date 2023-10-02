package com.backend.college_manegment_system.pages;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class signup {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int roll_no;
private String name;
private String classes;
private String email;
private int contact_no;
private String password;
private String Confirm_Password;
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClasses() {
	return classes;
}
public void setClasses(String classes) {
	this.classes = classes;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getContact_no() {
	return contact_no;
}
public void setContact_no(int contact_no) {
	this.contact_no = contact_no;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirm_Password() {
	return Confirm_Password;
}
public void setConfirm_Password(String confirm_Password) {
	Confirm_Password = confirm_Password;
}
@Override
public String toString() {
	return "signup [roll_no=" + roll_no + ", name=" + name + ", classes=" + classes + ", email=" + email
			+ ", contact_no=" + contact_no + ", password=" + password + ", Confirm_Password=" + Confirm_Password + "]";
}
public signup(int roll_no, String name, String classes, String email, int contact_no, String password,
		String confirm_Password) {
	super();
	this.roll_no = roll_no;
	this.name = name;
	this.classes = classes;
	this.email = email;
	this.contact_no = contact_no;
	this.password = password;
	Confirm_Password = confirm_Password;
}
public signup() {
	super();
	// TODO Auto-generated constructor stub
}

}
