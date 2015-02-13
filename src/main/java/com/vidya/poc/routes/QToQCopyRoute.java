package com.vidya.poc.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

public class QToQCopyRoute extends RouteBuilder {
	public static void main(String[] args) throws Exception {
		new Main().run(args);
	}

	public void configure() {
		
		//from("jmstx:queue:INPUT.QUEUE")
		//.threads(10)
		//.log(LoggingLevel.DEBUG, "Moving to the next q")
		//.to("jmstx:queue:OUTPUT.QUEUE");
	}
}