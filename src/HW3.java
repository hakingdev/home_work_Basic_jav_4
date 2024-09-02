/*
Создайте метод, который будет считать сколько денег получает работник в неделю. Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).


Каждый час после 40 считается за полтора.
Работник не может работать больше, чем 60 часов в неделю.
Работник не может получать меньше 8 долларов в час.
 */
public class HW3 {
    public static void main(String[] args) {
        System.out.println(calcSallary(8, 61));
    }

    public static String calcSallary(int sallPerHour, int numbHours) {
        if (sallPerHour < 8) {
            System.out.println("Работник не может получать меньше 8$");
        }
        if (sallPerHour >= 8 && numbHours <= 40) {
            sallPerHour  =  (sallPerHour  * numbHours);
        }
        if(numbHours > 40 && numbHours <= 60 && sallPerHour >= 8 ) {
            sallPerHour  = (int) (sallPerHour * 1.5) * numbHours;
        }
        if (numbHours > 60) {
            sallPerHour = 0;
            System.out.println("Больше 60 часов никто работать не будет!");
        }
        return "Зарплата = " + sallPerHour;
    }
}
