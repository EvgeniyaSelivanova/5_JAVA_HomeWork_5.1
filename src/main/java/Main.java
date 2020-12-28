public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonusBelowLimitForRegistered = service.calculate(1000_60, true);
        System.out.println(bonusBelowLimitForRegistered);

        long bonusOverLimitForRegistered = service.calculate(1_000_000_60, true);
        System.out.println(bonusOverLimitForRegistered);

        long bonusBelowLimitForUnRegistered = service.calculate(1000_60, false);
        System.out.println(bonusBelowLimitForUnRegistered);

        long bonusOverLimitForUnRegistered = service.calculate(1_000_000_60, false);
        System.out.println(bonusOverLimitForUnRegistered);

        long bonusZeroLimitForUnRegistered = service.calculate(0, false);
        System.out.println(bonusZeroLimitForUnRegistered);

        long bonusZeroLimitForRegistered = service.calculate(0, true);
        System.out.println(bonusZeroLimitForRegistered);

        long bonusNegativeLimitForUnRegistered = service.calculate(-1000_60, false);
        System.out.println(bonusNegativeLimitForUnRegistered);

        long bonusNegativeLimitForRegistered = service.calculate(-1000_60, true);
        System.out.println(bonusNegativeLimitForRegistered);

    }
}
