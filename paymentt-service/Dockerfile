FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/paymentt-service-0.0.1-SNAPSHOT.jar paymentt-service.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "paymentt-service.jar"]