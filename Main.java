import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       try {
           System.out.println("Введите пример: ");
           Scanner scan = new Scanner(System.in);
           String str1 = scan.nextLine();
           String[] str2 = str1.split(" ");
           String num1 = str2[0];
           String num2 = str2[2];
           int length = str2.length;
           int res = -1;
           String[] arabianNums = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
           String[] romanNums = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI",
                   "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                   "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII",
                   "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII",
                   "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII",
                   "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV",
                   "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI",
                   "XCVII", "XCVIII", "XCIX", "C"};
           String str3 = "Неверное значение";
           if (length == 3) {
               for (int i = 1; i < arabianNums.length; i++) {
                   if (num1.equals(arabianNums[i]) || num1.equals(romanNums[i])) {
                       if (num1.equals(arabianNums[i])) {
                           for (int j = 1; j < arabianNums.length; j++) {
                               if (num2.equals(arabianNums[j])) {
                                   if (str1.contains("+")) {
                                       res = i + j;
                                   } else if (str1.contains("-")) {
                                       res = i - j;
                                   } else if (str1.contains("/")) {
                                       res = i / j;
                                   } else if (str1.contains("*")) {
                                       res = i * j;
                                   }
                               }
                           }
                           str3 = String.valueOf(res);
                       } else if (num1.equals(romanNums[i])) {
                           for (int j = 1; j < arabianNums.length; j++) {
                               if (num2.equals(romanNums[j])) {
                                   if (str1.contains("+")) {
                                       res = i + j;
                                   } else if (str1.contains("-")) {
                                       res = i - j;
                                   } else if (str1.contains("/")) {
                                       res = i / j;
                                   } else if (str1.contains("*")) {
                                       res = i * j;
                                   }
                               }
                           }
                           str3 = romanNums[res];
                       }

                   }
               }
           }
           if(res==-1)
               System.out.println("Неверное значение");
           else
               System.out.println(str3);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Неверное значение");
       }
    }
    }












