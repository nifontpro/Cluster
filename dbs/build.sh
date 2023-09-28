version=1.0.3
../gradlew clean bootJar -x test
docker build . -t 8881981/user:$version
docker push 8881981/user:$version
