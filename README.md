# springdi
Spring Dependency Injection example

# Primary Bean
When multiple beans (e.g @Service) are created by implementing a common interface, one of those beans can be marked as a primary. The primary bean gets injected into the required classes by the Spring Framework wherever the interface is referenced. This works only when @Qualifier is not used.

# Profiles
Profiles enable Spring Framework to inject different beans at each start up based on the profile the beans are attached. This is generally useful when the application needs to connect to different databases during each startup.
Default Profiles - Any specific profile can be marked as default by @Profile({"actualProfileName", "default"}). In such cases, if any profile is not made active, the default profile will be activated.
