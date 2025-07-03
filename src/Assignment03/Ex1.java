package Assignment03;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
public class Ex1 {
    public static void main(String[] args) {
        // program text
        String progText = "class Hello { "
                + "public static void main (String[] args) { "
                + " System.out.println(\"Hello world!\"); "
                + "} "
                + "}";

        // parse the program text
        CompilationUnit codeUnit = JavaParser.parse(progText);

        // obtain the generated source code
        System.out.println(codeUnit);
    }
}
// b) After removing the semicolon (;) at the end of the System.out.println("Hello world!") statement,
// the program throws a ParseProblemException.
// This happens because Java requires a semicolon to terminate statements.
// The parser detects this syntax error and refuses to compile the code.
// c) After removing the word "main" from public static void main(String[] args),
// the program throws a ParseProblemException, indicating an unexpected token "(". This error occurs because "main" is required
// as the entry point for a Java application. Without it, the parser cannot recognize the method definition properly,
// leading to a syntax error.