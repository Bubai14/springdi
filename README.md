# springdi
Spring Dependency Injection example

# Dependency Injection Types
Spring dependency injection are of three types:
 1. Property Injection - The dependent objects are injected as class member variables. The variables need to be annotated with @Autowired annotation. This is the least preferred option as even a null object can be injected.
 
 2. Setter Injection - The dependent objects are injected into the setter methods of the class member variables. The setter methods needs to be annotated with @Autowired annotation. This is second most preferred option.
 
 3. Constructor Injection - The dependent objects are injected into the constructor of the class where the objects the injected. No annotations are needed if there are only one constructor. Add @Autowired annotation in case if there are multiple constructors.


# Qualifier
When there are multiple classes inherited from common interface, then we need to designate the reference of the interface used in the classes with @Qualifier to let spring framework know which implementation class has to be injected. 

# Primary Bean
When multiple beans (e.g @Service) are created by implementing a common interface, one of those beans can be marked as a primary. The primary bean gets injected into the required classes by the Spring Framework wherever the interface is referenced. This works only when @Qualifier is not used.

# Profiles
Profiles enable Spring Framework to inject different beans at each start up based on the profile the beans are attached. This is generally useful when the application needs to connect to different databases during each startup.
Default Profiles - Any specific profile can be marked as default by @Profile({"actualProfileName", "default"}). In such cases, if any profile is not made active, the default profile will be activated.

# Configuration
The beans declared with stereotypes annotation can also be configuration in a single configuration class annotated with @Configuration. Each of these beans can be instantiated with new operator with @Bean annotation on top of each method returning the beans. All the other annotations like @Primary and @Profiles can be used with these methods as well.

# Scopes
Spring beans has following scopes:
Singleton
Prototype
Request
Session
Application
WebHook
Custom

# Environment Properties
To override the properties set in the properties we can add the same properties from environment variable and command line. To add a property "guru.username" from environment variable we need to add like GURU_USERNAME.

#Constructor Binding
We can directly bind configuration values with Spring beans using the constructor binding. For this we use the annotation @ConstructorBinding on the class used for reading the configuration values in bean format. Please see the class SpringDataSource. Also need to add @EnableConfigurationProperties on top the configuration class and point it to the class using constructor binding. Please see DependencyinjectionApplication class.