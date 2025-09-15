package module3._2traversing;

public class E01Trace1 {

	//Exercise 1: Trace the execution of the following code,
	//then run it to see if you were correct
	public static void main(String[] args) {
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};

		for (int i = 0; i < names.length; i++) { //Have to perform an array traversal to see the contents of an array (cannot simply print it -> won't work)
			System.out.println( names[i] );
		}
	}
}

