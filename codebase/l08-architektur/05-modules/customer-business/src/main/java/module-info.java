import de.throsenheim.gui.architektur.exercise.customer.business.impl.CustomerServiceImpl;
import de.throsenheim.gui.architektur.exercise.customer.business.api.CustomerService;

module de.throsenheim.gui.architektur.exercise.customer.business {
    requires de.throsenheim.gui.architektur.exercise.customer.dataaccess;

    exports de.throsenheim.gui.architektur.exercise.customer.business.api;

    provides CustomerService with CustomerServiceImpl;
}

