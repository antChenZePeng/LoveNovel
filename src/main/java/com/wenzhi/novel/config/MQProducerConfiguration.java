package com.wenzhi.novel.config;

import lombok.Data;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@SpringBootConfiguration
public class MQProducerConfiguration {

    @Data
    @Component
    @ConfigurationProperties(prefix = "rocketmq.producer")
    public class ProducerConfig {
        private String groupName;
        private String namesrvAddr;
    }

    @Autowired
    private ProducerConfig producerConfig;
    public static final Logger LOGGER = LoggerFactory.getLogger(MQProducerConfiguration.class);

    @Bean
    public DefaultMQProducer getRocketMQProducer() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer(producerConfig.getGroupName());
        producer.setNamesrvAddr(producerConfig.getNamesrvAddr());
        try {
            producer.start();
            LOGGER.info(String.format("producer is start ! groupName:[%s],namesrvAddr:[%s]", producerConfig.getGroupName(), producerConfig.getNamesrvAddr()));
        } catch (Exception e) {
            LOGGER.error(String.format("producer's starting is error {}", e.getMessage(),e));
            throw new Exception();
        }
        return producer;
    }
}
