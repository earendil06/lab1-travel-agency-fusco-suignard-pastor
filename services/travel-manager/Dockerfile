FROM tomee:8-jre-7.0.3-plus

WORKDIR /usr/local/tomee/

COPY ./target/service-travel-manager.war ./webapps/.
#
### Configuring the network.properties file (default values are provided)
#ENV db_host=localhost
#ENV db_port=27017
#
### We need to install the `jar` command to modify the network.properties file
###
RUN apt-get  update \
      && apt-get --no-install-recommends install -y openjdk-8-jdk \
      && rm -rf /var/lib/apt/lists/*

COPY ./start_in_docker.sh start.sh
RUN ["chmod", "u+x", "./start.sh"]

HEALTHCHECK --interval=5s CMD curl --fail http://localhost:8080/ || exit 1

EXPOSE 8080

ENTRYPOINT ["./start.sh"]