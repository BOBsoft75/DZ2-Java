import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class DZ2 {
    
    
    public static void main(String[] args) {
    
    inputCollection();
    }

    public static void inputCollection(){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> values = new Hashtable<String, Integer>();
        String[] variables = get_data(scanner ,"Введите формулу: ").split(" {0,}\\+ {0,}");
        for (String variable : variables) 
            values.put(variable, values.getOrDefault(variable, 0) + 1);
        for (String key : values.keySet()) {
            result+= values.get(key)*Integer.parseInt(get_data(scanner ,"Введите значение для " + key + ": "));
           
        }
        for (String key : values.keySet()) {
        if (values.get(key) > 1)             
            System.out.print(" " + values.get(key)+key+" +");
        else
            System.out.print(" " + key+" +");
        }
        System.out.print("\b= "+ result);        
        scanner.close();


    }
    public static String get_data(Scanner scanner ,String text) {
        
        System.out.println();
        System.out.print(text);
        String res =  scanner.nextLine();
        
        return res;       
        
    }    
    
}