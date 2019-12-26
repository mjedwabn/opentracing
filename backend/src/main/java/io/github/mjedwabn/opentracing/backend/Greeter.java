package io.github.mjedwabn.opentracing.backend;

import org.eclipse.microprofile.opentracing.Traced;

import javax.ejb.Stateless;

@Stateless
@Traced
public class Greeter {
	public String sayHello() {
		return "hello";
	}
}
