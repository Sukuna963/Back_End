from flask import (Flask, request)
from flask_restful import Api
import requests
import os
from dotenv import load_dotenv

load_dotenv()
API_KEY = os.getenv('API_NEWS')

app = Flask(__name__)
api = Api(app)


@app.route('/news')
def news():
    country_name = request.args.get('country')
    base_url = "http://newsapi.org/v2/top-headlines?"
    complete_url = base_url + "country=" + country_name + "&apiKey=" + API_KEY
    response = requests.get(complete_url)

    return response.json()


if __name__ == '__main__':
    app.run(host="0.0.0.0",port='3003',threaded=True,debug=True)
