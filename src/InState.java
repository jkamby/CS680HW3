
public class InState extends StudentStatus2 {
	protected float tuition;
	
	public InState (float tuition) {
		this.tuition = tuition;
	}
	
	@Override
	public float getTuition() {
		return tuition;
	}

}
