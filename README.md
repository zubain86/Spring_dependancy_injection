# Spring_dependancy_injection

![image](https://github.com/zubain86/Spring_dependancy_injection/assets/96322986/e758b5a3-76ea-432c-b7c9-8c154e3a9248)

 Dependancy injection is done easily with the help of loosely coupled objects that is created using annotations

 @Component

This creates object of a class in a spring container

@ Autowired annotation 
This annotation is used to search any dependant object in spring container 

@Scope
This annotation does not create object by default. It creates object in spring container only when demanded.
Syntax - @Scope(value = “prototype”)

@Qualifier
This annotation is used to search an object with a set name.
Syntax = @Qualifier(“lap1”)
But to use qualifier annotation you have to set a object name in component annotation like-
@Component(“lap1”)

