package ch.bfh.cas.mad.inheritance;

public class CopyCommandJava
        extends DefaultCommand
        implements Executable {
    @Override
    public void execute() {
        this.getInput();
    }
}
