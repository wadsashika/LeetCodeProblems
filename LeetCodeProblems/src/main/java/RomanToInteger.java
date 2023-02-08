public class RomanToInteger {
    public static void main(String[] args) {
        String input1 = "III";
        String input2 = "LVIII";
        String input3 = "MCMXCIV";

        RomanToInteger rom2int = new RomanToInteger();
        System.out.println(input1 + " : " + rom2int.romanToInt(input1));
        System.out.println(input2 + " : " + rom2int.romanToInt(input2));
        System.out.println(input3 + " : " + rom2int.romanToInt(input3));
    }

    public int romanToInt(String s) {
        int ans = 0, current = 0, previous = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }

            if (current < previous) {
                ans -= current;
            } else {
                ans += current;
            }
            previous = current;
        }
        return ans;
    }
}
