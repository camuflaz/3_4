import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   System.out.println("Podaj liczbe:");
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();
    System.out.println("Podaj znak:");
    char znak = scanner.next().charAt(0);
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                  System.out.print(znak+ " ");
                } else {
                  System.out.print("  ");
                }
              }
              System.out.println();
            }
          }
        }