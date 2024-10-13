package com.hibernet.hibernate_example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
		@Id
		private int rollno;
		private String city;
		private String state;
		private String mob;
		
		public Student() {
			
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setMob(String mob) {
			this.mob = mob;
		}

		public Student(int rollno, String city, String state, String mob) {
			super();
			this.rollno = rollno;
			this.city = city;
			this.state = state;
			this.mob = mob;
		}
		

	}
	


