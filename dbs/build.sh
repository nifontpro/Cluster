../gradlew clean bootJar -x test
docker build . -t 8881981/user:1.0.1
docker push 8881981/user:1.0.1
