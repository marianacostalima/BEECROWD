import java.util.Scanner;

public class Main {
     
    static final Scanner LER = new Scanner(System.in);

    public static void main(String[] args){

        int n = 0;        //dia
        int s = 0;        //saldo atual

        n = lerN();
        s = lerS();

        int menorSaldo = s;  //menos saldo recebe saldo atual

        for(int i = 0; i < n; i++){
            int movimentacao = lerMovimentacao();

            s += movimentacao;

            if (s < menorSaldo) {
                menorSaldo = s; 
            }

        }
        imprimirResult(menorSaldo);
    }

    public static int lerN(){     //N (1 ≤ N ≤ 30)
        int n = 0;   

        do{
            n = LER.nextInt();   

        }while(n <= 1 && n >= 30); 

        return n;
    }

    public static int lerS(){    //S (−103 ≤ S ≤ 103)
        int s = 0;

        do{
            s = LER.nextInt();

        }while(s <= (Math.pow(-10, 3)) && s >= (Math.pow(10, 3))); 

        return s;
    }

    public static int lerMovimentacao() {     //(−103 ≤ cada movimentação ≤ 103)
        int movimentacao;

        do{
            movimentacao = LER.nextInt();

        }while(movimentacao <= (Math.pow(-10, 3)) && movimentacao >= (Math.pow(10, 3))); 

        return movimentacao;
    }

    public static void imprimirResult(int menorSaldo) {
        System.out.println(menorSaldo);
    }
}