public class FormatDate {
	
	public static void printAmerican(String day, String month, int date, int year) {
		
		System.out.printf("%s, %s %d, %d\n", day, month, date, year);
		
		}
		
	public static void printEuropean(String day, String month, int date, int year) {
		
		System.out.printf("%s %d %s %d\n", day, date, month, year);
		
		}
	
	public static void main(String[] args) {
		
		printAmerican("Monday", "July", 22, 2019);
		printEuropean("Monday", "July", 22, 2019);
		
		}
	}
