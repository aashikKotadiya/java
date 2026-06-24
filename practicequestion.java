public class c002 {
    public static void main(String[] args) {
        //  problrm 1
        String name = "aashik";
        System.out.println(name.toLowerCase());

        // problem 2
        String text = "to my friend";
        String text1 = text.replace(" ", "_");
        System.out.println(text1);

        // problem 3
        // String letter = "dear <|name|>, Thanks a lot";
        // System.out.println(letter.replace(target"<|name|>",replacement"aashik"));

        // problem 4
        String mylatter = "dear aashik,\n\tThis java cource is nice.\n\tThanks";
        System.out.println(mylatter);
    }
    
}

//  output

//    1. aashik
//    2. to_my_friend
//    3.
//    4. dear aashik,
//               This java cource is nice.
//               Thands