public class c001 {
    public static void main(String[] args) {
         String name = "aashik";
//  1
         String lstring = name.toLowerCase();
      System.out.println(lstring);
// 2
      String ustring = name.toUpperCase();
      System.out.println(ustring);
// 3
      int value = name.length();
      System.out.println(value);
// 4
      System.out.println(name.substring(3));
// 5
      System.out.println(name.substring(0));
// 6
      System.out.println(name.substring(2,6));
// 7
    // System.out.println(name.replace(oldchar: 'h',newchar: 'j'));
// 8
    System.out.println(name.startsWith("aas"));
    }
    
}
//  "output"
     
//   1. aashik
//   2. AASHIK
//   3. 6
//   4. hik
//   5. aashik
//   6. shik
 //  7. aasjik
//   8. true