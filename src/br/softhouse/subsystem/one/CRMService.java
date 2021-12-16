package br.softhouse.subsystem.one;

public class CRMService {

    private CRMService() {
        super();
    }

    public static void persistCustomer(String name, String zipCode, String city, String state) {
        System.out.println("Customer saved in the CRM system.");
        System.out.println(name);
        System.out.println(zipCode);
        System.out.println(city);
        System.out.println(state);
    }
}
