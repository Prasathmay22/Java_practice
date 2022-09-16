package Abstraction;

abstract class cs_dept {
	
	abstract void Team();
}

class Dev extends cs_dept{
	
	public void Team() {
		System.out.println("You are in Dev Team");
}
}

class Test extends cs_dept{
	
	public void Team() {
		System.out.println("You are in Testing Team");
}

	public static void main(String[] args) {
		Dev t1 = new Dev();
		t1.Team();
		Test t2 = new Test();
		t2.Team();
}
	
}
