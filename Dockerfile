FROM openjdk:11
COPY ./target/calculator_SPE_miniProject-1.0-SNAPSHOT-shaded.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculator_SPE_miniProject-1.0-SNAPSHOT-shaded.jar"]