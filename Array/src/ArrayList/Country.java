package ArrayList;

public class Country {
    private String countryName;
    private int countryCode;

    public Country() {};

    public Country(String countryName, int countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void showInfo() {
        System.out.println(countryName + "," + countryCode);
    }
}
