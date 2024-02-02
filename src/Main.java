//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98; //ввести вес человека в кг
        int height = 187; //ввести рост человека в см
        int bmi = service.calculate(mass, height); // расчет индекса массы тела по параметрам масса в кг и рост в см
        System.out.println(bmi); //вывод на экран рассчитанного ИМТ
    }
}