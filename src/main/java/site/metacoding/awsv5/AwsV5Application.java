package site.metacoding.awsv5;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
@SpringBootApplication
public class AwsV5Application {

    public static void main(String[] args) {
        SpringApplication.run(AwsV5Application.class, args);
    }

}