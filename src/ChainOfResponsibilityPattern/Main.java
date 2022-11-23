package ChainOfResponsibilityPattern;


import ChainOfResponsibilityPattern.*;


import java.io.FileNotFoundException;
public class Main {
        public static void main(String[] args) throws FileNotFoundException {
                UniversityHandler rector = new Rector(),
                        manager = new Manager(),
                        staff = new Staff(),
                        student = new Student();

                rector.setItem(manager);
                manager.setItem(staff);
                staff.setItem(student);

                rector.handle();
        }
}


// -> rector -> manager -> staff -> ...