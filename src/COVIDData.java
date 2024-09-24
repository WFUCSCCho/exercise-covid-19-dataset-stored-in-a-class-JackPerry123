public class COVIDData implements Comparable<COVIDData> {
    // Date,Country/Region,Confirmed,Deaths,Recovered,Active,New cases,New deaths,New recovered,WHO Region
    private String date;
    private String country;
    private Integer confirmed;
    private Integer deaths;
    private Integer recovered;
    private Integer active;
    private Integer newCases;
    private Integer newDeaths;
    private Integer newRecovered;
    private String whoRegion;

    // default constructor
    public COVIDData() {
        this.date = "";
        this.country = "";
        this.confirmed = 0;
        this.deaths = 0;
        this.recovered = 0;
        this.active = 0;
        this.newCases = 0;
        this.newDeaths = 0;
        this.newRecovered = 0;
        this.whoRegion = "";
    }


    // Constructor for COVID data
    public COVIDData(String date, String country, Integer confirmed, Integer deaths, Integer recovered, Integer active, Integer newCases, Integer newDeaths, Integer newRecovered, String whoRegion) {
        this.date = date;
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
        this.active = active;
        this.newCases = newCases;
        this.newDeaths = newDeaths;
        this.newRecovered = newRecovered;
        this.whoRegion = whoRegion;
    }

    // String interface for COVID data
    @Override
    public String toString() {
        return "Date: " + date + ", Country: " + country + ", Confirmed: " + confirmed + ", Deaths: " + deaths + ", Recovered: " + recovered + ", Active: " + active + ", New Cases: " + newCases + ", New Deaths: " + newDeaths + ", New Recovered: " + newRecovered + ", WHO Region: " + whoRegion;
    }

    // TODO: Comparable interface for COVID data
    public int compareTo(COVIDData d){
        return this.confirmed.compareTo(d.confirmed);

    }
    // Getters and Setters for Date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getters and Setters for Country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Getters and Setters for Confirmed
    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    // Getters and Setters for Deaths
    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    // Getters and Setters for Recovered
    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    // Getters and Setters for Active
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    // Getters and Setters for New Cases
    public Integer getNewCases() {
        return newCases;
    }

    public void setNewCases(Integer newCases) {
        this.newCases = newCases;
    }

    // Getters and Setters for New Deaths
    public Integer getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Integer newDeaths) {
        this.newDeaths = newDeaths;
    }

    // Getters and Setters for New Recovered
    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    // Getters and Setters for WHO Region
    public String getWhoRegion() {
        return whoRegion;
    }

    public void setWhoRegion(String whoRegion) {
        this.whoRegion = whoRegion;
    }
}