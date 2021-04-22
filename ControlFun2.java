/**
 * This class has 15 methods related by the fact that CSC 210 students are
 * learning the algorithmic patterns Guarded Selection, Alternative Selection,
 * Multiple Selection using the Java programming language.
 * 
 * The methods will specifically use the if and if..else statements written is
 * virtually all languages because these algorithmic patterns occur so
 * frequently while developing software.
 * 
 * There are several silly contrived methods and several possibly useful
 * methods.
 * 
 * @author Rick Mercer and Omar R. Gebril
 */
public class ControlFun2 {

  // Given 2 strings, a and b, return a string of the form short+long+short, with
  // the shorter string on the outside and the longer string on the inside. The
  // strings will not be the same length, but they may be empty (length() == 0).
  //
  // comboString("Hello", "hi") returns "hiHellohi"
  // comboString("hi", "Hello") returns "hiHellohi"
  // comboString("aaa", "b") returns "baaab"
  //
  // Precondition: a.length() != b.length()
  //
  public String comboString(String a, String b) {
	  if (a.length() != b.length()) {
		  return (b+a+b);
	  }
	return null;
  }

  // Given 2 ints, a and b, return their sum. However, sums in the range 10..19
  // inclusive, are forbidden. In that case just return 20.
  //
  // sortaSum(3, 4) returns 7
  // sortaSum(9, 4) returns 20
  // sortaSum(10, 11) returns 21
  //
  public int sortaSum(int a, int b) {
    int sum = a + b;
    if (sum >= 10 && sum <= 19)
      return 20;
    return sum;
  }

  // Given two strings, append them together ("concatenation") and return the
  // result. However, if the strings are different lengths, omit the beginning
  // chars from the longer string so it is the same length as the shorter string.
  // So "Hello" and "Hi" yield "loHi". The strings may be any length.
  //
  // minCat("Hello", "Hi") returns "loHi"
  // minCat("Hello", "java") returns "ellojava"
  // minCat("java", "Hello") returns "javaello"
  //
  public String minCat(String a, String b) {
	  if (a.length() == b.length()) {
		  return a+b;
	  }
	  else if (a.length() > b.length()) {
		  return a.substring(a.length() - b.length(), a.length())+b;
	  }
	  else {
		  return a+b.substring(b.length() - a.length(), b.length());
	  }
  }

  // Given three String arguments, return the String that lexicographically
  // precedes or is equal to the other two string arguments.
  //
  // firstOf3String("a", "b", "c") returns "a"
  // firstOf3String("X", "b", "c") returns "X"
  // firstOf3String("123", "1231", "123 0") returns "123"
  //
  // You will need to use Strings compareTo method.
  //
  public String firstOf3Strings(String a, String b, String c) {
	  if (a.compareTo(b) > 0) {
		  if (b.compareTo(c) > 0) {
			  return c;
		  }
		  else {
			  return b;
		  }
	  }
	  else {
		  if (a.compareTo(c) > 0) {
			  return c;
		  }
		  else {
			  return a;
		  }
	  }
  }

  // Your cell phone rings. Return true if you should answer it. Normally you
  // answer, except in the morning you only answer if it is your mom calling. In
  // all cases, if you are asleep, you do not answer.
  //
  // answerCell(false, false, false) returns true
  // answerCell(false, false, true) returns false
  // answerCell(true, false, false) returns false
  //
  public boolean answerOrNot(boolean isMorning, boolean isMom, boolean isAsleep) {
	  if (isMorning == true && isMom == true && isAsleep == false) {
		  return true;
	  }
	  else if (isAsleep == true) {
		  return false;
	  }
	  else if (isMorning == true && isMom == false) {
		  return false;
	  }
	  else {
    return true;
	  }
  }

  // Complete method letterGrade that returns the proper letter grade as a string
  // for a plus/minus system with the following scale:
  //
  // Percentage.............. Grade
  // 93.0 ≤ percentage ...... A
  // 90.0 ≤ percentage < 93.0 A-
  // 87.0 ≤ percentage < 90.0 B+
  // 83.0 ≤ percentage < 87.0 B
  // 80.0 ≤ percentage < 83.0 B-
  // 77.0 ≤ percentage < 80.0 C+
  // 70.0 ≤ percentage < 77.0 C
  // 60.0 ≤ percentage < 70.0 D
  // 70.0 D percentage < 60.0 E
  //
  // Precondition: percentage is in the range of 0.0 through 100.0
  //
  public String letterGrade(double percentage) {
		if (percentage < 70.0 && percentage >= 60.0) {
			return "D";
		} else if (percentage < 77.0 && percentage >= 70.0) {
			return "C";
		} else if (percentage < 80.0 && percentage >= 77.0) {
			return "C+";
		} else if (percentage < 83.0 && percentage >= 80.0) {
			return "B-";
		} else if (percentage < 87.0 && percentage >= 83.0) {
			return "B";
		} else if (percentage < 90.0 && percentage >= 87.0) {
			return "B+";
		} else if (percentage < 93.0 && percentage >= 90.0) {
			return "A-";
		} else if (percentage >= 93.0) {
			return "A";
		} else {
			return "E";
		  }
  }

