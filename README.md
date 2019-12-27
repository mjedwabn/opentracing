opentracing-demo
================

About
----
This is demo of [OpenTracing](https://opentracing.io) based on WildFly, MicroProfile and Jaeger.
Demo application consists of 3 services: backend, gateway and client.
* Backend implements business logic and exposes it as JAX-RS /backend/resources/hello endpoint.
* Gateway connects to backend service using MicroProfile Rest Client and exposes /gateway/resources/hello endpoint.
* Client connects to gateway service using JAX-RS Client and exposes /client/resources/hello endpoint.

![sequence diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mjedwabn/opentracing/master/docs/sequence.puml)

Requirements
------------
* Docker

Demo
----
1. Build and run
    ```
    $ make all
    ```
2. Send requests to client endpoint
    ```
    $ curl http://localhost:8080/client/resources/hello
    {"content":"hello"}
    $ curl http://localhost:8080/client/resources/hello
    {"content":"hello"}
    ...
    ```
3. See traces in [Jaeger UI](http://localhost:16686/search)

    ![jaeger ui](https://raw.githubusercontent.com/mjedwabn/opentracing/master/docs/jaeger_ui.png)

Pitfalls
-------------
1. Make sure to define JAEGER_SAMPLER_MANAGER_HOST_PORT environment variable. 

References
-------------
* [MicroProfile OpenTracing Spec 1.3](https://download.eclipse.org/microprofile/microprofile-opentracing-1.3/microprofile-opentracing-spec-1.3.pdf)
* [Getting Started with Jaeger](https://www.jaegertracing.io/docs/1.16/getting-started/)
* [Jaeger Client Library Features](https://www.jaegertracing.io/docs/1.16/client-features/)
