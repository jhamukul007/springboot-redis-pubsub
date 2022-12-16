# springboot-redis-pubsub
Redis pub/sub with Spring boot


curl --location --request POST 'http://localhost:8081/messaging/produce' \
--header 'Content-Type: application/json' \
--data-raw '{
    "type" : "CHAT",
    "data" : "Arg won"
}'
