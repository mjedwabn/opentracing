package io.github.mjedwabn.opentracing.gateway;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

@Path("hello")
public class GatewayResource {
	@GET
	public Response sayHello() {
		return ClientBuilder.newClient()
				.target("http://backend:8080")
				.path("backend").path("resources").path("hello")
				.request()
				.get();
	}
}
