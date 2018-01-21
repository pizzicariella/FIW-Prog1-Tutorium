package tutorium.probeklausur3;

public class KlausurMain {

	public static void main(String[] args) {
		Computer c1 = Computer.herstellen("lenovo", 8, 256);
		Computer c2 = Computer.herstellen("lenovo", 16, 512);
		Computer c3 = Computer.herstellen("apple", 4, 256);
		Computer c4 = Computer.herstellen("apple", 8, 512);
		Computer c5 = Computer.herstellen("dell", 8, 256);
		c1.print();
		c2.print();
		c3.print();
		c4.print();
		c5.print();
		System.out.println(c1.gleicherHersteller(c2));
		System.out.println(c1.gleicherHersteller(c3));
		Notebook n1 = Notebook.herstellen("lenovo", 8, 256,  13);
		Notebook n2 = Notebook.herstellen("lenovo", 16, 512, 15);
		n1.print();
		n2.print();
		NotebookArray nba = new NotebookArray(10);
		nba.konfigurieren();
		nba.print();
		nba.sortRamPlatte();
		nba.print();
		NotebookArray nba2 = nba.getHersteller("apple");
		nba2.print();
		NotebookArray nba3 = nba.getHersteller("lenovo");
		nba3.print();
		NotebookArray nba4 = nba.getHersteller("dell");
		nba4.print();
	}

}
