package ameedf.jb8223.lectures.b4test;

public class Switcher {
	public static void main(String[] args) {
		Switcher switcher = new Switcher();
		switcher.doSwitch(2);
	}

	private void doSwitch(int number) {
		switch (number) {
		case 2:
			number++;
			System.out.println("A " + number);
		case 9:
		case 6:
			number *=2;
			break;
		case 3:
			System.out.println("B " + number);
		case 5:
		case 7:
			System.out.println("C " + number);
		default:
			System.out.println("D " + number);
			break;
		}
		
		System.out.println(number);
	}
	
	
}
