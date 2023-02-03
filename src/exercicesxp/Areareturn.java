package exercicesxp;

import java.util.Scanner;

public class Areareturn {
	//Attributs
	private int lenght;
	private int breadth;
	
	//constructeur sans parametres
	public Areareturn() {
		super();
	}
	
	
	//costructeur avec parametres
	public Areareturn(int lenght, int breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}
	
	//getters et setters
	public int getLenght() {
		return lenght;
	}


	public void setLenght(int lenght) {
		this.lenght = lenght;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	private double Area() {
		double aire = this.breadth * this.lenght;
		return aire;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demande à léutilisateur d'entrer la longueur du rectangle
		System.out.print("Entrer la longueur du rectangle est : " );
		Scanner sc = new Scanner(System.in);
		
		int longueur = sc.nextInt();
		//demande à léutilisateur d'entrer la hauteur du rectangle
		System.out.print("Entrer la hauteur du rectangle est : " );
		
		int hauteur = sc.nextInt();
		
		//instancier la classe reareturn
		Areareturn rectangle = new Areareturn(longueur, hauteur);
		
		System.out.println("la longueur du rectangle est : " + rectangle.getLenght());
		System.out.println("la hauteur du rectangle est : " + rectangle.getBreadth());
		System.out.println("L'aire du rectangle est : " + rectangle.Area());
		
	

	}

	

}
