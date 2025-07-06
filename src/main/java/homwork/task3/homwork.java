package homwork.task3;

public class homwork {

        public static void main(String[] args) {

            int[] grades = {85, 92, 76, 81, 95};
            for (int grade : grades) {
                if (grade > 90) {
                    System.out.println(grade + " - відмінна оцінка!");
                } else if (grade < 80) {
                    System.out.println(grade + " - треба підтягнути.");
                } else {
                    System.out.println(grade + " - нормальна оцінка.");
                }
            }
        
    }
}
