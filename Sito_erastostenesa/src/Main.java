import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean[] liczby = new boolean[n+1];
        for(int i = 2; i <= n; i++) {
            liczby[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(liczby[i] == true)
                for(int k = i*i; k <= n; k+=i)
                    liczby[k] = false;
        }
        System.out.println("Liczby pierwsze z przedzialu: ");
        for(int i = 0; i <= n; i++)
        {
            if(liczby[i] == true)
                System.out.print(i + " , ");
        }
        scanner.close();
    }

}