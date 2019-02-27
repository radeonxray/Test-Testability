package main.java;

public class Person {

    String firstName;
    String lastName;
    String address;
    String countryOfBirth;
    String cityOfBith;
    String job;
    String jobTitle;
    String jobAddress;
    String spouse;
    int age;
    int numberOfKids;
    int heigth;
    int feetSize;



    public Person(String firstName, String lastName, String address, String countryOfBirth, String cityOfBith, String job, String jobTitle, String jobAddress, String spouse, int age, int numberOfKids, int heigth, int feetSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.countryOfBirth = countryOfBirth;
        this.cityOfBith = cityOfBith;
        this.job = job;
        this.jobTitle = jobTitle;
        this.jobAddress = jobAddress;
        this.spouse = spouse;
        this.age = age;
        this.numberOfKids = numberOfKids;
        this.heigth = heigth;
        this.feetSize = feetSize;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getCityOfBith() {
        return cityOfBith;
    }

    public void setCityOfBith(String cityOfBith) {
        this.cityOfBith = cityOfBith;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getFeetSize() {
        return feetSize;
    }

    public void setFeetSize(int feetSize) {
        this.feetSize = feetSize;
    }
}
