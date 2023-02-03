package exercicesxp;

public class Triangle {
	//Attributs
	private int side1 = 3;
	private int side2 = 4;
	private int side3 = 5;
	
	
	//constructeur sans parametres
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//getters et setters
	public int getSide1() {
		return side1;
	}


	public void setSide1(int side1) {
		this.side1 = side1;
	}


	public int getSide2() {
		return side2;
	}


	public void setSide2(int side2) {
		this.side2 = side2;
	}


	public int getSide3() {
		return side3;
	}


	public void setSide3(int side3) {
		this.side3 = side3;
	}
	
	//methodes
	
	public int perimetre() {
		return (this.side1 + this.side2 + this.side3);
	}
	
	public double area() {
		return ((this.side1 * this.side2) / 2);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle();
		
		System.out.println("Le perimetre du triangle est : " + triangle.perimetre());
		System.out.println("L aire du triangle est : " + triangle.area());

	}


	
}
