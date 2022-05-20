# Protobuf Tutorial

This is a tutorial to demonstrate serializing and deserializing object data in a persistent memory system (local file disk).

### Get Started

Install dependencies

```bash
brew install mvn
brew install protobuf
```

Generate proto java classes from `*.proto`

```bash
protoc  --java_out=java/src/main/java proto_files/greeting.proto
```

Build the project

```bash
mvn package
```

### Rebuild the project

```bash
mvn clean install
```

### Execute the writer

```bash
java -cp target/protobuf-tutorial-1.0.jar com.tutorialspoint.greeting.GreetWriter Janice Hey
```

### Execute the reader

```bash
java -cp target/protobuf-tutorial-1.0.jar com.tutorialspoint.greeting.GreetReader
```

### Notes on pom.xml

The below config is to create an uber jar and shade its contents in `package` phase.

```xml
<executions>
    <execution>
        <phase>package</phase>
        <goals>
            <goal>shade</goal>
        </goals>
    </execution>
</executions>
```

More details on https://stackoverflow.com/a/49811665/8893023.
