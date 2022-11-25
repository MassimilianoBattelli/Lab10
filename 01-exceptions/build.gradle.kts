plugins{
    java
    application
}

repositories{
    mavenCentral()
}

dependencies{
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

tasks.test{
    useJUnitPlatform()
    testLogging { events("passed", "skipped", "failed")}
}

application{
mainClassName = "it.unibo.exceptions.UseArithmeticService"
}