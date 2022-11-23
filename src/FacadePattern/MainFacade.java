package FacadePattern;

public class MainFacade {
    TextEditor textEditor ;
    Compiler compiler;
    JVM jvm;

    public MainFacade(TextEditor textEditor, Compiler compiler, JVM jvm) {
        this.textEditor = textEditor;
        this.compiler = compiler;
        this.jvm = jvm;
    }

    public void run() {
        textEditor.deepIntellijence();
        textEditor.autoSave();
        compiler.compile();
        jvm.execute();
    }
}