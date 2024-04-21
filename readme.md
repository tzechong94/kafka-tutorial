# Apache Kafka

## Sender app and receiver app

- Sender publish to kafka, receiver subscribe to kafka
- Can have multiple receivers

eg cab booking application
user book a cab, driver assigned, getting constant update (location, time left etc).
without kafka, the update is going to the database, and user app will get request to the db. wont work.

using kafka, every interval driver updates published to kafka topics. user application will subscribe to kafka.
able to manage large volume of requests/load because it is a distributed system, not centralised. different servers different clusters etc.

## Advantages

- High throughput. Able to handle lots of transactions with multiple clusters etc. Don't need to worry about storing data.
- Fault tolerant. Handle replicas. One cluster will be leader, the rest followers.
- Scalable. highly scalable.

## Architecture of apache kafka

- sender and receiver (producer client and consumer client)
- zookeeper, kafka cluster --> makes up the kafka cluster
- zookeeper manages clusters, how many senders receivers etc, meta data
- cluster --> have different brokers. within brokers, there will be different topics. data store within topics. data stored within topics. within topic, there are multiple partitions and offsets. which message to receive first

## Installation

apache kafka quickstart

## Cab booking app

user -> subscribe -> kafka cluster <- publish <- driver

group defines what type of consumer can fetch the data. if a group has multiple consumer, the messages will be distributed across all consumers depending on zookeeper allocation.
