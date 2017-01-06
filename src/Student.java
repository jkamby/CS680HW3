
public class Student {
	private float tuition;
	private String name;
	
	public Student (StudentStatus status, String name) {
		this.tuition = status.getTuition();
		this.name = name;
	}
	
	public float getTuition() {
		return this.tuition;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main (String argv[]) {
		Student s1 = new Student(StudentStatus.INSTATE,	"John Smith" );
		System.out.println("In-State student's tuition is: " + s1.getTuition());
	}

}
