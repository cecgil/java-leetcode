public class TrianguloRetangulo {
    public static void main(String[] args) {
        int altura = 5; // Altere esse valor para definir a altura do triângulo
        desenharTriangulo(altura);
    }

    public static void desenharTriangulo(int altura) {
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }
}
