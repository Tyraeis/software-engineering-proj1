FROM python:3.7

WORKDIR /app

COPY . /app

RUN pip install --trusted-host pypi.python.org -r requirements.txt gunicorn

EXPOSE 8000

CMD ["gunicorn", "-b", "0.0.0.0:8000", "main:app"]
