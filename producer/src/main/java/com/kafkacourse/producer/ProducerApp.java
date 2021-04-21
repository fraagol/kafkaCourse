package com.kafkacourse.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerApp {

    public static void main(String[] args) {
        System.out.println("hi");
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092,localhost:9094");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer producer = new KafkaProducer(properties);

        ProducerRecord<String,String> producerRecord = new ProducerRecord<String, String>("topicName","tes2t","123");
        while (producer!=null) {
            producer.send(producerRecord);
        }
        producer.close();
    }
}
