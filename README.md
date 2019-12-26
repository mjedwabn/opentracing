opentracing-demo
================

About
----
This is demo of [OpenTracing](https://opentracing.io) based on WildFly, MicroProfile and Jaeger.
Demo application consists of 3 services: backend, gateway and client.
* Backend implements business logic and exposes it as JAX-RS /backend/resources/hello endpoint.
* Gateway connects to backend service using MicroProfile Rest Client and exposes /gateway/resources/hello endpoint.
* Client connects to gateway service using JAX-RS Client and exposes /client/resources/hello endpoint.

![sequence diagram](https://raw.githubusercontent.com/mjedwabn/opentracing/master/docs/sequence.puml)

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
    curl http://localhost:8080/client/resources/hello
    curl http://localhost:8080/client/resources/hello
    ...
    ```

3. See traces in Jaeger UI

    ![jaeger ui](https://raw.githubusercontent.com/mjedwabn/opentracing/master/docs/jaeger_ui.png)
