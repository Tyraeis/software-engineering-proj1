import random
from flask import Flask

RANDOM_MIN = 1
RANDOM_MAX = 1000000

app = Flask(__name__)

@app.route("/")
def index():
    return "{}".format(random.randint(RANDOM_MIN, RANDOM_MAX))