  // Given a string str,if the string starts with"f", return"Fizz".
  // If the string ends with"b", return"Buzz". If both the"f" and "b"
  // conditions are true,return"FizzBuzz". In all other cases,return
  // the string unchanged.
  //
  // fizzString("fig") returns "Fizz"
  //
  // fizzString("dib") returns "Buzz"
  //
  // fizzString("fib") returns "FizzBuzz"
  //
  public String fizzBuzz(String str) {
	  if (str.charAt(0) == 'f' && str.charAt(str.length()-1) != 'b') {
		  return "Fizz";
	  }
	  else if (str.charAt(0) != 'f' && str.charAt(str.length()-1) == 'b') {
		  return "Buzz";
	  }
	  else if (str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b') {
		  return "FizzBuzz";
	  }
	  else {
    return str;
  }
  }

  // Complete the free function salary that returns a salesperson’s salary
  // for the month according to the following policy:
  //
  // Sales . .But
  // Over . . Not Over . . Monthly Salary
  // ======= .======== . . ==============
  // 0 .. . . 10,000 . . . Base salary
  // 10,000 . 20,000 . . . Base salary plus 5% of sales over 10,000
  // 20,000 . 30,000 . . . Base salary plus 500.00 plus 8% of sales over 20,000
  // 30,000 . . . . . . .. Base salary plus 1300.00 plus 12% of sales over 30,000
  //
  // The base salary is $1,500.00, which means salary returns a value that
  // is never less than 1500.00. When sales are over $10,000, commission is
  // added to the base salary. For example, when sales equals 10001, the
  // monthly salary is $1,500.00 + 5% of $1.00 for a total of $1,500.05,
  // and when sales is 20001, the monthly salary is $1,500.00 + $500.00 + 8%
  // of $1.00 for a total of $2,000.08.
  //
  // Precondition: sales >= 0.0 (never negative)
  //
  public double salary(double sales) {
		if (20000 >= sales && sales > 10000) {
			return 1500.00 + 0.05 * (sales - 10000);
		} else if (30000 >= sales && sales > 20000) {
			return 1500.00 + 500.00 + 0.08 * (sales - 20000);
		} else if (30000 < sales) {
			return 1500.00 + 1300.00 + 0.12 * (sales - 30000);
		} else {
			return 1500.00;
		}
  }

  // Complete the free function romanNumeral that returns the numeric
  // equivalent of an upper- or lower-case Roman numeral, which is actually
  // a char. Roman numerals and their decimal equivalents are
  //
  // 'I' (or 'i') = 1
  // 'V' (or 'v') = 5
  // 'X' (or 'x') = 10
  // 'L' (or 'l') = 50
  // 'C' (or 'c') = 100
  // 'D' or ('d') = 500
  // 'M' (or 'm') = 1,000
  //
  // Precondition: numeral is one of the valid 14 Roman numerals shown above
  //
  public int romanNumeral(char numeral) {
	  if (numeral == 'I' || numeral == 'i') {
		  return 1;
	  }
	  else if (numeral == 'V' || numeral == 'v') {
		  return 5;
	  }
	  else if (numeral == 'X' || numeral == 'x') {
		  return 10;
	  }
	  else if (numeral == 'L' || numeral == 'l') {
		  return 50;
	  }
	  else if (numeral == 'C' || numeral == 'c') {
		  return 100;
	  }
	  else if (numeral == 'D' || numeral == 'd') {
		  return 500;
	  }
	  else {
		  return 1000;
	  }
  }
  /////////////////////////////////////////////
  // And now for some Calendar functions
  /////////////////////////////////////////////

  // dayOfWeek returns the string "Monday" if the int argument passed to the
  // parameter dayNumber is 1, return "Tuesday" if the argument 2, and so on up
  // through returning "Sunday" if the argument is 7. This is case sensitive.
  //
  // dayOfWeek(1) returns "Monday"
  // dayOfWeek(2) returns "Tuesday"
  // dayOfWeek(3) returns "Wednesday"
  // dayOfWeek(4) returns "Thursday"
  // dayOfWeek(5) returns "Friday"
  // dayOfWeek(6) returns "Saturday"
  // dayOfWeek(7) returns "Sunday"
  //
  // Precondition: dayNumber is in the range of 1 through 7
  //
  public String dayOfWeek(int dayNumber) {
	  if (dayNumber == 1) {
		  return "Monday";
	  }
	  else if (dayNumber == 2) {
		  return "Tuesday";
	  }
	  else if (dayNumber == 3) {
		  return "Wednesday";
	  }
	  else if (dayNumber == 4) {
		  return "Thursday";
	  }
	  else if (dayNumber == 5) {
		  return "Friday";
	  }
	  else if (dayNumber == 6) {
		  return "Saturday";
	  }
	  else if (dayNumber == 7) {
		  return "Sunday";
	  }
	  else {
		  return "Unknown";
	  }
    
  }

