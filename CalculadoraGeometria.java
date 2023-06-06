import java.util.Scanner;

public class CalculadoraGeometria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
System.out.println("=== Calculadora de Geometria ===");
System.out.println("1. Área do quadrado");
System.out.println("2. Área do círculo");
System.out.println("3. Área do triângulo");
System.out.println("4. Área da piramide");
System.out.println("5. Área do cilindro");
System.out.println("6. Área da esfera");
System.out.println("7. Volume do quadrado");
System.out.println("9. Volume da piramide");
System.out.println("10. Volume do cilindro");
System.out.println("11. Volume da esfera");
System.out.println("13. Sair");
opcao = scanner.nextInt();

 switch (opcao) {
    case 1:
     calcularAreaQuadrado(scanner);
        break;
    case 2:
    calcularAreaCirculo(scanner);
        break;
    case 3:
    calcularAreaTriangulo(scanner);
        break;
    case 4:
    calcularAreaPiramide(scanner);
        break;
        case 5:
    calcularAreaCilindro(scanner);
        break;
        case 6:
    calcularAreaEsfera(scanner);
        break;
        case 7:
    calcularVolumeQuadrado(scanner);
        break;
        case 8:
        
    calcularVolumePiramide(scanner);
        break;
        case 9:
    calcularVolumeCilindro(scanner);
        break;
         case 10:
    calcularVolumeEsfera(scanner);
      break;

      case 11:
    calcularVolumeEsfera(scanner);
     break;
        case 12:
    System.out.println("Encerrando o programa");
        break;
    default:
    System.out.println("Opção inválida. Tente novamente.");
        break;
            }
    System.out.println();
        } while (opcao != 4);

        scanner.close();
    }

    public static void calcularVolumeEsfera(Scanner scanner) {
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        double volume = ((4 * 3.14) * (raio * raio * raio)) /3;
        System.out.println("O volume total da esfera é: " + volume);
    }

    public static void calcularVolumeCilindro (Scanner scanner) {
        System.out.print("Digite a area da base: ");
        double ab = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        double volume = ab * altura ;
        System.out.println("O Volume da esfera é: " + volume);
    }

    public static void calcularVolumePiramide (Scanner scanner) {
        System.out.print("Digite a area da base: ");
        double ab = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        double volume = (ab * altura) / 3 ;
        System.out.println("O volume da esfera é: " + volume);
    }

    public static void calcularVolumeQuadrado (Scanner scanner) {
        System.out.print("Digite o lado: ");
        double lado = scanner.nextDouble();
        double volume = lado * lado * lado ;
        System.out.println("O volume da esfera é: " + volume);
    }

    public static void calcularAreaEsfera(Scanner scanner) {
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        double area = (4 * 3.14) * (raio * raio) ;
        System.out.println("A área total da esfera é: " + area);
    }

    public static void calcularAreaCilindro(Scanner scanner) {
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        double area = (3.14 * 2 * raio) * (raio + altura);
        System.out.println("A área total do cilindro é: " + area);
    }

    public static void calcularAreaTriangulo(Scanner scanner) {
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }

    public static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }

    public static void calcularAreaPiramide(Scanner scanner) {
        System.out.print("Digite a area da base da piramide: ");
        double ab = scanner.nextDouble();
        System.out.print("Digite a lateral da piramide: ");
        double al = scanner.nextDouble();
        double area = (al * 4) + ab;
        System.out.println("A área total do triângulo é: " + area);
    }

    public static void calcularAreaQuadrado(Scanner scanner) {
        System.out.print("Digite o lado do quadrado: ");
        double1 lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
    }
}
