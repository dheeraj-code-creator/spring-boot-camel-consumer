package com.example.springbootcamel.consumer.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqConsumer extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:my-active-mq-queue")
                .to("log:Got consumed message from Activemq");

    }
}
