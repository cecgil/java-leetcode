public class Alfabeto {
    public static void main(String[] args) {
        returnAlfaebeto(5);
    }

    public static void returnAlfaebeto(int num) {
        
        for(int i = -5; i <= num; i++) {
            System.out.println((char) (i + 64));
        }
        

    }
}
