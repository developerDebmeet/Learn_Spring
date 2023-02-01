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
    - Constructor Based : **[RECOMMENDED]** Dependencies are set by creating the Bean using its Constuctor \
    - Setter Based : Dependencies are set by calling setter methods on your Beans \
    - Field : No Setter or Constructor. Dependency is injected using Reflection. 

Important Spring Terminologies \
    - @Component : An Instance of component Class will be managed by Spring Framework \
    - Dependency : Some classes may need implementation of another to work \
    - @ComponentScan : helps Spring Framework find other component classes. It Scans packages \
    - Dependency Injection : Identify beans, their dependencies ans wire them together(provides IOC) \
    - Spring Beans : an object managed by Spring framework \
    - IOC container: Manages the lifecycle of beans and dependencies [types : AppContext and BeanFactory] \
    - Autowiring : The process of wiring in Dependencies for a Spring Bean

@Component vs @Bean \
    - component can be used on any Java Class while Bean is typically used on methods in Spring configuration classes \
    - for component we just need to add the annotation, whereas for bean we need to write all the code \
    - for component we can use constructor, setter or field for autowiring, while for bean we can use method call or method parameter for autowiring \
    - for component the spring framework creates the beans, while for @bean, the bean creation code is written by developer \
    - component is recommended for instantiating beans for creating custom applications, @bean is recommended for custom business logic or instantiating beans for 3rd party libraries 

Why Industrial Applications have so many dependencies? \
    - there are different layers for web, data and business logic \
    - each layer is dependent on the layer below it \
    - with spring framework, instead of focussing on objects, their dependencies and wiring, the developer can focus on business logic of the application \
    - spring framework will take care of the lifecycle of objects, developer can just add the appropriate annotations 


Comparing Lazy vs Eager Bean Initialization \
    - Bean initialization is done when it if fist made use of in the applicaiton
in lazy, whereas bean is initialized at startup in eager \
    - Default Initialization of Spring Beans is Eager and Lazy is rarely used \
    - In Lazy Initialization, errors will result in runtime exceptions whereas
in eager, errors will prevent application from starting up \
    - Memory consumption is less in lazy until the bean is initialized \
    - If there is a very rarely used bean in our app, we can consider lazy init, but otherwise eager is fine


Comparing Prototype vs Singleton Bean Scope \
    - In Prototype Scope, many instance per spring IOC container can be present whereas 
in Singleton one instance per Spring IOC Container is present \
    - New bean instance is created every time the bean is referred to in Prototype
whereas Same bean is reused in Singleton \
    - Single is Default and is very frequently used \
    - Prototype is used for Stateful beans whereas Singleton is used for Stateless beans.
Eg - bean for uses in an app should be different for each, so Prototype can be used.


Evolution J2EE -> Java EE -> Jakarta EE \
    - Enterprise capabilities were initially built into JDK \
    - With type, they were separated out : \
        - J2EE : Java 2 Platform Enterprise Edition \
        - Rebranded to Java Platform Enterprise Edition \
        - Jakarta EE [Oracle gave Java EE rights to the Eclipse Foundation] \
            - Important Specifications : \
                - Jakarta Server Pager (JSP) \
                - Jakarta Standard Tag Library (JSTL) \
                - Jakarta Enterprise Beans (EJB) \
                - Jakarta RESTful Web Services (JAX-RS) \
                - Jakarta Bean Validation \
                - Jakarta Contexts and Dependency Injection (CDI) \
                - Jakarta Persistence API (JPA) \
                Supported by Spring 6 and Spring Boot 3 [Hence the use of jakarta packages instead of javax packages] \


Jakarta Contexts & Dependency Injection (CDI) \
    - CDI is a specification [interface] and Spring Framework implements CDI \
    - Important Inject API Annotations \
        - Inject [~Autowired in Spring] \
        - Named [~Component in Spring] \
        - Qualifier \
        - Scope \
        - Singleton \
To use CDI, we need to add a dependency : jakarta.inject

















