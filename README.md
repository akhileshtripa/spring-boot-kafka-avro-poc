Demonstrate, how to use the confluent schema registry together with spring-boot-kafka.

# Confluent Platform

[Confuent Open Source](https://www.confluent.io/download/) platform.

    bin/confluent start
    
# building and running the program

    mvn spring-boot:run
    

Run output would look like:

```            
      ,--. ,--.           ,---. ,--.                ,---.                   ,--. ,--.                   ,--.   ,--.                  ,------.
      |  .'   /  ,--,--. /  .-' |  |,-.   ,--,--.  /  O  \   ,---.   ,---.  |  | `--'  ,---.  ,--,--. ,-'  '-. `--'  ,---.  ,--,--,  |  .--. ' ,--.,--. ,--,--,  ,--,--,   ,---.  ,--.--.
      |  .   '  ' ,-.  | |  `-, |     /  ' ,-.  | |  .-.  | | .-. | | .-. | |  | ,--. | .--' ' ,-.  | '-.  .-' ,--. | .-. | |      \ |  '--'.' |  ||  | |      \ |      \ | .-. : |  .--'
      |  |\   \ \ '-'  | |  .-' |  \  \  \ '-'  | |  | |  | | '-' ' | '-' ' |  | |  | \ `--. \ '-'  |   |  |   |  | ' '-' ' |  ||  | |  |\  \  '  ''  ' |  ||  | |  ||  | \   --. |  |
      `--' '--'  `--`--' `--'   `--'`--'  `--`--' `--' `--' |  |-'  |  |-'  `--' `--'  `---'  `--`--'   `--'   `--'  `---'  `--''--' `--' '--'  `----'  `--''--' `--''--'  `----' `--'
                                                            `--'    `--'
      2020-01-18 13:57:20.561  INFO 13072 --- [           main] com.kafka.poc.KafkaPoCApplicationRunner  : Starting KafkaPoCApplicationRunner on DESKTOP-IRD1RU1 with PID 13072 (C:\Users\91999\workspace\spring-boot-kafka-with-avro\target\classes started by 91999 in C:\Users\91999\workspace\spring-boot-kafka-with-avro)
      2020-01-18 13:57:20.568 DEBUG 13072 --- [           main] com.kafka.poc.KafkaPoCApplicationRunner  : Running with Spring Boot v2.0.2.RELEASE, Spring v5.0.6.RELEASE
      2020-01-18 13:57:20.568  INFO 13072 --- [           main] com.kafka.poc.KafkaPoCApplicationRunner  : No active profile set, falling back to default profiles: default
      2020-01-18 13:57:23.148  INFO 13072 --- [           main] com.kafka.poc.KafkaPoCApplicationRunner  : Started KafkaPoCApplicationRunner in 3.081 seconds (JVM running for 3.937)
      2020-01-18 13:57:23.343  INFO 13072 --- [           main] com.kafka.poc.KafkaProducer              : producing {"lastName": "Mann", "firstName": "Anni"}, {"zip": "22322", "city": "Leutesdorf", "street": "Hopfenleite", "streetNumber": "14"}
      2020-01-18 13:57:23.375  WARN 13072 --- [           main] o.a.k.clients.producer.ProducerConfig    : The configuration 'specific.avro.reader' was supplied but isn't a known config.
      2020-01-18 13:57:25.367  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:25.417  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:27.477  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:27.514  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:29.616  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:29.675  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:31.907  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:31.956  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:34.290  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:34.481  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:37.254  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:37.254  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:40.196  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:40.322  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:43.081  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:43.477  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:46.039  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:46.670  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:49.201  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:49.845  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:52.497  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:53.113  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:55.577  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:56.278  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:58.448  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:57:59.346  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:01.622  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:02.306  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:04.870  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:05.341  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:07.968  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:08.621  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:11.190  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:11.584  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:14.301  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:14.463  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:17.180  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:17.462  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:20.183  WARN 13072 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-1, groupId=a72d98a2-95ed-416d-82e4-798bb27b8cca] Connection to node -1 could not be established. Broker may not be available.
      2020-01-18 13:58:20.457  WARN 13072 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 could not be established. Broker may not be available.

```
