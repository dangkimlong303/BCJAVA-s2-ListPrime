public class ListPrime {
    public static void main(String[] args) {
        int number = 2;
        String strPrime = "";
        while (number < 100){
            boolean flag = true ;
            for (int i = 2; i < Math.sqrt(number); i++){
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                strPrime += number + " ";
            }
            number++;
        }

        System.out.println(strPrime);
    }
}
