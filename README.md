# quarkus-camel-lambda Project

This project uses the following framework 

 * **Quarkus** - *The Supersonic Subatomic Java Framework*
 * **Apache Camel** - *The Swiss Army Knife of Enterprise Application Integration for integrating heterogeneous systems*
 * **AWS Lambda** - *Event-driven, serverless computing platform provided by Amazon as a part of Amazon Web Services*

If you want to learn more about 

* *Quarkus - please visit its website: https://quarkus.io/*
* *Apache Camel - please visit its website: https://camel.apache.org/*
* *AWS Lambda - please visit its website: https://aws.amazon.com/lambda/*

## Provided Code

### Quarkus Camel Amazon Lambda Integration example

This example contains a sample Greeter service build using Quarkus & Camel which can be deployed in Amazon Lambda as function.

[Related guide section...](https://quarkus.io/guides/amazon-lambda)

> :warning: **INCOMPATIBLE WITH DEV MODE**: Amazon Lambda Binding is not compatible with dev mode yet!

## Related Guides

- AWS Lambda ([guide](https://quarkus.io/guides/amazon-lambda)): Write AWS Lambda functions
- Apache camel ([guide](https://quarkus.io/guides/camel)): Write Apache Camel route 

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.
