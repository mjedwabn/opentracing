package io.github.mjedwabn.opentracing.backend;

import org.eclipse.microprofile.opentracing.Traced;

import javax.ejb.Stateless;


@Stateless
// https://download.eclipse.org/microprofile/microprofile-opentracing-1.3/microprofile-opentracing-spec-1.3.html#_enabling_explicit_distributed_tracing_code_instrumentation
@Traced
public class Greeter {
	public String sayHello() {
		return "hello";
	}
}
