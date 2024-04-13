import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        System.out.println("Oi, digite o número do app desejado e pressione ENTER!");
        System.out.println("1 - Reprodutor Musical");
        System.out.println("2 - Aparelho Telefonico");
        System.out.println("3 - Navegador na Internet");
        Scanner terminal = new Scanner(System.in);
        int appChoice = terminal.nextInt();
        while (appChoice != 0) {
            executarApp(iphone, appChoice);
            appChoice = terminal.nextInt();
            
        }
    }

    private static void executarApp(Iphone iphone, int app) {
        switch (app) {
            case 1:
                iphone.startPlayer();
                break;
            case 2:
                iphone.startPhone();
                break;
            case 3:
                iphone.startBrowser();
                break;
            default:
                System.out.println("App não encontrado!");
        }
    }
}
