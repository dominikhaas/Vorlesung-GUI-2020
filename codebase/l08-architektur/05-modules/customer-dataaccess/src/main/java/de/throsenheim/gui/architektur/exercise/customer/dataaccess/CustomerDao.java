package de.throsenheim.gui.architektur.exercise.customer.dataaccess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CustomerDao {

    public Set<CustomerEt> findCustomers(String name) {
        return new HashSet<>(Arrays.asList(
                new CustomerEt("Hans", "Dampf"),
                new CustomerEt("Dörthe", "Müller")
        ));
    }
}
