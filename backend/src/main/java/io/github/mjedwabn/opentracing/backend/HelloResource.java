package io.github.mjedwabn.opentracing.backend;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {
	@Inject
	Greeter greeter;

	@GET
	public String sayHello() {
		return greeter.sayHello();
	}
}
