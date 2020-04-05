package akshay;


public class SwitchExpressionDemo {
	
	public static void main(String[] args) {
		
		String monthName = getMonthName(1);
		
		System.out.println(monthName);
	}
	
	@SuppressWarnings("preview")
	private static String getMonthName(int monthNum) {
		
		String monthName = switch (monthNum) {
			
			case 1 -> {
				
				String s = "January";
				yield s;
				
			}
			case 2 -> {
				
				String s = "January";
				yield s;
				
			}
			case 3 -> {
				
				String s = "January";
				yield s;
				
			}
			case 4 -> {
				
				String s = "January";
				yield s;
				
			}
			default -> throw new IllegalArgumentException("Unexpected value: " + monthNum);
			
		};
		
		return monthName;
		
	}
	
}
