package exercicesxp;

public class Student {
	//Attributs
	private String name;
	private int roll_no;
	
	//constructeur sans parametres
	public Student() {
		super();
	}
	
	//constructeur avec parametres

	public Student(String name, int roll_no) {
		super();
		this.name = name;
		this.roll_no = roll_no;
	}
	
	//getters et setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	//methode
	public void displayInfoStudent() {
		System.out.println("name is : " + name + " and roll_no is : " + roll_no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student etudiant = new Student("John" , 2);
		etudiant.displayInfoStudent();

	}

}
