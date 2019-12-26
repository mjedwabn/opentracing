clean:
	./gradlew clean

build:
	./gradlew build
	docker-compose build

stop:
	docker-compose down

start:
	docker-compose up -d

all: clean build stop start
