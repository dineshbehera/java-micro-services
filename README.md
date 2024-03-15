# java-micro-services


## service-discovery
http://localhost:8761


## customer
http://localhost:8081


## product
http://localhost:8082

## admin
http://localhost:8083


## api-gateway
port : 8090

## config-server
port : 8888

How to know if config server is working or not ?

How to check the properties of the client who is using confog-server ?
Ans:-  for application named "customer" check the properties as below
`http://localhost:8888/customer/default`

If you want to know any properties of any specific profile "profile1" then
`http://localhost:8888/customer/profile1`


`http://localhost:8888/product/default`


