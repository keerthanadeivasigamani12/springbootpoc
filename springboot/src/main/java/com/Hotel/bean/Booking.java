package com.Hotel.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Booking {
	@Id
		private String username;
	
		private String Roomnumber,Noofmemberstostay, Stayfrom,Stayto;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getRoomnumber() {
			return Roomnumber;
		}

		public void setRoomnumber(String roomnumber) {
			Roomnumber = roomnumber;
		}

		public String getNoofmemberstostay() {
			return Noofmemberstostay;
		}

		public void setNoofmemberstostay(String noofmemberstostay) {
			Noofmemberstostay = noofmemberstostay;
		}

		public String getStayfrom() {
			return Stayfrom;
		}

		public void setStayfrom(String stayfrom) {
			Stayfrom = stayfrom;
		}

		public String getStayto() {
			return Stayto;
		}

		public void setStayto(String stayto) {
			Stayto = stayto;
		}
	}


