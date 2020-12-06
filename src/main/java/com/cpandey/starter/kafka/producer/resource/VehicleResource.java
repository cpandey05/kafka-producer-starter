package com.cpandey.starter.kafka.producer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpandey.starter.kafka.producer.model.Vehicle;

@RestController
@RequestMapping("kafka")
public class VehicleResource {

    @Autowired
    private KafkaTemplate<String, Vehicle> kafkaTemplate;

    private static final String TOPIC = "vehicle_topic";

    @GetMapping("/publish/{modelname}/{color}")
    public String post(@PathVariable("modelname") final String modelname,@PathVariable("color") final String color) {

        kafkaTemplate.send(TOPIC, new Vehicle(modelname, color));

        return "Vehicle Info Published successfully :: Model: "+modelname+" Color: "+color;
    }
}
