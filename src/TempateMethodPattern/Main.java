package TempateMethodPattern;


import AdapterPattern.*;
import TempateMethodPattern.Education;
import TempateMethodPattern.School;
import TempateMethodPattern.University;

import java.util.PriorityQueue;

public class Main {
    // TEMPLATE METHOD
    public static void main(String[] args) {
        Education school = new School();
        Education university = new University();

        school.templateMethod();
        System.out.println("-------------------------------------");
        university.templateMethod();
    }


}


// education
    // process ()

// school
    // enter <--
    // study <--
    // pass exam <--
    // get attestat (document) <--

// university
    // enter <--
    // study <--
    // practice
    // pass exam <--
    // get diploma (document)  <--