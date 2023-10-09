version=1.0.6
../gradlew clean bootJar -x test
DOCKER_BUILDKIT=1 docker build . --progress=plain --platform=linux/amd64 -t 8881981/user:$version
#docker build . -t 8881981/user:$version
docker push 8881981/user:$version
