package ch.bfh.cas.mad.functions;

public class ArrayHelpersJava {
    public String printAndReturnFirstArgument(String[] args) {
        String firstArgument = args[0];
        System.out.println("Hello World!" + firstArgument);
        return firstArgument;
    }
}
