package br.softhouse.subsystem.two;

public class ZipCodeApi {

    private static ZipCodeApi instance = new ZipCodeApi();

    private ZipCodeApi() {
        super();
    }

    public static ZipCodeApi getInstance() {
        return instance;
    }

    public String cityByZipCode(String zipCode) {
        return "Leme";
    }

    public String stateByZipCode(String zipCode) {
        return "SP";
    }

}
