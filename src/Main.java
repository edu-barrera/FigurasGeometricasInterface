public class Main {
    public static void main(String[] args) {
        Triangulo everest = new Triangulo("Everest", 30, 25, 20);
        Triangulo t = new Triangulo("TrianguloABC", 300, 200, 175);
        Cuadrado spongebob = new Cuadrado("SpongeBob", 90);
        Rectangulo miku = new Rectangulo("miku", 85, 55);
        Rombo rombus = new Rombo("rombus", 35, 30, 20);
        Romboide boide = new Romboide("boide", 85, 50);
        Trapecio trapo = new Trapecio("trapo", 15, 12, 14, 16, 20, 22, 30);
    
        imprimirCalculo(everest);
        imprimirCalculo(t);
        imprimirCalculo(spongebob);
        imprimirCalculo(miku);
        imprimirCalculo(rombus);
        imprimirCalculo(boide);
        imprimirCalculo(trapo);
    } // main
	public static void imprimirCalculo (FiguraGeometrica f) {
		System.out.println(f);
		System.out.println("+===================================");
		System.out.println(" El area del ["+ f.getNombre() + "] es : " + f.calcularArea());
		System.out.println(" El perimeto de [" + f.getNombre() + "] es : " + f.calcularPerimetro());
		System.out.println("+===================================");
	}//imprimirCalculo
	
}//classMain
