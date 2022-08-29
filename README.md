# demo-springboot-mybatis-hana_cloud_db_trial

빌드
```shell
mvn clean install
```

실행 
```shell
mvn spring-boot:run
```

브라우저 확인

[http://localhost:8080/user/all](http://localhost:8080/user/all)


CF 설치

[https://docs.cloudfoundry.org/cf-cli/install-go-cli.html](https://docs.cloudfoundry.org/cf-cli/install-go-cli.html)


CF 로그인
```shell
cf login <your-cf-api-endpoint>
```

CF에 PUSH
```shell
> cf push starj-boot-demo -p ./target/starj-boot-demo-0.0.1-SNAPSHOT.jar -m 1024M -k 512M

```
