# 基镜像
FROM java:8

# 挂载容器文件夹
VOLUME /data /log

ADD mecroserviceEureka.jar app.jar
RUN bash -c 'touch /app.jar'

# 声明容器需要暴露的端口
EXPOSE 8888

# 配置容器启动后执行的命令
ENTRYPOINT ["java", "-jar", "/app.jar", "-Dspring.profiles.active=prod", "com.github.weiwei02.microservice.eureka.mecroserviceeureka.MecroserviceEurekaApplication"]

