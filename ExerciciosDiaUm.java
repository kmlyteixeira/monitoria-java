import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosDiaUm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("\n\nExercicios Dia 1 MENTORIA JAVA");
            System.out.println("01 - Ordem Decrescente");
            System.out.println("02 - Numeros ímpares entre 1 - 30");
            System.out.println("03 - Inversão de Valores das Variáveis");
            System.out.println("04 - Cálculo de Salário c/ Extras");
            System.out.println("05 - Verifica idade para ser Eleitor em 2022");
            System.out.println("06 - Valor Total da Compra");
            System.out.println("07 - Conversão de ºC para ºF");
            System.out.println("08 - Vencedor da Partida");
            System.out.println("09 - Verifica se é um Triângulo");
            System.out.println("10 - Posto de Gasolina");
            System.out.println("11 - Divisão de Valores");
            System.out.println("12 - Maior número e média dos números");
            System.out.println("13 - Verificar se pessoa existe na listagem");
            System.out.println("14 - Media de temperatura do ano");
            System.out.println("15 - Comparação de Arrays");
            System.out.println("16 - DESAFIO");
            System.out.println("17 - Sair");
            System.out.println("Insira sua opção:");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o número: ");
                    int numero = sc.nextInt();
                    OrdemDecrescente(numero);
                    break;
                case 2:
                    ParesEImpares();
                    break;
                case 3:
                    System.out.println("Insira o valor de a: ");
                    int a = sc.nextInt();
                    System.out.println("Insira o valor de b: ");
                    int b = sc.nextInt();

                    InversaoValores(a, b);

                    break;
                case 4:
                    System.out.println("Qual o seu salário hora?");
                    double salarioHora = sc.nextDouble();
                    System.out.println("Quantas horas trabalhadas na semana?");
                    double horasTrabalhadas = sc.nextDouble();

                    SalarioSemanal(salarioHora, horasTrabalhadas);
                    break;
                case 5:
                    System.out.println("Qual seu mês de nascimento?");
                    int mes = sc.nextInt();
                    System.out.println("Qual o seu ano de nascimento?");
                    int ano = sc.nextInt();

                    AnoEleicao(mes, ano);
                    break;
                case 6:
                    System.out.println("Insira a quantidade de maças que deseja: ");
                    int qtd = sc.nextInt();

                    CompraFrutas(qtd);
                    break;
                case 7:
                    System.out.println("Insira a temperatura em ºC: ");
                    double temperatura = sc.nextDouble();

                    CelsiusParaFahrenheit(temperatura);
                    break;
                case 8:
                    System.out.println("Insira o nome do primeiro time: ");
                    String timeUm = sc.next();
                    System.out.println("Insira a quantidade de GOLS na partida:");
                    int golsTimeUm = sc.nextInt();

                    System.out.println("Insira o nome do primeiro time: ");
                    String timeDois = sc.next();
                    System.out.println("Insira a quantidade de GOLS na partida:");
                    int golsTimeDois = sc.nextInt();

                    PartidaFutebol(timeUm, timeDois, golsTimeUm, golsTimeDois);
                    break;
                case 9:
                    System.out.println("Insira os lados do triângulo:");
                    double ladoA = sc.nextDouble();
                    double ladoB = sc.nextDouble();
                    double ladoC = sc.nextDouble();

                    VerificaTriangulo(ladoA, ladoB, ladoC);
                    break;
                case 10:
                    System.out.println("Insira a quantidade de combustível em LITROS");
                    double qtdLitros = sc.nextDouble();
                    System.out.println("Insira o tipo de combustível [A] ALCOOL [G] GASOLINA");
                    String tipoCombustivel = sc.next();

                    DescontoCombustivel(qtdLitros, tipoCombustivel);
                    break;
                case 11:
                    int x = 0;
                    double valorDois;

                    System.out.println("Insira o dividendo: ");
                    double valorUm = sc.nextDouble();

                    do {
                        System.out.println("Insira o divisor: ");
                        valorDois = sc.nextDouble();
                        if (valorDois == 0) {
                            System.out.println("O divisor não pode ser 0. Tente novamente!");
                        } else {
                            x = 1;
                        }
                    } while (x == 0);

                    Divisao(valorUm, valorDois);
                    break;
                case 12:
                    System.out.println("Qual a quantidade a ser inserida?");
                    int tamArray = sc.nextInt();

                    double[] listaNumeros = new double[tamArray];

                    for (int i = 0; i < listaNumeros.length; i++) {
                        System.out.println("Insira o " + (i + 1) + "º numero");
                        listaNumeros[i] = sc.nextInt();
                    }

                    double maiorNumero = MaiorNumero(listaNumeros);
                    double media = Media(listaNumeros);

                    System.out.println("O maior numero da lista é: " + maiorNumero);
                    System.out.println("A media dos numeros da lista é: " + media);
                    break;
                case 13:
                    String[] pessoas = new String[10];

                    for (int i = 0; i < 10; i++) {
                        System.out.println("Insira o nome da " + (i + 1) + " pessoa: ");
                        pessoas[i] = sc.next();
                    }

                    System.out.println("Insira um nome para consultar:");
                    String nomeConsulta = sc.next();

                    VerificaPessoa(pessoas, nomeConsulta);
                    break;
                case 14:

                    double[] temperaturas = new double[12];

                    for (int i = 0; i < 12; i++) {
                        System.out.println("Insira a temperatura do mês " + (i + 1));
                        temperaturas[i] = sc.nextDouble();
                    }

                    System.out.println("Maior temperatura do ano foi: " + MaiorNumero(temperaturas));
                    System.out.println("Menor temperatura do ano foi: " + MenorNumero(temperaturas));
                    System.out.println("Media anual foi de: " + Media(temperaturas));
                    break;
                case 15:
                    int[] listaUm = new int[] { 1, 2, 3, 4, 5 };
                    int[] listaDois = new int[] { 5, 6, 7, 8, 8 };

                    ComparaArrays(listaUm, listaDois);
                    break;
                case 16:
                    System.out.println("DESAFIO");
                    break;
                case 17:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Entrada Inválida!");
                    break;
            }
        } while (op != 17);

        sc.close();
    }

    public static void OrdemDecrescente(int value) {
        for (int i = value; i > 0; i--) {
            if (i == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " - ");
            }
        }
    }

    public static void ParesEImpares() {

        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }

        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }

    public static void InversaoValores(int a, int b) {
        int aux;
        aux = a;
        a = b;
        b = aux;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void SalarioSemanal(double valorHora, double jornada) {

        double salario = 0;

        if (jornada > 40) {
            double horasExtras = jornada - 40;
            salario = ((horasExtras * (valorHora * 1.5)) + (40 * valorHora));
        } else {
            salario = jornada * valorHora;
        }

        System.out.println("Total dos Proventos: " + salario);
    }

    public static void AnoEleicao(int mes, int ano) {
        if (((ano == 2006) && (mes > 10)) || (ano > 2016)) {
            System.out.println("Não votará nas Eleições de 2022");
        } else {
            System.out.println("Vote Consciente!!!");
        }
    }

    public static void CompraFrutas(int quantidade) {

        double valorTotal = 0;

        if (quantidade > 12) {
            valorTotal = quantidade;
        } else {
            valorTotal = quantidade * 1.30;
        }

        System.out.println("Valor a pagar pelas Maçãs: R$" + valorTotal);
    }

    public static void CelsiusParaFahrenheit(double grausCelsius) {

        double grausFahrenheit = (grausCelsius * 1.8) + 32;

        System.out.println(grausCelsius + "ºC --> " + grausFahrenheit + "ºF");
    }

    public static void PartidaFutebol(String timeUm, String timeDois, int qtdGolsTimeUm, int qtdGolsTimeDois) {
        if (qtdGolsTimeUm > qtdGolsTimeDois) {
            System.out.println("Time " + timeUm + " é o VENCEDOR!");
        } else if (qtdGolsTimeUm < qtdGolsTimeDois) {
            System.out.println("Time " + timeDois + " é o VENCEDOR!");
        } else {
            System.out.println("EMPATE!");
        }
    }

    public static void VerificaTriangulo(double a, double b, double c) {
        if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))) {
            System.out.println("É um triângulo!");
        }
    }

    public static void DescontoCombustivel(double litros, String tipoCombustivel) {

        double desconto = 0;
        double valorLitro = 0;
        double valorDesconto = 0;

        if (tipoCombustivel == "A") {
            valorLitro = 2.90;
            desconto = 0.03;
        }

        if (tipoCombustivel == "G") {
            valorLitro = 3.30;
            if (litros <= 20) {
                desconto = 0.04;
            } else if (litros > 20) {
                desconto = 0.06;
            }
        }

        valorDesconto = (litros * valorLitro) * desconto;
        System.out.println("Valor a pagar é de: " + ((litros * valorLitro) - valorDesconto));
    }

    public static double Divisao(double a, double b) {
        return a / b;
    }

    public static double MaiorNumero(double[] listaNumeros) {

        double maiorNumero = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            if (i == 0) {
                maiorNumero = listaNumeros[i];
            }

            if (listaNumeros[i] > maiorNumero) {
                maiorNumero = listaNumeros[i];
            }
        }

        return maiorNumero;
    }

    public static double MenorNumero(double[] lista) {

        double menorNumero = 0;

        for (int i = 0; i < lista.length; i++) {
            if (i == 0) {
                menorNumero = lista[i];
            }

            if (lista[i] < menorNumero) {
                menorNumero = lista[i];
            }
        }

        return menorNumero;
    }

    public static double Media(double[] listaNumeros) {

        double soma = 0;

        for (int i = 0; i < listaNumeros.length; i++) {
            soma = soma + listaNumeros[i];
        }

        return soma / listaNumeros.length;
    }

    public static void VerificaPessoa(String[] pessoas, String nomeVerificar) {
        for (String pessoa : pessoas) {
            if (pessoa.contains(nomeVerificar)) {
                System.out.println("A pessoa existe na listagem!");
            }
        }
    }

    public static void ComparaArrays(int[] arrayUm, int[] arrayDois) {

        List<Integer> numerosRepetidos = new ArrayList<Integer>();
        for (int i = 0; i < arrayDois.length; i++) {

            for (int j = 0; j < arrayUm.length; j++) {
                if (arrayDois[i] == arrayUm[j]) {
                    numerosRepetidos.add(arrayDois[i]);
                }
            }
        }

        for (int i = 0; i < arrayUm.length; i++) {
            int contadorUm = 0;

            for (int j = 0; j < arrayUm.length; j++) {
                if (arrayUm[i] == arrayUm[j]) {
                    contadorUm++;
                }
            }

            if (contadorUm > 1) {
                System.out.println("O valor " + arrayDois[i] + " repetiu " + contadorUm + " vezes no Primeiro Array!");
            }
        }

        for (int i = 0; i < arrayDois.length; i++) {
            int contadorDois = 0;

            for (int j = 0; j < arrayDois.length; j++) {
                if (arrayDois[i] == arrayDois[j]) {
                    contadorDois++;
                }
            }
            if (contadorDois > 1) {
                System.out.println("O valor " + arrayDois[i] + " repetiu " + contadorDois + " vezes no Segundo Array!");
            }
        }

        System.out.println("Numeros que se repetem entre os Arrays: " + numerosRepetidos);
    }

}
