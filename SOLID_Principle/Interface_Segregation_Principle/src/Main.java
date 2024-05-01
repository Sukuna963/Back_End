public class Main {
    public static void main(String[] args) throws Exception {
        Workable employee = new Employee();
		employee.work();
		
		Workable robot = new Robot();
		robot.work();

		Eatable eater = new Employee();
		eater.eat();

		Sleepable sleeper = new Employee();
		sleeper.sleep();
    }
}
