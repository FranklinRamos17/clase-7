import java.util.Scanner;

public class algoritmodecuadrado {
    static Scanner lt = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Introduce la altura: ");
        int altura = lt.nextInt();
        System.out.print("Introduce la anchura: ");
        int anchura = lt.nextInt();
        String aux = "";
        for (int alto = 0; alto < altura; alto++) {
            for (int largo = 0; largo < anchura; largo++) {
                if (alto==0 | alto == altura-1) {
                        aux="*";                    
                } else {
                    if (largo == 0 | largo == anchura-1) aux="*";
                    if (largo !=0 & largo != anchura-1) aux=" ";
                }
                System.out.print(aux);
                if (largo == anchura-1) System.out.print("\n");
            }
        }
    }
}