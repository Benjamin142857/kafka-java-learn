package com.bjmleaen.kafka.kafkalearn001.admin;

import java.util.Properties;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;


public class AdminTest {
    public static void main(String[] args) {
        AdminClient adminClient = AdminTest.adminClient();
        System.out.println(adminClient);
    }

    public static AdminClient adminClient() {
        Properties properties = new Properties();
        properties.setProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "121.37.14.68:9092");

        AdminClient adminClient = AdminClient.create(properties);
        return adminClient;
    }
}
