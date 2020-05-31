package com.devglan;

import com.devglan.dao.PolicyDao;
import com.devglan.dao.UserDao;
import com.devglan.dto.PolicyDto;
import com.devglan.model.Policy;
import com.devglan.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner initUser(UserDao userDao, PolicyDao policyDao,BCryptPasswordEncoder passwordEncoder){
        return args -> {
            userDao.deleteAll();
            User user = new User("Devglan", "Devglan", "devglan", passwordEncoder.encode("devglan"), 12345, 34);
            userDao.save(user);
            
            Policy policy = new Policy(2, "13445", "Aleksandar", "Matic", "test", 10.1, 10, 200.0, 1, "MOTOCIKL");
            policyDao.save(policy);
        };
    }

}
