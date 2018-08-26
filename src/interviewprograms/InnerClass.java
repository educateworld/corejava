package interviewprograms;
public class InnerClass {
 private int x = 4;
 public static void main(String[] args) {
final int x = 6;
 new InnerClass().new Cell().slam();
 }
class Cell {
 void slam() { System.out.println("throw away key " + x); }
}
 }