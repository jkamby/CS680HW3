
public class OutState extends StudentStatus2 {
	protected float tuition;
	
	public OutState (float tuition) {
		this.tuition = tuition;
	}
	
	@Override
	public float getTuition() {
		return tuition;
	}

}
