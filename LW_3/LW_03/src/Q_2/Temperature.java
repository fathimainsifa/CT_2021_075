package Q_2;

public class Temperature {
    private double celsius;
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
    public double getCelsius() {
        return this.celsius;
    }
}


