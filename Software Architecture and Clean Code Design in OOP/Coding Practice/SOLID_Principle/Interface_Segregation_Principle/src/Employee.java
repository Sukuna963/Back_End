public class Employee implements Workable, Eatable, Sleepable {
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