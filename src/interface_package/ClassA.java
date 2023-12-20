package interface_package;

public class ClassA implements InterfaceA{
    @Override
    public void printMessage(String message) {
        System.out.println("Hello "+message);
    }

}
