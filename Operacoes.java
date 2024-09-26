import java.util.ArrayList;
import java.util.Scanner;

public class Operacoes{

    Scanner scChares = new Scanner(System.in);
    Scanner scNumeros = new Scanner(System.in);
    private char simNao;
    private int escolhaOperacao;
    private int soma, subtracao, multiplicacao, divisao; 
    private ArrayList<Integer> listaNumero = new ArrayList<>(); 

    
    public void setScChares(Scanner scChares) {
        this.scChares = scChares;
    }

    public void setScNumeros(Scanner scNumeros) {
        this.scNumeros = scNumeros;
    }

    public void setSimNao(char simNao) {
        this.simNao = simNao;
    }

    public void setEscolhaOperacao(int escolhaOperacao) {
        this.escolhaOperacao = escolhaOperacao;
    }

    public char getSimNao() {
        return simNao;
    }

    public int getEscolhaOperacao() {
        return escolhaOperacao;
    }

    public int getSoma() {
        return soma;
    }

    public int getSubtracao() {
        return subtracao;
    }

    public int getMultiplicacao() {
        return multiplicacao;
    }

    public int getDivisao() {
        return divisao;
    }

    public ArrayList<Integer> getListaNumero() {
        return listaNumero;
    }

    public void novoNumero(){
        do{
            System.out.println("Deseja adicionar mais um número?\n y/n");
            setSimNao(scChares.next().charAt(0));
            switch (getSimNao()) {
                case 'y':
                    System.out.println("Digite um número a ser adicionado: ");
                    int num = scNumeros.nextInt();
                    listaNumero.add(num);
                    break;
                case 'n':
                    break;
                default:
                System.out.println("Não foi digitado um valor válido, por favor digite y ou n para prosseguir");
            }
        }while(getSimNao() != 'n');
    }

    public void operacao(){

        if(getListaNumero().size() == 1){
            System.out.println("Você precisa de no mínimo dois números para prosseguir");
        } else{
        
            do{
            System.out.println("Qual operação você deseja fazer?\n 1- soma\n 2- Subtração\n 3- Multiplicação\n 4- Divisão\n 0-Sair");
            escolhaOperacao = scNumeros.nextInt();
            
                switch (escolhaOperacao) {
                        case 1:
                        for (int i = 0; i < listaNumero.size(); i++) {
                            soma += listaNumero.get(i);
                        }
                        System.out.println(soma);
                        break;
                        case 2:
                        for (int i = 0; i < listaNumero.size()-1; i++) {
                            subtracao += listaNumero.get(i) - listaNumero.get(i+1);
                        }
                        System.out.println(subtracao);
                        break;
                        case 3: 
                        for (int i = 0; i < listaNumero.size()-1; i++) {
                            multiplicacao += listaNumero.get(i) * listaNumero.get(i+1);
                        }
                        System.out.println(multiplicacao);
                        break;
                        case 4:
                        for (int i = 0; i < listaNumero.size()-1; i++) {
                            divisao += listaNumero.get(i)/listaNumero.get(i+1);
                        }
                        System.out.println(divisao);
                        break;
                        case 0: 
                            break;
                        default:
                        System.out.println("Comando inválido");
                    }
            }while(escolhaOperacao != 0);
        }
    }
    
}