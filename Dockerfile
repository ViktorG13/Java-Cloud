FROM maven:3.9.5-eclipse-temurin-21 AS build
WORKDIR /app

COPY pom.xml

COPY src ./src
RUN mvn -B -DskipTests package

FROM eclipse-temurin:21-jre
ARG JAR_FILE=target/*.jar
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

RUN addgroup --system spring && adduser --system --ingroup spring spring
USER spring:spring

ENV JAVA_TOOL_OPTIONS="-XX:+UseContainerSupport -Xmx512m"
ENV SPRING_PROFILES_ACTIVE=prod
EXPOSE 8080

ENTRYPOINT ["sh", "-c", "exec java $JAVA_TOOL_OPTIONS -jar /app/app.jar"]
