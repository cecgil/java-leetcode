public class CountSymmetricIntegers {
    

    public static void main(String[] args) {
        countSymmetricIntegers(1, 100);
    }

    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;


        for(int i = low; i <= high; i++) {
            int somaA = 0;
            int somaB = 0;

            String a = Integer.toString(i);
            if(a.length() % 2 == 0) {
                String b = a.substring(0, a.length()/2);
                String c = a.substring(a.length() / 2);

                for(int index = 0; index < b.length(); index++) {
                    char digito = b.charAt(index);
                    int numero = Character.getNumericValue(digito);
                    somaA += numero;
                }
                for(int index = 0; index < c.length(); index++) {
                    char digito = c.charAt(index);
                    int numero = Character.getNumericValue(digito);
                    somaB += numero;
                }


                if(somaA == somaB) count++;
            }
        }

        return count;

    }
}
