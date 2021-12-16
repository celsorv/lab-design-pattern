package br.softhouse.facade;

import br.softhouse.subsystem.one.CRMService;
import br.softhouse.subsystem.two.ZipCodeApi;

public class Facade {

    public void migrateCustomer(String name, String zipCode) {
        String city  = ZipCodeApi.getInstance().cityByZipCode(zipCode);
        String state = ZipCodeApi.getInstance().stateByZipCode(zipCode);

        CRMService.persistCustomer(name, zipCode, city, state);
    }

}
