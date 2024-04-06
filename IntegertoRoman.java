public class IntegertoRoman {
    public static void main(String[] args) {
        int [] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] romNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        int num = 1992;
        int i = 0;
        while (num > 0) {
            if(num > values[i]){
                sb.append(romNum[i]);
                num -= values[i];
            }else{
                i++;
            }
        }
        System.out.println(sb.toString());
    }
}
