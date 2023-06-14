package session.com.six;

public class ProgrammingAbstractMAin {

	public static void main(String[] args) {
		System.out.println("_____________creating a programming language___________");
		ProgrammingAbstract ab=new JavaPro();
		ab.name();
		ab.medium();
		ab.mode();
		ab.address();
		System.out.println("_____________creating a programming language___________");
		ProgrammingAbstract ap=new CPro();
		ap.name();
		ap.medium();
		ap.mode();
		ap.address();
		

	}

}
