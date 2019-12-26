package io.github.mjedwabn.opentracing.client;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello() {
		String content = ClientBuilder.newClient()
				.target("http://gateway:8080")
				.path("gateway").path("resources").path("hello")
				.request()
				.get().readEntity(String.class);
		return Response.ok(Json.createObjectBuilder().add("content", content.toString()).build())
				.build();
	}
}
