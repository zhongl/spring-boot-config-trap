# A demo for spring-boot configuration loading[^1].

> ## 24.3 Application property files
> 
>  SpringApplication will load properties from application.properties files in the following locations and add them to the Spring Environment:
>  
>  1. A /config subdirectory of the current directory.
>  1. The current directory
>  1. A classpath /config package
>  1. The classpath root
>
> The list is ordered by precedence (properties defined in locations higher in the list override those defined in lower locations).

## Diff


```
> git diff config resources --
diff --git a/config/application.properties b/config/application.properties
index 8bb6cc1..e69de29 100644
--- a/config/application.properties
+++ b/config/application.properties
@@ -1 +0,0 @@
-trap.key=config
\ No newline at end of file

```

## Run


1. `mvn clean spring-boot:run`
1. Click <http://localhost:8080>


[^1]: http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html#boot-features-external-config-application-property-files