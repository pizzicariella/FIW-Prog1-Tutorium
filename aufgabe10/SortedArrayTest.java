package tutorium.aufgabe10;

public class SortedArrayTest {

	public static void main(String[] args) {
		SortedArray sa = new SortedArray();
		sa.print();
		sa.insert(6);
		sa.print();
		sa.insert(2);
		sa.print();
		sa.insert(5);
		sa.print();
		sa.insert(7);
		sa.print();
		sa.delete(3);
		sa.print();
		sa.delete(4);
		sa.print();
		sa.delete(7);
		sa.print();
		sa.delete(2);
		sa.print();
		sa.insert(5);
		sa.print();
		sa.delete(5);
		sa.print();
		sa.delete(6);
		sa.print();
		sa.delete(3);
	}

}
