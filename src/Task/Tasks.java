package Task;
import RunInput.Input;

public class Tasks {

    Input input = new Input();
    public String DataUser(){
        return "Yevhenii Usik, 17(wkrótce 18)";
    }
    public void MathOperations(int a, int b){
        a = input.InputFloat();
        b = input.InputFloat();
    }

}
