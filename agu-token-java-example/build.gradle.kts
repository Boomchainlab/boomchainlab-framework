plugins {
    id("agu-token.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":agu-token-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.agu_token.api.example.Main"
}
