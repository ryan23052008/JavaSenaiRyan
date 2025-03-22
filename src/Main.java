import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        //String nome = "Ryan";
//        System.out.println("Meunome é:" + nome);
//        System.out.println();
//
//
//        char status = 'R';
//        char status01 = 'Y';
//        char status02 = 'A';
//        char status03 = 'N';
//        System.out.println(status + status01 + status02 + status03);
//        System.out.println("" + status + status01 + status02 + status03);
//
//        System.out.println();
//
//       // Float num02 = 10.5f;
//       // Double num03 = 10.5;
//
//        //System.out.println(num + num04);
//       // System.out.println(num - num04);
//       // System.out.println(num / num04);
//       // System.out.println(num % num04);
//
//        System.out.println();
//
//        int num = 30;
//        Long num04 = 50L;
//        byte numNovo = 128;
//        byte numNovo02 = 127;
//
//        System.out.println(num + num04);
//        System.out.println(num - num04);
//        System.out.println(num / num04);
//        System.out.println(num % num04);
//
//        System.out.println();


//        Scanner Senai = new Scanner(System.in);
//
//        System.out.println("Digite três caracteres:");
//
//        char char1 = Senai.next().charAt(0); // Lê o primeiro caractere
//        char char2 = Senai.next().charAt(0); // Lê o segundo caractere
//        char char3 = Senai.next().charAt(0); // Lê o terceiro caractere
//
//        // Concatena e exibe os caracteres
//        System.out.println("Os caracteres digitados foram: " + char1 + char2 + char3);
//        Senai.close();
//
//
//        System.out.println();


        //1. Promoção Automática

//        int numeroInt = 17;
//        double numeroDouble = numeroInt; // Promoção automática
//
//        System.out.println(numeroInt);
//        System.out.println(numeroDouble); // Saída: 10.0
//        System.out.println(numeroDouble); // Saída: 10.0

//
//        System.out.println();
//
//        //2. Casting Explícito
//
//        double numeroDoubleNew = 123.456;
//        int numeroIntNew = (int) numeroDoubleNew; // Casting explícito
//        System.out.println(numeroIntNew); // Saída: 123 (perda da parte decimal)
//
//        System.out.println();
//
//
//        //3. Parsing de Strings
//
//        String numeroTexto = "42";
//        int numeroInt = Integer.parseInt(numeroTexto);
//        System.out.println(numeroInt); // Saída: 42
//

        System.out.println();

        //Atividade03

//        public static void main(String[] args) {
//            int num1 = 55555;
//            int num2 = 66666;
//
//            // Operação que causa estouro
//            long resultadoCorreto = (long) num1 * num2;
//            System.out.println("Resultado correto usando long: " + resultadoCorreto);

        System.out.println();

        //Atividade04


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String inputInt = scanner.nextLine();

        try {
            int numeroInt = Integer.parseInt(inputInt);
            System.out.println("Número inteiro convertido: " + numeroInt);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para inteiro: " + e.getMessage());
        }

        System.out.print("Digite um número decimal: ");
        String inputDouble = scanner.nextLine();

        try {
            double numeroDouble = Double.parseDouble(inputDouble);
            System.out.println("Número decimal convertido: " + numeroDouble);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para decimal: " + e.getMessage());


        }
    }
    }
