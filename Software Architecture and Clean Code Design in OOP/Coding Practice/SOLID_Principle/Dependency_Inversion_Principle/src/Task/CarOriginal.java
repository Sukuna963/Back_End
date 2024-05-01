package Task;

/*

In this file you can find violation of Dependency Inversion Principle. 
You should refactor this file. 
You can remove this file completely, because it will not be used during the evaluation of the solution.

*/

public class CarOriginal {
    private EngineOriginal engine;

    public CarOriginal() {
        this.engine = new EngineOriginal();
    }

    public void start() {
        engine.start();
    }
}

class EngineOriginal {
    public void start() {
        System.out.println("Engine started.");
    }
}