plugins {
//    id("java")
    java
}

group = "com.example"
version = "1.0"


subprojects {
    apply(plugin = "java")
    repositories(RepositoryHandler::mavenCentral)
}

repositories(RepositoryHandler::mavenCentral)
dependencies {
    implementation(project(":annotator:annotator"))

//    implementation(files("annotator/processor/build/libs/processor-1.0.jar"))
    implementation(project(":annotator:processor"))

//    annotationProcessor(files("annotator/processor/build/libs/processor-1.0.jar"))
    annotationProcessor(project(":annotator:processor"))

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(platform("org.junit:junit-bom:5.9.1"))
    implementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
