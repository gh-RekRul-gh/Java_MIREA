package ru.mirea.it.ivbo;

public enum Season {
    Лето("Я люблю лето за то, что можно позагорать и отдохнуть пару месяцев",
            20.5, "теплое время года"),
    Осень("Я люблю осень за свой День рождения",
            10.33, "прохладное время года"),
    Зима("Я люблю зиму за прохладу и Новый год",
            -12.66, "холодное время года"),
    Весна("Я люблю весну за тепло после зимы и количество выходных",
            12.33, "оттаивающее время года");

    private final String myMind;
    private final double averageTemperature;
    private final String description;

    Season(String myMind, double averageTemperature, String description) {
        this.myMind = myMind;
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public String getMyMind() {
        return myMind;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }
}
