package repl;

public class HWGetDuplicates {
    public static int getDup(String[] r) {
        int count = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = i + 1; j < r.length; j++) {
                if (r[i].equals(r[j])) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }

        }return count + 1;
    }

    public static void main(String[] args) {
    System.out.println(getDup(new String[]{"1", "5", "3", "5", "4", "2", "5"}));
    }

    }
