package Tamilnadu.chennai;
public class BranchOffice{
	public static void main(String[] args) {
		BranchOffice off=new BranchOffice();
		off.celebrate_party();
		Office off1=new Office();
		off1.work();
		off1.recurit();
		System.out.println(off1.salary);
	}
	void celebrate_party() {
		System.out.println("celebrating");
	}

}
