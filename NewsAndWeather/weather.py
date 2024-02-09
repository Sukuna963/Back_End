from flask import (Flask, request)
from flask_restful import Api
import requests
import os
from dotenv import load_dotenv

load_dotenv()
API_KEY = os.getenv('API_WEATHER')

app = Flask(__name__)
api = Api(app)


@app.route('/weather')
def weather():
    city_name = request.args.get('city')
    base_url = "http://api.openweathermap.org/data/2.5/weather?"
    complete_url = base_url + "appid=" + API_KEY + "&q=" + city_name
    response = requests.get(complete_url)

    return response.json()


if __name__ == '__main__':
    app.run(host='0.0.0.0', port='3002', threaded=True, debug=True)
