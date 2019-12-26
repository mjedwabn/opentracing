package io.github.mjedwabn.opentracing.gateway;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public interface HelloService {
	@GET
	String sayHello();
}
