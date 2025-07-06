package homwork.task3;

public class StudentGrades {

        //    Крок 1 Створюємо клас StudentGrades.
//    Всередині класу оголошуємо приватне поле grades типу int[] (масив цілих чисел),
//    яке зберігає оцінки студентів.
//        public int[] grades;

//    Крок 2. Створюємо конструктор
//Це конструктор класу, який приймає масив grades як параметр і зберігає його у полі this.grades.
//    this.grades означає: «поле класу grades» (щоб не плутати з параметром конструктора).

//
//        public StudentGrades1(int[] grades){
//            this.grades=grades;
//        }

//    Крок 3. Метод для виведення всіх оцінок
//Метод printGrades виводить усі оцінки.
//Використовує цикл for-each, який перебирає кожне число grade у масиві grades.

//        public void printGrades() {
//            System.out.println("Оцінки студентів:");
//            for (int grade : grades) { // цикл for-each
//                System.out.print(grade + " ");
//            }
//            System.out.println();
//        }

//    Крок 4. Метод для знаходження мінімальної оцінки
//Ініціалізуємо min першим елементом масиву.
//Обходимо всі оцінки:
//якщо поточна оцінка grade менша за min, оновлюємо min.
//Після циклу повертаємо знайдений мінімум.

//        public int getMinGrade() {
//            int min = grades[0]; // спочатку припустимо, що мінімум — перший елемент
//            for (int grade : grades) {
//
//                if (grade < min) { // якщо знайдено менше
//                    min = grade;
//                }
//            }
//            return min;
//        }
//    Крок 5. Метод для знаходження максимальної оцінки


//        public int getMaxGrade() {
//            int max = grades[0]; // спочатку припустимо, що максимум — перший елемент
//            for (int grade : grades) {
//                if (grade > max) { // якщо знайдено більше
//                    max = grade;
//                }
//            }
//            return max;
//        }


//    Крок 6. Метод для знаходження середньої оцінки
//Обчислюємо суму всіх оцінок у змінній sum.
//Потім ділимо на кількість елементів у масиві (grades.length).
//    (double) використовується для приведення до дробового типу, щоб середнє не обрізалося до цілого.

//    public double getAverageGrade() {
//    int sum = 0;
//    for (int grade : grades) {
//        sum += grade; // додаємо кожну оцінку до суми
//    }
//    return (double) sum / grades.length; // ділимо на кількість оцінок
//}



//public static void main(String[] args) {
//    int[] grades = {85, 92, 76, 81, 95};

//        int[] grades = {85, 92, 76, 81, 95}; // створили масив оцінок
//        StudentGrades studentGrades = new StudentGrades(grades); // створили об'єкт
//
//        studentGrades.printGrades();
//        System.out.println("Мінімальна оцінка: " + studentGrades.getMinGrade());
//        System.out.println("Максимальна оцінка: " + studentGrades.getMaxGrade());
//        System.out.println("Середня оцінка: " + studentGrades.getAverageGrade());




}
