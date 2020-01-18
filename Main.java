import java.time.LocalTime;
import java.time.LocalDate;
class Main {
  public static void main(String[] args) {
    LocalTime timeObj = LocalTime.now();
    LocalDate dateObj = LocalDate.now();
    System.out.println(timeObj);
    System.out.println(dateObj);
  }
}