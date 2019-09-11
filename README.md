# Software Engineering Project 1

## Virtual Machine

### Setup

Install dependency packages:
```
$ sudo apt-get update
$ sudo apt-get install git python3 python3-pip nginx
```

Clone the repository:
```
$ git clone https://github.com/Tyraeis/software-engineering-proj1.git
```

Install Python dependencies and start the Python server:
```
$ cd python
$ pip3 install -r requirements.txt gunicorn
$ gunicorn -D -b "0.0.0.0:8080" main:app
$ cd ..
```

Start the Java server:
```
TODO
```

Setup nginx:
```
$ sudo cp nginx.conf /etc/nginx/nginx.conf
$ sudo /usr/sbin/nginx -s reload
```

### Usage

The Python server is reachable at `http://<SERVER_ADDRESS>/python`. The Java server is reachable at `http://<SERVER_ADDRESS>/java`.

Example:
```
$ curl http://localhost/python
795016
$ curl http://localhost/java
384129
```

## App Engine

Deploying projects to App Engine requires the Google Cloud SDK. Instructions on how to download it can be found [here](https://cloud.google.com/sdk/docs/).

You will also have to create a project for your app. You can create one using the `gcloud` command:
```
$ gcloud project create [YOUR_PROJECT_ID]
```

### Python

Deploying the Python App Engine server:
```
$ cd python
$ gcloud app create --project=[YOUR_PROJECT_ID]
$ gcloud app deploy
```

Your app will be available at `http://YOUR_PROJECT_ID.appspot.com`.

### Java

TODO


