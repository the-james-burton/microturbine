## turbine

### develop


1. install SDKMAN!
1. Use SDKMAN! to install Gradle
1. Use SDKMAN! to install Micronaut cli
1. Use SDKMAN! to install GraalVM
1. Install Kafka...
```shell
sudo apt install openjdk-11-jre
# find your kafka mirror here: https://www.apache.org/dyn/closer.cgi?path=/kafka/2.8.0/kafka_2.13-2.8.0.tgz
wget https://apache.mirrors.nublue.co.uk/kafka/2.8.0/kafka_2.13-2.8.0.tgz
tar -xzf kafka_2.13-2.8.0.tgz
sudo mv kafka_2.13-2.8.0 /usr/local/kafka
rm kafka_2.13-2.8.0.tgz
sudo cp zookeeper.service /etc/systemd/system/
sudo cp kafka.service /etc/systemd/system/
sudo systemctl daemon-reload
sudo systemctl start zookeeper
sudo systemctl status zookeeper
sudo systemctl start kafka
sudo systemctl status kafka
echo PATH='"$PATH:/usr/local/kafka/bin"' >> ~/.profile
source ~/.profile
```
1. Install Elasticsearch...
```shell
wget https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.13.0-linux-x86_64.tar.gz
tar -xzf elasticsearch-7.13.0-linux-x86_64.tar.gz
sudo mv elasticsearch-7.13.0 /usr/local/elasticsearch
rm elasticsearch-7.13.0-linux-x86_64.tar.gz
# TODO - systemd setup
echo PATH='"$PATH:/usr/local/elasticsearch/bin"' >> ~/.profile
source ~/.profile
```

### run locally

./gradelw run


## Micronaut 2.5.4 Documentation

- [User Guide](https://docs.micronaut.io/2.5.4/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.4/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.4/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature kafka-streams documentation

- [Micronaut Kafka Streams documentation](https://micronaut-projects.github.io/micronaut-kafka/latest/guide/index.html#kafkaStream)

## Feature kubernetes documentation

- [Micronaut Kubernetes Support documentation](https://micronaut-projects.github.io/micronaut-kubernetes/latest/guide/index.html)

- [https://kubernetes.io/docs/home/](https://kubernetes.io/docs/home/)

## Feature elasticsearch documentation

- [Micronaut Elasticsearch Driver documentation](https://micronaut-projects.github.io/micronaut-elasticsearch/latest/guide/index.html)

## Feature lombok documentation

- [Micronaut Project Lombok documentation](https://docs.micronaut.io/latest/guide/index.html#lombok)

- [https://projectlombok.org/features/all](https://projectlombok.org/features/all)

## Feature mockito documentation

- [https://site.mockito.org](https://site.mockito.org)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature management documentation

- [Micronaut Management documentation](https://docs.micronaut.io/latest/guide/index.html#management)

## Feature kafka documentation

- [Micronaut Kafka Messaging documentation](https://micronaut-projects.github.io/micronaut-kafka/latest/guide/index.html)

## Feature assertj documentation

- [https://assertj.github.io/doc/](https://assertj.github.io/doc/)

