class Programa03 {
    public static void main(String[] args) {
        int temperatura = 30;
        Programa03 p = new Programa03();
        System.out.println("Temperatura em celsius:" + temperatura);
        System.out.println("Temperatura em fahrenheit:" + p.celsiusParaFahrenheit(temperatura));
    }

    public static double celsiusParaFahrenheit2(double f) {
        return 1;
    }

    public double celsiusParaFahrenheit(int f) {
        return (f * 9d / 5) + 32;
    }
}
