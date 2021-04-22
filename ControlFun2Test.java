
/*
 * This unit test has at least one @Test method for each of the 15 methods 
 * in ControlFun2.java. However, they are incomplete, and do not represent 
 * 100% code coverage. This is meant to encourage you to think of other 
 * needed test cases and add your own asserts. 
 * 
 * We will run a unit test that is much much larger than this starter unit test. 
 * 
 * We will also run your tests to see code coverage, which is part of your grade.
 * 
 * Think of as many test cases as you can
 * 
 * Programmers: Rick Mercer and Omar Gebril
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class ControlFun2Test {

  private ControlFun2 myFun = new ControlFun2();

  @Test
  // Recommended: Run one @Test method at a time as you work on only
  // one method at a time.
  // 1. Highlight the method name
  // 2. Right click on that method name
  // 3. From the menu, select: Run As > JUnit Test
  public void testCombostring() {
    assertEquals("hiHellohi", myFun.comboString("Hello", "hi"));
    assertEquals("HellohiHello", myFun.comboString("hi", "Hello"));
    assertEquals("baaab", myFun.comboString("aaa", "b"));
    assertEquals(null, myFun.comboString("aaa", "bbb"));
  }

  @Test
  public void testSortasum() {
    assertEquals(7, myFun.sortaSum(3, 4));
    assertEquals(20, myFun.sortaSum(7, 4));
    assertEquals(20, myFun.sortaSum(6, 8));
  }

  @Test
  public void testMincat() {
    assertEquals("123456", myFun.minCat("123", "456"));
    assertEquals("loHi", myFun.minCat("Hello", "Hi"));
    assertEquals("ellojava", myFun.minCat("Hello", "java"));
    assertEquals("javaello", myFun.minCat("java", "Hello"));
  }

  @Test
  public void testSalary() {
    assertEquals(1500.0, myFun.salary(9999.00), 0.01);
    assertEquals(1500.05, myFun.salary(10001.00), 0.01);
    assertEquals(2000.08, myFun.salary(20001.00), 0.01);
    assertEquals(2800.12, myFun.salary(30001.00), 0.01);
  }

  @Test
  public void testFirstofthree() {
    assertEquals("Ma", myFun.firstOf3Strings("Ma", "ma", "ma"));
    assertEquals("a", myFun.firstOf3Strings("a", "b", "c"));
    assertEquals("a", myFun.firstOf3Strings("b", "a", "c"));
    assertEquals("c", myFun.firstOf3Strings("e", "d", "c"));
    assertEquals("X", myFun.firstOf3Strings("X", "b", "c"));
    assertEquals("123", myFun.firstOf3Strings("123", "1231", "123 0"));
  }

  @Test
  public void testAnswerOrNot() {
    assertFalse(myFun.answerOrNot(true, true, true));
    assertFalse(myFun.answerOrNot(false, false, true));
    assertFalse(myFun.answerOrNot(true, false, false));
    assertTrue(myFun.answerOrNot(false, false, false));
    assertTrue(myFun.answerOrNot(true, true, false));
  
  }

  @Test
  public void testLettergrade() {
    assertEquals("A", myFun.letterGrade(94.0));
    assertEquals("A-", myFun.letterGrade(92.0));
    assertEquals("B", myFun.letterGrade(84.0));
    assertEquals("B-", myFun.letterGrade(82.0));
    assertEquals("C+", myFun.letterGrade(78.0));
    assertEquals("C", myFun.letterGrade(74.0));
    assertEquals("D", myFun.letterGrade(62.0));
    assertEquals("B+", myFun.letterGrade(88.0));
    assertEquals("E", myFun.letterGrade(47.0));
  }

  @Test
  public void testFizzBuzz() {
    assertEquals("Fizz", myFun.fizzBuzz("f"));
    assertEquals("Fizz", myFun.fizzBuzz("fig"));
    assertEquals("Buzz", myFun.fizzBuzz("dibb"));
    assertEquals("FizzBuzz", myFun.fizzBuzz("fib"));
    assertEquals("FizzBuzz", myFun.fizzBuzz("figfhjgjb"));
    assertEquals("did", myFun.fizzBuzz("did"));
  }

  @Test
  public void testRomannumeralAllUpperCase() {
    assertEquals(1, myFun.romanNumeral('I'));
    assertEquals(1, myFun.romanNumeral('i'));
    assertEquals(5, myFun.romanNumeral('v'));
    assertEquals(5, myFun.romanNumeral('V'));
    assertEquals(10, myFun.romanNumeral('X'));
    assertEquals(100, myFun.romanNumeral('C'));
    assertEquals(50, myFun.romanNumeral('l'));
    assertEquals(500, myFun.romanNumeral('D'));
    assertEquals(1000, myFun.romanNumeral('m'));
  }

  @Test
  public void testSeason12_1_2True() {
    assertEquals("Winter", myFun.season(12, true));
    assertEquals("Summer", myFun.season(1, false));
    assertEquals("Fall", myFun.season(10, true));
    assertEquals("Spring", myFun.season(9, false));
    assertEquals("Summer", myFun.season(7, true));
    assertEquals("Fall", myFun.season(4, false));
    assertEquals("Spring", myFun.season(3, true));
  }

  @Test
  public void testThanksdate1() {
    assertEquals(25, myFun.thanksDate(1));
    assertEquals(24, myFun.thanksDate(2));
    assertEquals(22, myFun.thanksDate(4));
    assertEquals(26, myFun.thanksDate(7));
  }

  @Test
  public void testDaynumber1() {
    assertEquals(1, myFun.dayNumber("01/01/2018"));
    assertEquals(-1, myFun.dayNumber("13/11/2020"));
    assertEquals(3, myFun.dayNumber("01/03/2016"));
    assertEquals(-1, myFun.dayNumber("01/46/2016"));
    assertEquals(2, myFun.dayNumber("01/02/2098"));
    assertEquals(244, myFun.dayNumber("09/01/2019"));
    assertEquals(365, myFun.dayNumber("12/31/2017"));
    assertEquals(-1, myFun.dayNumber("13/31/2017"));
    assertEquals(33, myFun.dayNumber("02/02/2020"));
    assertEquals(33, myFun.dayNumber("02/02/2021"));
    assertEquals(-1, myFun.dayNumber("39/02/2021"));
    
  }

  @Test
  public void testDayofweek1() {
    assertEquals("Monday", myFun.dayOfWeek(1));
    assertEquals("Tuesday", myFun.dayOfWeek(2));
    assertEquals("Wednesday", myFun.dayOfWeek(3));
    assertEquals("Thursday", myFun.dayOfWeek(4));
    assertEquals("Friday", myFun.dayOfWeek(5));
    assertEquals("Saturday", myFun.dayOfWeek(6));
    assertEquals("Sunday", myFun.dayOfWeek(7));
    assertEquals("Unknown", myFun.dayOfWeek(0));
  }

  @Test
  public void testDaysinmonthWhenNotALeapYear1() {
    assertEquals(31, myFun.daysInMonth(1, 2018));
    assertEquals(28, myFun.daysInMonth(2, 2019));
    assertEquals(29, myFun.daysInMonth(2, 2016));
    assertEquals(30, myFun.daysInMonth(4, 1600));
    assertEquals(31, myFun.daysInMonth(7, 1600));
    assertEquals(30, myFun.daysInMonth(6, 2021));

  }

  @Test
  public void testValidDateWhenTheyAreAllValid1() {
    assertTrue(myFun.validDate("01/01/2018"));
    assertTrue(myFun.validDate("01/31/2016"));
    assertTrue(myFun.validDate("12/31/2017"));
    assertTrue(myFun.validDate("06/15/2018"));
    assertTrue(myFun.validDate("02/28/2019"));
    assertFalse(myFun.validDate("02/29/2019"));
    assertFalse(myFun.validDate("2019/06/06"));
    assertFalse(myFun.validDate("02/29/2100"));
    assertFalse(myFun.validDate("13/02/2019"));
    assertFalse(myFun.validDate("12/32/2019"));
  }
}