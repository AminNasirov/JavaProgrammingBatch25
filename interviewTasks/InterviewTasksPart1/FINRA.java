package InterviewTasksPart1;

public class FINRA {
    public static void main(String[] args) {

        finra(30);

    }

    public static void finra(int num) {
        String result = "";

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                result = "FINRA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else if (i % 5 == 0) {
                result = "RA";
            } else {
                result = "" + i;
            }
            System.out.print(result + " ");

        }

    }
}