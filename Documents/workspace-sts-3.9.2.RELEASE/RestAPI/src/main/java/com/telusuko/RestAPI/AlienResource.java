 package com.telusuko.RestAPI;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("aliens")
public class AlienResource 
{
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien()
	{
		System.out.println("get alien called..");
		Alien a1 = new 	Alien();
		a1.setName("siva");
		a1.setPoints(60);
		
		return a1;
		
	}

}
