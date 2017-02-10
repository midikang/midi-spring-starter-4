# Midi spring starter project

Java version: 1.6
Spring version: 4.2.2.RELEASE

```
	<properties>
        <java-version>1.6</java-version>
        <org.springframework-version>4.2.2.RELEASE</org.springframework-version>
        <org.slf4j-version>1.7.12</org.slf4j-version>
    </properties>
```

Dependencies
spring:
spring-context
spring-webmvc

Logging

Servlet
```
		<!-- Servlet -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>servlet-api</artifactId>
			<version>2.5</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet.jsp</groupId>
			<artifactId>jsp-api</artifactId>
			<version>2.1</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
```

Plugin:
jetty-maven-plugin

#To run with jetty
```
mvn jetty:run
```


#Inside Eclipse

File -> Import -> Maven -> Existing Maven project
```
mvn eclipse:eclipose
```
