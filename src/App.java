import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Inserisci l'ora");
        int ora1= input.nextInt();
        System.out.println("Inserisci i minuti");
        int minuti1= input.nextInt();
        Time orario1= new Time(ora1, minuti1);
        System.out.println("Inserisci l'ora");
        int ora2= input.nextInt();
        System.out.println("Inserisci i minuti");
        int minuti2= input.nextInt();
        Time orario2= new Time(ora2, minuti2);

        System.out.println(orario1.compareTo(orario2));
        
    }
}
