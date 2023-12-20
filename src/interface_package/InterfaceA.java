package interface_package;

public interface InterfaceA {
    //in interface you can only use final, static
    int num =55;
    public void printMessage(String message);
    default void eatFood(String food){
        System.out.println("Eating "+food);
        //in order for it to be not an abstract you put default (only true for interface)
    }
}
