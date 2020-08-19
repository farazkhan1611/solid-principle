package OpenClosePrinciple.Before;

import java.util.Random;

/*
Principle states class should be open for extension and close for modification
 */
public class InsurancePremiumCalculator {

    // IF you notice the calculate discount only support health insurance customer,
    // imagine a company take over or added new vertical where it supports vehicle insurance, and now wants to offer discount
    int calculateDiscount(HealthInsuranceCustomerProfile customerProfile) {
        if(customerProfile.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }

    // Bad design as we need to open class for adding below method to support vehicle
    int calculateDiscount(VehiclensuranceCustomerProfile customerProfile) {
        if(customerProfile.isLoyalCustomer()) {
            return 20;
        }
        return 0;
    }
}

class HealthInsuranceCustomerProfile {
    Boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}

class VehiclensuranceCustomerProfile {
    Boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
