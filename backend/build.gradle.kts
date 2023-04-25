plugins {
	java
	id("org.springframework.boot") version "3.0.6"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.jackakers13"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
//	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//	implementation("mysql:mysql-connector-java:8.0.33")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	// testImplementation("org.springframework.boot:spring-boot-starter-test")
}

// tasks.withType<Test> {
// 	useJUnitPlatform()
// }
