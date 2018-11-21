package com.caps.dev.web.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dev.beans.Person;

@Path("/crud")
public class CRUDServices {

@GET
@Path("/get/json")
@Produces(MediaType.APPLICATION_JSON)
public Response getProfileJSON() {
	Person p= new Person();
	p.setId(1);
	p.setName("tj");
	p.setAge(22);
	p.setAddress("bangalore");
	p.setEmail("startejesh7@gmail.com");
	
	return Response.ok().entity(p).build();
}

@GET
@Path("/get/xml")
@Produces(MediaType.APPLICATION_XML)
public Response getProfileXML() {
	Person p= new Person();
	p.setId(1);
	p.setName("tj");
	p.setAge(22);
	p.setAddress("bangalore");
	p.setEmail("startejesh7@gmail.com");
	
	return Response.ok().entity(p).build();
}
}
