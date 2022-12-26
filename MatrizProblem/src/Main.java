import java.util.Locale;
import java.util.Scanner; 
import java.util.stream.IntStream;

public class Main
{
	public static void main(String[] args) {
		
		// resolve a tualiza em um os problemas matriz_geral, acima_diagonal, negativos_matriz
		// feito, so deixa mais bonito
	    
	    int M, N;
	    int numeroN = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas linhas a matrix tera: ");
        M = sc.nextInt();
        System.out.print("\nQuantas colunas sua matrix tera: ");
        N = sc.nextInt();
        
        int[][] matriz = new int[M][N];
        int SomaSuperior = 0;
        int numerosP = 0;
        
        IntStream intStream = IntStream.range(1, M+N); // abilita o range

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print("\nValor da variavel na posição matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] < 0){
                    numeroN++;
                }
            }
        }
        
        System.out.print("A matriz ficou: \n");
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(matriz[i][j] + ", ");
                }
            System.out.print("\n");
        }
        
        
        numerosP = M * N - numeroN;
        System.out.print("Existe " + numeroN + " numeros negativos\n");
        if(numeroN > 0){
            System.out.print("Sendo estes: \n");
        }

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(matriz[i][j] < 0){
                    System.out.print(matriz[i][j] + ", ");
                }
                if(j > i){
                    SomaSuperior = SomaSuperior + matriz[i][j];
                }
            }
        }
        
        System.out.print("\nExiste " + numerosP + " numeros Positivos\nSendo estes: \n");
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(matriz[i][j] >= 0){
                    System.out.print(matriz[i][j] + ", ");
                }
            }
        }
        
        System.out.print("\nA soma dos elementos superior a linha principal é " + SomaSuperior + "\n");
        System.out.print("Os valores da linha principal é: \n");
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if (i == j){
                System.out.print(matriz[i][i] + ", ");
                }
            }
        }
        
        System.out.print("\nAgora a tabela depois de fazer os numeros negativos ao quadrado ficou: \n");
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if (matriz[i][j] < 0){
                    matriz[i][j] = matriz[i][j] * matriz[i][j];
                }
                System.out.print(matriz[i][j] + ", ");
                }
            System.out.print("\n");
        }
        
        
     	sc.close();
	}
}