
public class Temperature {
	
	public String weatherOutside(int temp){
		if (temp > 80) {
			return "Hot";
		}else if (temp <= 80 && temp >= 65) {
			return "Warm";
		}else {
			return "Cold";
		}
		
	}
	
}
