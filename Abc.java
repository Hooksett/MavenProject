
public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("Test", "Thapa");
		claculation(1000000, 200);

	}

	public static void test(String name, String lastname) {
		name = name;
		lastname = lastname;
		System.out.println(name + " " + lastname);
	}

	public static void claculation(int i, int j) {

		System.out.println(i * 10 - j);
	}

}
