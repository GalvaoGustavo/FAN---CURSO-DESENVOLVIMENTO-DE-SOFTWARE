package com.mycompany.project01;
import java.util.Scanner; // IMPORT PARA USAR FUNCAO SCANNER (PODER RECEBER/IMPUT DADO), USADO LINHA 15
import java.util.Locale; // IMPORT PARA DECLARAR PADRAO NUMERO AMERICANO ( PODER USAR . PARA DESCREVER ( IDADE OU PESO ), USADO LINHA 14

/**
 *
 * @author galvao
 */
public class Project01 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // USANDO IMPORT LOCALE
        Scanner sc = new Scanner(System.in); // USANDO IMPORT SCANNER ( DETERMINEI QUE MEU IMPORTE SE CHAMA 'SC' )
        int contador = 0; // INICIEI MINHA VARIAVEL COM NOME CONTADOR E VALOR 0
        
        //CHECAGEM NOME
        System.out.println("Digite o nome da primeira pessoa: "); // SOLICITANDO INFORMACAO PARA USUARIO DE NOME 1
        String nome1 = sc.nextLine().toLowerCase(); // ARMAZENA O NOME DIGITADA PELO USUARIO NESSA VARIAVAVEL - NOME1 (TOLOWERCASE = TRANSFORMA TUDO DIGITADO EM MINUSCULO)
        System.out.println("Digite o nome da segunda pessoa: ");// SOLICITANDO INFORMACAO PARA USUARIO DE NOME 2
        String nome2 = sc.nextLine().toLowerCase();//ARMAZENA O NOME DIGITADA PELO USUARIO NESSA VARIAVAVEL - NOME2  (TOLOWERCASE = TRANSFORMA TUDO DIGITADO EM MINUSCULO)
        if(nome1.equals(nome2)){ // CHECAGEM SE NOME 1 É IGUAL A NOME 2
            System.out.println("Pessoa com nome igual"); // CASO NOME SEJA IGUAL,IRA ESCREVER ESSA LINHA, CASO NAO, IRA PULAR PARA ELSE(LINHA26)
            contador++; // CONTADOR INICIOU COM 0, AQUI IRA ADICIONAR +1 A ELE
        }else{
            System.out.println("Pessoa com nome diferente."); // CASO NOME NAO SEJA IGUAL, IRA ESCREVER ESSA LINHA
        } 
        System.out.println(); // APENAS PARA GERAR UM ESPACO ENTRE AS LINHAS

        //CHECAGEM IDADE
        System.out.println("Digite a idade da primeira pessoa: "); // SOLICITANDO INFORMACAO PARA USUARIO DE IDADE1
        int idade1 = sc.nextInt(); // ARMAZENA A IDADE DIGITADA PELO USUARIO NESSA VARIAVAVEL - IDADE1
        System.out.println("Digite a idade da segunda pessoa: "); // SOLICITANDO INFORMACAO PARA USUARIO DE IDADE2
        int idade2 = sc.nextInt();// ARMAZENA A IDADE DIGITADA PELO USUARIO NESSA VARIAVAVEL - IDADE2
        if(idade1 == idade2){ // CHECA SE IDADE 1 É IGUAL IDADE2
            System.out.println("Idade igual!"); // SE CHECAGEM DA LINHA 36(IF)FOR VERDADEIRA, IRA ESCREVER ESSA LINHA
        }else{
            System.out.println("Idade diferente.");//CASO CHECAGEM LINHA 36 NAO SEJA VERDADEIRA, IRA IMPRIMIR ESSA LINHA
        }
        System.out.println();//APENAS PARA GERAR UM ESPACO ENTRE AS LINHAS

        //CHECAGEM PESO
        System.out.println("Digite o peso da primeira pessoa: ");// SOLICITANDO INFORMACAO PARA USUARIO DE PESO1
        double peso1 = sc.nextDouble();// ARMAZENA A IDADE DIGITADA PELO USUARIO NESSA VARIAVAVEL - PESO1
        System.out.println("Digite o peso da segunda pessoa: ");// SOLICITANDO INFORMACAO PARA USUARIO DE PESO2
        double peso2 = sc.nextDouble();// ARMAZENA A IDADE DIGITADA PELO USUARIO NESSA VARIAVAVEL - PESO2
        if(peso1 == peso2){ // CHECA SE PESO 1 É IGUAL PESO2
            System.out.println("Peso igual!"); //CASO PESOS FOREM IGUAIS, IMPRIME ESSA LINHA
            contador++; // ALEM DE IMPRIMIR A LINHA ACIMA, IRA ADICIONAR +1 AO CONTADOR
        }else{
            System.out.println("Peso diferente.");//CASO PESO SEJA DIFERENTE, IRA IMPRIMIRR ESSA LINHA
        }
        System.out.println();//APENAS PARA GERAR UM ESPACO ENTRE AS LINHAS

        //CHECAGEM ALTURA
        System.out.println("Digite a altura da primeira pessoa: ");// SOLICITANDO INFORMACAO PARA USUARIO DE ALTURA1
        double altura1 = sc.nextDouble();// ARMAZENA A IDADE DIGITADA PELO USUARIO NESSA VARIAVAVEL - ALTURA1
        System.out.println("Digite a altura da segunda pessoa: ");// SOLICITANDO INFORMACAO PARA USUARIO DE ALTURA2
        double altura2 = sc.nextDouble();// ARMAZENA A IDADE DIGITADA PELO USUARIO NESSA VARIAVAVEL - ALTURA2
        if(altura1 == altura2){ // CHECA SE ALTURA É IGUAL
            System.out.println("Altura igual.");//CASO SEJA IGUAL, IMPRIME ESSA LINHA
            contador++;// TBM ADICIONA +1 AO CONTADOR
        }else{
            System.out.println("Altura diferente");//CASO ALTURA SEJA DIFERENTE
        }
        System.out.println();//APENAS PARA GERAR UM ESPACO ENTRE AS LINHAS
        
        //CHECAGEM JOGOS
        System.out.println("Digite o jogo favorito da primeira pessoa: ");// SOLICITANDO INFORMACAO PARA USUARIO DE JOGO1
        sc.nextLine();//APENAS PARA COMER DADOS PENDENTES DA MEMORIA
        String jogo1 = sc.nextLine().toLowerCase();// SOLICITANDO INFORMACAO PARA USUARIO DE JOGO1
        System.out.println("Digite o jogo favorito da segunda pessoa: ");// SOLICITANDO INFORMACAO PARA USUARIO DE JOGO1
        String jogo2 = sc.nextLine().toLowerCase(); // SOLICITANDO INFORMACAO PARA USUARIO DE JOGO2
        if(jogo1.equals(jogo2)){ // CHECA SE JOGO1 É IGUAL JOGO2
            System.out.println("Jogos iguais.");//CASO SEJA, IMPRIME ESSA LINHA
            contador++;//ADICIONA +1 AO CONTADOR
        }else{
            System.out.println("Jogos diferentes.");//CASO NAO SEJA IGUAL, IMPRIME ESSA LINHA
        }
        
        
        //CHECAGEM FINAL
        if(contador >=0 ){ //CHEGA SE CONTADOR É MAIOR QUE 0, CASO SEJA, IRA ENTRAR NESSE BLOCO DE VARIOS IF PARA FAZER NOVAS CHECAGENS
            if(contador == 0){ // CHECA SE CONTADOR É = 0.
                System.out.println("Esta pessoa possui "+contador+ " caracteristicas comigo."); // CASO SEJA, IMPRIME ESSA LINHA, CASO NAO SEJA, PULA PARA PROXIMO IF
            }
            if(contador <3){//CHECA SE CONTADOR É MENOR 3,CASO SEJA, EXECUTA PROXIMA LINHA
                System.out.println("Esta pessoa possui "+contador+ " caracteristicas comigo.");
            }if(contador >= 3){ // CHECA SE CONTADOR É MAIOR OU IGUAL A 3, CASO SEJA, EXECUTA PROXIMA LINHA.
            System.out.println("Esta pessoa é bem parecida comigo, possui "+contador+ " caracteristicas comigo.");
            }
            
        
        sc.close();//COMANDO PARA FECHAR O SCANNER QUE FOI CRIADO NO COMECO DO CODIGO, PRECISA SER INICIADO E FECHADO.
    }
}
}