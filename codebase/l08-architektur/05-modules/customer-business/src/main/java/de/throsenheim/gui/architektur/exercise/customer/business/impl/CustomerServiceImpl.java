package de.throsenheim.gui.architektur.exercise.customer.business.impl;

import de.throsenheim.gui.architektur.exercise.customer.dataaccess.CustomerDao;
import de.throsenheim.gui.architektur.exercise.customer.business.api.CustomerDto;
import de.throsenheim.gui.architektur.exercise.customer.business.api.CustomerService;

import java.util.Set;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao dao = new CustomerDao();
    @Override
    public Set<CustomerDto> searchForCustomers(String expression) {
        return dao.findCustomers(expression).stream().map((et) -> {
            return new CustomerDto(et.getName(), et.getLastName());
        }).collect(Collectors.toSet());
    }
}
