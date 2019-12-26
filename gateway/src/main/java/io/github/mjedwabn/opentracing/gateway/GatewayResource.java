package io.github.mjedwabn.opentracing.gateway;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.net.URI;

@Path("hello")
public class GatewayResource {
	@GET
	public String sayHello() {
		URI backendUri = URI.create("http://backend:8080/backend/resources");
		HelloService helloService = RestClientBuilder.newBuilder()
				.baseUri(backendUri)
				.build(HelloService.class);
		return helloService.sayHello();
	}
}
