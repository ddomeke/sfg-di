package guru.springframework.sfgdi.controller;


import guru.springframework.sfgdi.services.GreetingServices;

public class PropertyInjectedController {

    public GreetingServices greetingServices;

    public String getGreeting(){

        return greetingServices.sayGreeting();
    }
}
