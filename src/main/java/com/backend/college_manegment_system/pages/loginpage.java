package com.backend.college_manegment_system.pages;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class loginpage{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int roll_no;

	    private String name;
	   	    private String password;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll_no() {
			return roll_no;
		}
		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "loginpage [name=" + name + ", roll_no=" + roll_no + ", password=" + password + "]";
		}
		public loginpage(String name, int roll_no, String password) {
			super();
			this.name = name;
			this.roll_no = roll_no;
			this.password = password;
		}
		public loginpage() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
