package org.mycomapny;

import java.util.List;

public class TrainingNew {

	String name;
	String location;
	List<ListAdd> List;
	public TrainingNew(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<ListAdd> getList() {
		return List;
	}
	public void setList(List<ListAdd> list) {
		List = list;
	}
	

void details(){
	
	System.out.println("I'm "+name+" working in : "+location);
	System.out.println("List of phone no  :\n");
	for(ListAdd adr:List){
	System.out.println(" : "+adr.phone+" "+adr.home);
	}
}
}
