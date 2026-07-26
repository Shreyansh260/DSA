package Class_Concept;

class Animal 
{
    String name= ""; 
    String spec = "";
    
    void funct(){
        System.out.println("Animal "+ name + " is Eating");
        System.out.println(name +" is of "+spec + " species" );
        
    }
    
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(); 
        dog.name = "Buddy";
        dog.spec = "Lebra";
        dog.funct();
    }
}