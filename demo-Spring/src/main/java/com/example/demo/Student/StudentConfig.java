package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args-> {
            Student gabriel = new Student( "Gabriel",
                    "myemail@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER,10)
            );

            Student timmy = new Student( "Timmy",
                    "hisemail@gmail.com",
                    LocalDate.of(2008, Month.JANUARY,25)
            );

            studentRepository.saveAll(
                    List.of(gabriel, timmy)
            );
        };
    }
}
