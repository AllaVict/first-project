public class HomeWork3 {
    public static void main(String[] args) {
        // First level:
        // В Китае живет 1 411 778 724 человек, всего в мире 197 стран.
        // Сколько бы человек жило на земле, если бы в каждой стране жило население, равное китайскому?
        long populationOfChina = 1_411_778_724;
        int allCountries = 197;
        long populationOfWorld = populationOfChina * allCountries;
        System.out.println(populationOfWorld);

        // Level2: Феликс прожил 3011456_567 секунд. Сколько лет прожил Феликс?
        // Посчитать, используя Java, Long-переменные и деление.
        // Кто не знает - по какой формуле посчитать - напишите мне, но сначала подумайте
        long lifeOfFeliksInSecond = 3_011_456_567L;
        long lifeOfFeliksInYear = lifeOfFeliksInSecond / (365 * 24 * 60 * 60);
        System.out.println(lifeOfFeliksInYear);

    }
}
