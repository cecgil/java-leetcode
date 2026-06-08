public class MaximumDifferenceRemmpaingADigit {
    
    public static void main(String[] args) {
        int a = minMaxDifference(11891);
        System.out.println(a);
    }

public static int minMaxDifference(int num) {
    int n = num;
    int firstDigit = 0;

    // Captura o primeiro dígito (da esquerda)
    while (n >= 10) {
        n /= 10;
    }
    firstDigit = n;

    // Para maxNum: Troca todas as ocorrências do primeiro dígito por 9
    int maxNum = 0;
    int factor = 1;
    int temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        if (digit == firstDigit) digit = 9;
        maxNum += digit * factor;
        factor *= 10;
        temp /= 10;
    }

    // Para minNum: Troca todas as ocorrências do primeiro dígito por 1
    int minNum = 0;
    factor = 1;
    temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        if (digit == firstDigit) digit = 1;
        minNum += digit * factor;
        factor *= 10;
        temp /= 10;
    }

    return maxNum - minNum;
}

    
}
