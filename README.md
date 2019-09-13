# Software Engineering Project 1

## Virtual Machine

### Setup

Install dependency packages:
```
$ sudo apt-get update
$ sudo apt-get install python3 python3-pip openjdk-11-jdk maven nginx
```

Install Python dependencies and start the Python server:
```
$ cd python
$ pip3 install -r requirements.txt gunicorn
$ gunicorn -D -b "0.0.0.0:8080" main:app
$ cd ..
```

If running the `gunicorn` command fails, `~/.local/bin` may be missing from your `PATH`. Running `source ~/.profile` will fix this issue.

Compile and start the Java server:
```
$ cd java
$ mvn verify
$ nohup java -jar target/project1-1.0-jar-with-dependencies.jar &
$ cd ..
```

Setup nginx:
```
$ sudo cp nginx.conf /etc/nginx/nginx.conf
$ sudo /usr/sbin/nginx -s reload
```

### Usage

The Python server is reachable at `http://SERVER_ADDRESS/pythonrng`. The Java server is reachable at `http://SERVER_ADDRESS/javarng`.

Example:
```
$ curl http://localhost/pythonrng
795016
$ curl http://localhost/javarng
384129
```

## App Engine

Deploying projects to App Engine requires the Google Cloud SDK. Instructions on how to download it can be found [here](https://cloud.google.com/sdk/docs/).

You will also have to create a Google Cloud project and an App Engine app. You can create them using the `gcloud` command:
```
$ gcloud project create [YOUR_PROJECT_ID]
$ gcloud app create --project=[YOUR_PROJECT_ID]
```

### Python

Deploying the Python App Engine server:
```
$ cd python
$ gcloud app deploy
```

### Java

Deploying the Java App Engine server:
```
$ cd java
$ gcloud app deploy
```


