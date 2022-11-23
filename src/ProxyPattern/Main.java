package ProxyPattern;
import java.util.*;


import java.io.FileNotFoundException;
public class Main {
        public static void main(String[] args) throws FileNotFoundException {
                Context context = new DBProxyContext();
                System.out.println("\n" + context.getOutput()); // <-- problem place

                System.out.println("\n" + context.getOutput());  // <--
                System.out.println("\n" + context.getOutput());  // <--

                System.out.println("\n" + context.getOutput());  // <--
                System.out.println("\n" + context.getOutput());  // <--
                System.out.println("\n" + context.getOutput());  // <--
                System.out.println("\n" + context.getOutput());  // <--
        }
}


// output: .csv (Excel)

//        request
//person1 -> db (30 min)

// person3 -> person2 -> person1 -> db

//       response
//person1   <-  db
