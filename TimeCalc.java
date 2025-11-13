public class TimeCalc {
    public static void main(String[] args) {
		String[] time = args[0].split(":");
        String minutesToAdd = args[1]; // get time  
		int Toadd = Integer.parseInt(minutesToAdd); // get minutes to add
		int hours = Integer.parseInt(time[0]);
		int minutes = Integer.parseInt(time[1]);

		int totalMinutes = hours * 60 + minutes + Toadd; // calculate total minutes
		int newHours = (totalMinutes / 60) % 24; // calculate new hours
		int newMinutes = totalMinutes % 60; // calculate new minutes
		
		if (newMinutes < 10 ) { 
			
			if(newHours < 10) {
				System.out.print("0" + newHours + ":0" + newMinutes);
			}else {
				System.out.print(newHours + ":0" + newMinutes);
			}
		}else {
		    	if(newHours < 10) {
					System.out.print("0" + newHours + ":" + newMinutes);
			    }else {
					System.out.print(newHours + ":" + newMinutes);
				}
		    }
    }
}
