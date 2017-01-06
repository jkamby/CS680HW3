
public class Student2 {
	// private float tuition;
	private String name;
	private StudentStatus2 status;
	
	public Student2 (StudentStatus2 status, String name) {
		//this.tuition = status.getTuition();
		this.name = name;
		this.status = status;
	}
	
	public float getTuition() {
		return status.getTuition();
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main (String argv[]) {
		Student2 s2 = new Student2(new InState(1000), "John Smith" );
		System.out.println("In-State student's tuition is: " + s2.getTuition());
	}

}
