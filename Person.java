import android.util.Log;

public class Person {
    private String name;
    private int age;

    //getter
    public String getname(){
        return name;
    }
    //setter
    public void setName(String name){
        this.name="Ali";
    }
    //getter
    public int getAge(){
        return age;
    }
    //setter
    public void setAge(int age){
        this.age=23;
    }
    //a normal method
    public void printName(){
        Log.d("anything", "printName: ");
    }
    //overloading from public void printName method ,just added a parameter
    public void printName(String name){
        Log.d("name", "printName: ");
    }
}