  // In the US, Thanksgiving falls on the 4th Thursday of each November. Complete
  // method thanksDate that determines the day of the month that Thanksgiving
  // falls on no matter the day on which November begins. November can begin on
  // any day where 1 represents Monday, through 7 that represents Sunday. A valid
  // call would be thanksDate(1) to indicate the first day of November is Monday.
  //
  // Arguments can only be 1 (for Monday) through 7 (for Sunday).
  //
  // When 1-Nov is Tuesday thanksDate(2) returns 24
  // When 1-Nov is Thursday, thanksDate(4) returns 22
  // When 1-Nov is Sunday thanksDate(7) returns 26
  //
  // Precondition: day is in the range of 1 through 7.
  //
  public int thanksDate(int day) {
	  if (day <= 4) {
		  return 26-day;
	  }
	  else {
		  return 33 - day;
	  }
  }

  // Given an integer for the month (1 is January and 12 is December) and a
  // Boolean argument that when true represents the northern hemisphere, return
  // the current season in that hemisphere using the table below.
  //
  // month ........inNorthernHemisphere | !inNorthernHemisphere
  // ============ | ====================| =====================
  // 12, 1, or 2 .| "Winter" ...........| "Summer"
  // . 3, 4, or 5 | "Spring" ...........| "Fall"
  // . 6, 7, or 8 | "Summer" ...........| "Winter"
  // 9, 10, or 11 | "Fall" .............| "Spring"
  //
  // Precondition: month is in the range of 1 through 12 inclusive.
  //
  public String season(int month, boolean inNorthernHemisphere) {
	  if (month == 12 || month == 1 || month == 2) {
		  if (inNorthernHemisphere == true) {
			  return "Winter";
		  }
		  else {
			  return "Summer";
		  }
	  }
	  else if (month == 3 || month == 4 || month == 5) {
		  if (inNorthernHemisphere == true) {
			  return "Spring";
		  }
		  else {
			  return "Fall";
		  }
	  }
	  else if (month == 6 || month == 7 || month == 8) {
		  if (inNorthernHemisphere == true) {
			  return "Summer";
		  }
		  else {
			  return "Winter";
		  }
	  }
	  else {
		  if (inNorthernHemisphere == true) {
			  return "Fall";
		  }
		  else {
			  return "Spring";
		  }
	  }
  }

