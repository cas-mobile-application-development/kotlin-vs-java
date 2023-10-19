package ch.bfh.cas.mad.parameters;

public class ClientJava {
    public void run() {
        runOnCommandLine("copy");
    }

    private void runOnCommandLine(String command) {
        runOnCommandLine(command, null);
    }

    private void runOnCommandLine(String command,
                                  String argument) {
        System.out.println(command + " " + argument);
    }
}
