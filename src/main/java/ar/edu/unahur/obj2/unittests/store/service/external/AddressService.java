package ar.edu.unahur.obj2.unittests.store.service.external;

import ar.edu.unahur.obj2.unittests.store.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private ExternalSystemProxy externalSystemProxy;

    public int getPLZForCustomer(Customer customer) {

        // Assume complicated request here that requires some external host services
        // to retrieve the proper PLZ
        return 12345;
    }


    public String getAddressForCustomer(Customer customer) {
        return customer.getAddress();
    }

    public void updateExternalSystems(Customer customer) {

        // Do something important here
        externalSystemProxy.update(customer);
    }
}