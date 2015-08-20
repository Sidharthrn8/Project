package org.mycomapny;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee1 {
		
		String category;
		int age;
		List<Address> addresslist;
		@Autowired
		@Qualifier("add2")
		public List<Address> getAddresslist() {
			return addresslist;
		}


		public void setAddresslist(List<Address> addresslist) {
			this.addresslist = addresslist;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}

	
		
		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		void details(){
			System.out.println("I'm working for my company");
			System.out.println("I'm a "+category+" Employee and my age is : "+age);
			System.out.println("List of MyAddress :\n");
			for(Address adr:addresslist){
			System.out.println("Address1 : "+adr.doorno+" "+adr.city);
			}
		}
}

