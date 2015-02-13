package com.vidya.poc.routes.active;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

public class QToFileCopyRoute extends RouteBuilder {
	public static void main(String[] args) throws Exception {
		new Main().run(args);
	}

	public void configure() {
		
		from("jmstx:queue:INPUT.QUEUE").to("file://target/testFile?fileExist=Append");
	}
}