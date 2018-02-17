package com.telusuko.RestAPI;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Alien")
public class Alien 
{
	private String name;
	private int points;
	
	
		public Alien() {
		super();
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPoints() {
			return points;
		}
		public void setPoints(int points) {
			this.points = points;
		}
	
	

}
