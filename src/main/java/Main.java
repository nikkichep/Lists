import java.util.ArrayList;// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    fruits.add("grape");
    fruits.add("melon");
    
    int Listsize = fruits.size();
    String place = fruits.get(3);

    fruits.set(1, "green banana");
    System.out.println(fruits);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}