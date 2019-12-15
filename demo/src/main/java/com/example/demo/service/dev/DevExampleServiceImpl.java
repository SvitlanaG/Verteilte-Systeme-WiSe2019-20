package com.example.demo.service.dev;

import com.example.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class DevExampleServiceImpl implements ExampleService {

    private final String randomMessage;
    private final String devOnlyMessage;


    public DevExampleServiceImpl(@Value("${spring.application.name}") String randomMessage, @Value("${app.custom.dev.profile.message}") String devOnlyMessage) {
        this.randomMessage = randomMessage;
        this.devOnlyMessage = devOnlyMessage;
    }

    @Override
    public String randomServiceCall() {
        return randomMessage + " : " + devOnlyMessage;
    }
}
