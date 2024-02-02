public class BmiService {
    public int calculate(int massKG, int heightSM) {
        double bmi = massKG*100*100/heightSM/heightSM; //расчет по формуле с учетом приведения роста в метры
        int bmiInt=(int)bmi; //привести дробное значение ИМТ к целому
        return bmiInt;
    }
}
