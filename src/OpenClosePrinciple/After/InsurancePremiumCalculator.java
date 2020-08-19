package OpenClosePrinciple.After;

import java.util.Random;

/*
Principle states class should be open for extension and close for modification
 */
public class InsurancePremiumCalculator {

    // IF you notice the calculate discount only support health insurance customer,
    // imagine a company take over or added new vertical where it supports vehicle insurance, and now wants to offer discount
    // To solve above problem we add customerProfile interface and close this class for extension
    int calculateDiscount(CustomerProfile customerProfile) {
        if(customerProfile.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}

interface CustomerProfile {
    Boolean isLoyalCustomer();
}

class HealthInsuranceCustomerProfile implements CustomerProfile{
    @Override
    public Boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}

class VehicleInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public Boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}

class HomeInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public Boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
