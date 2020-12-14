package io.ayers.springdependencyinjection;

import io.ayers.springdependencyinjection.controllers.*;
import io.ayers.springdependencyinjection.lifecycle.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        System.out.println("---- I18N");
        var i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.getGreeting());

        System.out.println("---- Primary");
        var primaryController = (PrimaryController) context.getBean("primaryController");
        System.out.println(primaryController.getGreeting());

        System.out.println("---- Property");
        var propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---- Setter");
        var setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---- Constructor");
        var constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("---- LifeCycle");
        var lifecycleDemoBean = (LifeCycleDemoBean) context.getBean("lifeCycleDemoBean");
    }

}
