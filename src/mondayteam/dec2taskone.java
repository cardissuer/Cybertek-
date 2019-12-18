package mondayteam;

public class dec2taskone {
    public static void main(String[] args) {
        int day = 20;
        int m = 5;
        int y = 1989;
        String a = "";
        int check;
        String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] yearWords = {"Hundred", "Thousand"};
        a += monthWords[m - 1] + " ";
        if (day > 10) {
            check = day % 10;
            a += multiplesOfTen[check - 1] + " ";
        } else if (day > 0 && day <= 10) {
            a += numbersLessThanTen[day - 1] + " ";
        } else if (day > 10 && day < 20) {
            a += numbersBetweenTenAndTwenty[day - 1] + " ";
        }
        String b = y + "";
        if (b.charAt(0) == '1') {
            a += numbersLessThanTen[0] + " " + yearWords[1] + " ";
        } else if (b.charAt(0) == '2') {
            a += numbersLessThanTen[1] + " " + yearWords[1] + " ";
        }
        int c = Integer.valueOf(b.charAt(1) + "");
        a += numbersLessThanTen[c - 1] + " " + yearWords[0] + " ";
        if (b.charAt(2) == '1') {
            c = Integer.valueOf(b.charAt(3) + "");
            a += numbersBetweenTenAndTwenty[c - 1] + " ";
        } else {
            c = Integer.valueOf(b.charAt(2) + "");
            a += multiplesOfTen[c - 1] + " ";
            c = Integer.valueOf(b.charAt(3) + "");
            a += numbersLessThanTen[c - 1] + " ";
        }
        System.out.println(a);
    }
}