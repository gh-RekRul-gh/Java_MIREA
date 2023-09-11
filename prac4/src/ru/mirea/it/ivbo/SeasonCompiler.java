package ru.mirea.it.ivbo;

public class SeasonCompiler {
    public static void main(String[] args) {
        Season[] seasons = Season.values();
        int count = 1;
        for (Season season : seasons) {
            switch (count) {
                case 1 -> System.out.print("Первый сезон это ");
                case 2 -> System.out.print("Второй сезон это ");
                case 3 -> System.out.print("Третий сезон это ");
                case 4 -> System.out.print("Четвертый сезон это ");
                default -> System.out.println("Something's wrong");
            }
            System.out.println(season);
            System.out.println(season.getMyMind());
            System.out.println("Средняя температура в течение этого сезона " + season.getAverageTemperature() + "ºC");
            System.out.println(season + " это " + season.getDescription());
            if (count != 4) {
                System.out.println("\n");
                count++;
            }
        }
    }
}
