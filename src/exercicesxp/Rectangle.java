package exercicesxp;

public class Rectangle {
	//Attributs
		private int length;
		private int breadth;
		
		//costructeur sans parametres
		public Rectangle() {
			super();
			// TODO Auto-generated constructor stub
		}
		//constructeur avec parametres
		public Rectangle(int length, int breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}
		
		//getters et setters
	public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getBreadth() {
			return breadth;
		}
		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}
		
		public double area() {
			return (this.length * this.breadth);
		}
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Rectangle rectangle1 = new Rectangle(4 , 5);
		Rectangle rectangle2 = new Rectangle(5 , 8);
		
		System.out.println("L'aire du rectangle 1 est : " + rectangle1.area());
		System.out.println("L'aire du rectangle 2 est : " + rectangle2.area());

	}
		

	

}
