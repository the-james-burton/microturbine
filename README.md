## turbine [![Build Status](https://travis-ci.com/the-james-burton/microturbine.svg?branch=main)](https://travis-ci.com/github/the-james-burton/microturbine)


### develop

1. install SDKMAN!
1. Use SDKMAN! to install Gradle
1. Use SDKMAN! to install Micronaut cli
1. Use SDKMAN! to install GraalVM
1. Install Kafka...

```shell
sudo apt install openjdk-11-jre
# find your kafka mirror here: https://www.apache.org/dyn/closer.cgi?path=/kafka/2.8.0/kafka_2.13-2.8.0.tgz
curl -O https://apache.mirrors.nublue.co.uk/kafka/2.8.0/kafka_2.13-2.8.0.tgz
# sha512 checking does not work for kafka as the hash is not published in a compatible format, so just eyeball instead
curl -O https://downloads.apache.org/kafka/2.8.0/kafka_2.12-2.8.0.tgz.sha512
sha512sum kafka_2.13-2.8.0.tgz
cat kafka_2.13-2.8.0.tgz.sha512
tar -xzf kafka_2.13-2.8.0.tgz
sudo mv kafka_2.13-2.8.0 /usr/local/kafka
rm kafka_2.13-2.8.0.tgz
sudo cp zookeeper.service /etc/systemd/system/
sudo cp kafka.service /etc/systemd/system/
sudo systemctl daemon-reload
sudo systemctl enable zookeeper
sudo systemctl start zookeeper
sudo systemctl status zookeeper
sudo systemctl enable kafka
sudo systemctl start kafka
sudo systemctl status kafka
echo PATH='"$PATH:/usr/local/kafka/bin"' >> ~/.profile
source ~/.profile
```

6. Install Elasticsearch...

```shell
curl -O https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.13.0-linux-x86_64.tar.gz
curl https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.13.0-linux-x86_64.tar.gz.sha512 | shasum -a 512 -c -
tar -xzf elasticsearch-7.13.0-linux-x86_64.tar.gz
sudo mv elasticsearch-7.13.0 /usr/local/elasticsearch
rm elasticsearch-7.13.0-linux-x86_64.tar.gz
sudo groupadd elasticsearch
sudo usermod -a -G elasticsearch $USER
sudo useradd -g elasticsearch elasticsearch
sudo chown -hR elasticsearch:elasticsearch /usr/local/elasticsearch
sudo mkdir /usr/local/elasticsearch/run
sudo chmod -R 775 /usr/local/elasticsearch/
sudo cp elasticsearch.service /etc/systemd/system/
sudo systemctl daemon-reload
sudo systemctl enable elasticsearch
sudo systemctl start elasticsearch
sudo systemctl status elasticsearch
echo PATH='"$PATH:/usr/local/elasticsearch/bin"' >> ~/.profile
source ~/.profile
```

7. Install Kibana...

```shell
curl -O https://artifacts.elastic.co/downloads/kibana/kibana-7.13.1-linux-x86_64.tar.gz
curl https://artifacts.elastic.co/downloads/kibana/kibana-7.13.1-linux-x86_64.tar.gz.sha512 | shasum -a 512 -c -
tar -xzf kibana-7.13.1-linux-x86_64.tar.gz
sudo mv kibana-7.13.1-linux-x86_64 /usr/local/kibana
rm kibana-7.13.1-linux-x86_64.tar.gz
sudo groupadd kibana
sudo usermod -a -G kibana $USER
sudo useradd -g kibana kibana
sudo chown -hR kibana:kibana /usr/local/kibana
sudo chmod -R 775 /usr/local/kibana/
sudo cp kibana.service /etc/systemd/system/
sudo systemctl daemon-reload
sudo systemctl enable kibana
sudo systemctl start kibana
sudo systemctl status kibana
echo PATH='"$PATH:/usr/local/kibana/bin"' >> ~/.profile
source ~/.profile
```

### setup kafka

```shell
kafka-topics.sh --create --topic heartbeat-events --bootstrap-server localhost:9092
kafka-topics.sh --create --topic example-events --bootstrap-server localhost:9092
```

### run locally

./gradelw run

## Micronaut 3.1.1 Documentation

- [User Guide](https://docs.micronaut.io/3.1.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.1.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.1.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature kafka-streams documentation

- [Micronaut Kafka Streams documentation](https://micronaut-projects.github.io/micronaut-kafka/latest/guide/index.html#kafkaStream)

## Feature mockito documentation

- [https://site.mockito.org](https://site.mockito.org)

## Feature lombok documentation

- [Micronaut Project Lombok documentation](https://docs.micronaut.io/latest/guide/index.html#lombok)

- [https://projectlombok.org/features/all](https://projectlombok.org/features/all)

## Feature elasticsearch documentation

- [Micronaut Elasticsearch Driver documentation](https://micronaut-projects.github.io/micronaut-elasticsearch/latest/guide/index.html)

## Feature openrewrite documentation

- [https://docs.openrewrite.org/](https://docs.openrewrite.org/)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature assertj documentation

- [https://assertj.github.io/doc/](https://assertj.github.io/doc/)

## Feature reactor documentation

- [Micronaut Reactor documentation](https://micronaut-projects.github.io/micronaut-reactor/snapshot/guide/index.html)

## Feature kafka documentation

- [Micronaut Kafka Messaging documentation](https://micronaut-projects.github.io/micronaut-kafka/latest/guide/index.html)


