package CompositePattern;


import CompositePattern.Component;
import CompositePattern.DirectoryComposite;
import CompositePattern.File;
import FacadePattern.*;
import FacadePattern.Compiler;


// file system
        // disc C
                // file doc
                // file jpg
        // disc E
                // file doc
                // file jpg
        // png.png


public class Execute {
        public static void main(String[] args) {
                Component fileSystem = new DirectoryComposite("file System"),
                        discC = new DirectoryComposite("disc C"),
                        fileDoc = new File("lecture9.doc"),
                        fileJpg = new File("jpg1.jpg");

                fileSystem.add(discC);
                discC.add(fileDoc);
                discC.add(fileJpg);



                fileSystem.print(fileSystem);
        }

}
