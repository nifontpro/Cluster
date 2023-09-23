version=1.0.1
../gradlew clean bootJar -x test
docker build . -t 8881981/rs:$version
docker push 8881981/rs:$version
