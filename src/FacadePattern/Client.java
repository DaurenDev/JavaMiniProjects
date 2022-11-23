package FacadePattern;


import CompositePattern.Component;
import CompositePattern.DirectoryComposite;
import CompositePattern.File;
import FacadePattern.*;
import FacadePattern.Compiler;



public class Client {

        public static void main(String[] args) {
                MainFacade facade = new MainFacade(new TextEditor(), new Compiler(), new JVM());
                facade.run();
        }
}

// INTELLIJ IDEA
        // textEditor
                // deep Intellijence
                // auto save
        // compiler
                // compile
        //JVM
                // EXECUTE