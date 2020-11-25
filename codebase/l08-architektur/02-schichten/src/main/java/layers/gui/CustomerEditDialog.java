package layers.gui;

import layers.business.CustomerDto;
import layers.dataaccess.AddressEt;
import layers.dataaccess.DbConstants;

public class CustomerEditDialog {
    private CustomerDto customer;
    private AddressEt address;

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
        this.address = customer.getAddress();
    }
}
