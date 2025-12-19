package Tamilnadu.chennai;

public class Office {
	int salary = 25000;

	public static void main(String[] args) {
		Office off = new Office();
		off.work();
		off.recurit();
		off.travel_allowance();
		off.workFromHome();
		System.out.println(off.salary);

	}

	public void work() {
		System.out.println("working");
	}

	protected void recurit() {
		System.out.println("recuriting");
	}

	public void travel_allowance() {
		System.out.println("allowance provided");
	}

	void workFromHome() {
		System.out.println("working from home");
	}

	private void planning() {
		System.out.println("planning....");
	}

}