  // Complete method daysInMonth to return the number of days in a month for the
  // given year. There are 30 days in the months September, April, June, and
  // November, or months 9, 4, 6, and 11. February has 28 days unless it is a leap
  // year when it has 29. All other months 1 (Janurary), 3, 5, 7, 8, 10,
  // and 12 (December) have 31 days. Assume the year is always >= 1582, the
  // year this type of calendar started.
  //
  // daysInMonth(1, 2020) returns 31
  // daysInMonth(2, 2019) returns 28
  // daysInMonth(2, 2016) returns 29
  //
  // Preconditions: m is the range of 1 through 12 and year >= 1582
  //
  public int daysInMonth(int m, int year) {
	  if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
		  if (m == 2) {
			  return 29;
		  }
		  else if (m == 9 || m == 4 || m == 6 || m ==11) {
			  return 30;
		  }
		  else {
			  return 31;
		  }
	  }
	  else {
		  if (m == 2) {
			  return 28;
		  }
		  else if (m == 9 || m == 4 || m == 6 || m ==11) {
			  return 30;
		  }
		  else {
			  return 31;
		  }
	  }
  }

  // Complete method dayNumber to return how many days a valid date is into
  // the year. If the string argument is not a value date, return -1.
  //
  // dayNumber("01/03/2016")returns 3
  // dayNumber("12/31/2017")returns 365
  // dayNumber("12/31/2020") returns 366
  // dayNumber("13/11/2020") returns -1
  //
  // Repeating: If the string argument is not a value date, return -1.
  //
  // Precondition: date has a length() of 10 with "/" at index 2 and 5,
  // and only digits 0 through 9 in the other 8 indexes.
  //
   public int dayNumber(String date) {
	   if (Integer.parseInt(date.substring(0,2)) < 1 || Integer.parseInt(date.substring(0,2)) > 12) {
		   return -1;
	   }
	   else if (Integer.parseInt(date.substring(0,2)) == 1) {
		   if (Integer.parseInt(date.substring(3,5)) >=1 && Integer.parseInt(date.substring(3,5)) <= 31) {
			   return Integer.parseInt(date.substring(3,5));
		   }
		   else {
			   return -1;
		   }
	   }
	   else if (Integer.parseInt(date.substring(0,2)) == 2) {
		   if (Integer.parseInt(date.substring(6)) % 4 == 0 && Integer.parseInt(date.substring(6)) % 100 != 0 || Integer.parseInt(date.substring(6)) % 400 == 0) {
			   if (Integer.parseInt(date.substring(3,5))>=1 && Integer.parseInt(date.substring(3,5))<=29) {
				   return 31 + Integer.parseInt(date.substring(3,5));
			}
		   }
		   else if (Integer.parseInt(date.substring(3,5))>=1 && Integer.parseInt(date.substring(3,5))<=28){
			   return 31 + Integer.parseInt(date.substring(3,5));
		   }
		   
	   }
	   else if (Integer.parseInt(date.substring(0,2))==3 || Integer.parseInt(date.substring(0,2))==5 || Integer.parseInt(date.substring(0,2))==7 || Integer.parseInt(date.substring(0,2))==8
			   || Integer.parseInt(date.substring(0,2))==10 || Integer.parseInt(date.substring(0,2))==12) {
		   if (Integer.parseInt(date.substring(3,5))>=1 && Integer.parseInt(date.substring(3,5))<=31) {
			   return (Integer.parseInt(date.substring(0,2))/2)*31 +(Integer.parseInt(date.substring(0,2))-(Integer.parseInt(date.substring(0,2))/2 +2))*30 + 28 + Integer.parseInt(date.substring(3,5));
		   }
	   }
	   else if (Integer.parseInt(date.substring(0,2))==4 || Integer.parseInt(date.substring(0,2))==6 || Integer.parseInt(date.substring(0,2))==9 || Integer.parseInt(date.substring(0,2))==11) {
		   if (Integer.parseInt(date.substring(3,5))>=1 && Integer.parseInt(date.substring(3,5))<=30) {
			   return (Integer.parseInt(date.substring(0,2))/2 -2)*30 + (Integer.parseInt(date.substring(0,2))-Integer.parseInt(date.substring(0,2))/2)*31 +28 + Integer.parseInt(date.substring(3,5));
		   }
	   }
	   
	   return -1;
   }
  // Write function validDate to return true if the string argument is
  // a valid calendar date. The arguments always take the form of month, day,
  // and year as positive integers separated by / as in "mm/dd/yyyy".
  // If the String argument does not express a valid date, return false.
  //
  // You will need the static method Integer.parseInt(String possibleInt) that
  // returns the integer value of the string argument. For example,
  // Integer.parseInt("08") returns 8 and Integer.parseInt("2021") returns 2021.
  //
  // validDate("01/31/2016") returns true
  // validDate("12/31/2017") returns true
  // validDate("06/15/2018") returns true
  // validDate("02/28/2019") returns true
  // validDate("02/29/2019") returns false
  // validDate("2019/06/06") returns false
  // validDate("02/29/2100") returns false
  // validDate("13/02/2019") returns false
  // validDate("12/32/2019") returns false
  //
  // Precondition: date has a length() of 10 with "/" at index 2 and 5,
  // and only digits 0 through 9 in the other 8 indexes.
  //
  public boolean validDate(String date) {
	  if (Integer.parseInt(date.substring(0,2)) <= 0 || Integer.parseInt(date.substring(0,2)) > 12) {
		  return false;
	  }
	  else if (Integer.parseInt(date.substring(0,2)) == 2) {
		  if (Integer.parseInt(date.substring(6)) % 4 == 0 && Integer.parseInt(date.substring(6)) %100 != 0 || (Integer.parseInt(date.substring(6)) %100 ==0 && Integer.parseInt(date.substring(6)) %400 ==0)) {
			  return 1 <= Integer.parseInt(date.substring(3,5)) && Integer.parseInt(date.substring(3,5)) <= 29;
		  }
		  else {
			  return 1<= Integer.parseInt(date.substring(3,5)) && Integer.parseInt(date.substring(3,5)) <= 28;
		  }
	  }
	  else if(Integer.parseInt(date.substring(0,2)) == 4 || Integer.parseInt(date.substring(0,2))==6 ||Integer.parseInt(date.substring(0,2))==9 || Integer.parseInt(date.substring(0,2))==11){{
		  return 1 <= Integer.parseInt(date.substring(3,5)) && Integer.parseInt(date.substring(3,5)) <= 30;
	  }}
	  else {
		  return 1 <= Integer.parseInt(date.substring(3,5)) && Integer.parseInt(date.substring(3,5)) <= 31;
	  }

}}
