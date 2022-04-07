import java.util.LinkedList;
public class Main {

    public static void main(String[] args){

        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("C#");
        System.out.println("Linked list = " + languages);
    
        languages.addFirst("Javascript");
        languages.remove(2);
        System.out.println("Updated linkedlist = " + languages);
        Object firstvar = languages.get(1);
        System.out.println("First element: " + languages);

        
    }
}