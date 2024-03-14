package tabung;

public class volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diameter = 5.0; // Diameter tabung
        double tinggi = 10.0; // Tinggi tabung

        // Menghitung jari-jari dari diameter
        double jariJari = diameter / 2.0;

        // Menghitung volume tabung
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;

        // Menampilkan hasil
        System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah: " + volume);
	}

}
