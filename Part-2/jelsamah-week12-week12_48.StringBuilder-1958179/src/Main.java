
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder s = new StringBuilder();
        s.append("{\n ");
        for(int i = 0; i < t.length; i++){
        
            
            if(i != 0 && i % 4 == 0){
                s.append("\n ");
            }
            s.append(t[i]);
            if(i != t.length-1){
            s.append(", ");
            }
            
        }
        s.append("\n}");
        return s.toString();
    }
}
