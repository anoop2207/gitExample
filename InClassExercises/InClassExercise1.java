package basic.java.program;

public class InClassExercise1 {
	public static void main(String[] args) {
		InClassExercise1 inc1 = new InClassExercise1();
		System.out.println(inc1.convertToKgs(100.0));
		System.out.println(inc1.convertToLbs(45.4));
	}
	public Double convertToKgs(Double pounds) {
		return pounds*0.454;
	}
	public Double convertToLbs(Double kgs) {
		return kgs*2.2;
	}
}
