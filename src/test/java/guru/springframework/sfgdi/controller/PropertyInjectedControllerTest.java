package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingServices = new GreetingServicesImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}