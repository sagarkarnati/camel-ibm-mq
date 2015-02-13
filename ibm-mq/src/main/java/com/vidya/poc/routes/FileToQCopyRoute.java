package com.vidya.poc.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

public class FileToQCopyRoute extends RouteBuilder {
	public static void main(String[] args) throws Exception {
		new Main().run(args);
	}

	public void configure() {
		
		from("file:conf/?fileName=SampleData.txt&noop=true")
		.split(body(String.class).tokenize("\n"))
		.threads(10)
		.log(LoggingLevel.ERROR,body().toString())
		.to("jmstx:queue:TARGET.QUEUE");
		//.to("stream:out");
	}
}