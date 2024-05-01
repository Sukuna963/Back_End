package Task;

/*

In this file you can find violation of Interface Segregation Principle. 
You should refactor this file. 
You can remove this file completely, because it will not be used during the evaluation of the solution.

*/

//Client code
public class DemoOriginal {
	public static void main(String[] args) {
		WorkerOriginal employee = new EmployeeOriginal();
		employee.work();
		employee.eat();
		employee.sleep();
	}
}

//Original interface violating ISP
interface WorkerOriginal {
	void work();

	void eat();

	void sleep();
}

//Original class implementing the interface
class EmployeeOriginal implements WorkerOriginal {
	@Override
	public void work() {
		System.out.println("Employee is working");
	}

	@Override
	public void eat() {
		System.out.println("Employee is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Employee is sleeping");
	}
}


class RobotOriginal implements WorkerOriginal {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        // This method doesn't make sense for a robot
        // Implementation might not be meaningful
    }

    @Override
    public void sleep() {
        // This method doesn't make sense for a robot
        // Implementation might not be meaningful
    }
}