# Spring boot with redis messaging queue.
If want to learn more about redis pub/sub check this out 
```
 https://medium.com/@jhamukul007/spring-boot-scaling-with-redis-pub-sub-788930a7632e
```

## Requirements
1. Java 11
2. Redis Server 

Produce event to redis 
```
curl --location --request POST 'http://localhost:8081/messaging/produce' \
--header 'Content-Type: application/json' \
--data-raw '{
    "type" : "CHAT",
    "data" : "Arg won"
}'
```
