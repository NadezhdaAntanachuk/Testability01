public class BonusMilesService {
    public int calculate(int price) {
        // количества рублей для одной бонусной мили
        int oneMilePrice = 20;
        int result = price / oneMilePrice;
        return result;
    }
}
