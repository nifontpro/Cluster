version=1.0.2
../gradlew clean bootJar -x test
#docker build . -t 8881981/rs:$version
DOCKER_BUILDKIT=1 docker build . --platform=linux/amd64 -t 8881981/rs:$version
docker push 8881981/rs:$version