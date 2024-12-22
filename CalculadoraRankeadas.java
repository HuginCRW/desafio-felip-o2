import java.util.Scanner;

public class CalculadoraRankeadas {

    public static String calcularNivel(int saldo) {
        if (saldo < 10) {
            return "Ferro";
        } else if (saldo >= 10 && saldo <= 20) {
            return "Bronze";
        } else if (saldo >= 21 && saldo <= 50) {
            return "Prata";
        } else if (saldo >= 51 && saldo <= 80) {
            return "Ouro";
        } else if (saldo >= 81 && saldo <= 90) {
            return "Diamante";
        } else if (saldo >= 91 && saldo < 100) {
            return "Lendário";
        } else if (saldo >= 100) {
            return "Imortal";
        } else {
            return "Indefinido";
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nivel;
            int totalVitorias = 0;
            int totalDerrotas = 0;
            
            do {
                System.out.print("Digite o número de vitórias: ");
                int vitorias = scanner.nextInt();
                
                System.out.print("Digite o número de derrotas: ");
                int derrotas = scanner.nextInt();
                
                totalVitorias += vitorias;
                totalDerrotas += derrotas;
                
                int saldo = totalVitorias - totalDerrotas;
                nivel = calcularNivel(saldo);
                
                System.out.println("O Herói tem de saldo de " + saldo + " está no nível de " + nivel);
                
            } while (!nivel.equals("Imortal"));
        }
    }
}
