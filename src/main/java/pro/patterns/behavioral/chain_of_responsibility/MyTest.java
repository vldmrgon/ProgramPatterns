package pro.patterns.behavioral.chain_of_responsibility;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyTest {

    @Autowired
    private Service service;

    public static void main(String[] args) {

        SpringApplication.run(MyTest.class, args);

    }

    @Primary
    @Component
    class Service2Impl implements Service {

        public Service2Impl() {
            System.out.println("Service2");
        }
    }

    @Component("service")
    class Service1Impl implements Service {

        public Service1Impl() {
            System.out.println("Service1");
        }
    }


    interface Service {
    }
}

