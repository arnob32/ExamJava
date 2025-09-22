package raju;

public class MathCalc {

	public static void main(String[] args) {
		
		    double earthRadius = 3800.0;
	        double sunRadius = 432500.0;

	        // Volume = (4/3) * π * r^3
	        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
	        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

	        // Ratio
	        double ratio = sunVolume / earthVolume;

	        System.out.println("Volume of Earth: " + earthVolume + " cubic miles");
	        System.out.println("Volume of Sun: " + sunVolume + " cubic miles");
	        System.out.println("Ratio (Sun/Earth): " + ratio);

	}

}
