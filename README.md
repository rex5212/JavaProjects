# JavaProjects

import java.util.Locale;
import java.util.Scanner; 


public class Main
{
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in); // criou o input que foi apelidado de sc
	    
	    int idade;
	    double altura, salario;
	    boolean situacao;
	    String nome;
	    char sexo;
	    
	    salario = 0.0;
	    
	    //Locale.setDefault(Locale.US); faz com que aparesa ponto en vez de , no console mas nao necessitei
	    
     	System.out.print("Qual a sua idade: ");
     	// System.out.println(); = printf(); podendo se System.out.print();
     	idade = sc.nextInt();
     	System.out.print("Qual a sua altura: ");
     	altura = sc.nextDouble();
     	System.out.print("Qual sua situação financeira: ");
     	situacao = sc.nextBoolean();
     	if(situacao == true){
     	    System.out.print("Qual o seu Salario: ");
     	    salario = sc.nextDouble();
     	}
     	System.out.print("Qual seu nome: ");
     	sc.nextLine(); // limpexa do input == cin.igonore(MAX_INT, "\n");
     	nome = sc.nextLine();
     	
     	System.out.print("Qual e o seu sexo: ");
     	sexo = sc.next().charAt(0); 
     	
     	System.out.print("Meu nome é " + nome + "\n");
     	if (sexo == 'f'){
     	    System.out.print("Do Sexo Feminino");
     	} else if (sexo == 'm'){
     	    System.out.print("Do sexo Masculino");
     	} else {
     	    System.out.print("Sexo indefinido");
     	}
     	System.out.print("\nTenho " + String.format("%.2f", altura) + " de altura\n");
     	// String.format("%.2f", variavel) forma o tanto de casas deois da virgula/ponto
     
     	if(situacao == true){
     	    System.out.print("Ganho R$ " + String.format("%.2f", salario));
     	} else{
     	    System.out.print("Sou Desempregado");
     	}
     	
     	sc.close();
	}
}



import java.util.Locale;
import java.util.Scanner; 
import java.util.stream.IntStream;

public class Main
{
	public static void main(String[] args) {
	    
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

