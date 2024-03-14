package lingkaran;

public class kelilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diameter = 10;
        double keliling = hitungKelilingLingkaran(diameter);
        System.out.println("Keliling lingkaran dengan diameter " + diameter + " adalah: " + keliling);
	}
	
	public static double hitungKelilingLingkaran(double diameter) {
        double jariJari = diameter / 2;
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }

}
