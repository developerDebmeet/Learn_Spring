# Learn_Spring

https://start.spring.io/ : spring initializr

Group ID : Something similar to Package Name \
Articaft : Something similar to Class Name 

What is Spring Container(IOC Container)? IOC : Inversion of Control\
Spring Container manages Spring Beans and their lifecycle. It makes the runtime system ready for us to use.\
It is also called Spring Context.\
 Types of Spring Containter : \
 1] Bean Factory : Basic Spring Container\
 2] Application Context : Advanced Spring Container with enterprise-specific features\
    - Easy to use in web apps\
    - Easy internationalization\
    - Easy integration with Spring AOP [Aspect Oriented Programming]\
    - Recommended for web apps, web services, REST API and microservices 

Java Bean : \
    - Have a public no arg contructor\
    - Allows access to their properties using getter and setter methods\
    - Implements java.io.Serializable

POJO : Plain Old Java Object \
    - No Constraints\
    - Any Java Object is a Pojo

Spring Bean : Any Java Object that is managed by Spring \
    - Spring uses IOC Container [Bean Factory or Application Context] to manage these objects

Spring Dependency Injection Types \
    - Constructor Based : Dependencies are set by creating the Bean using its Constuctor \
    - Setter Based : Dependencies are set by calling setter methods on your Beans \
    - Field : No Setter or Constructor. Dependency is injected using Reflection. 




