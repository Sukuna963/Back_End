from chalice import Chalice


app = Chalice(app_name='hello_world')


@app.route('/')
def index():
    return {'hello': 'world'}
