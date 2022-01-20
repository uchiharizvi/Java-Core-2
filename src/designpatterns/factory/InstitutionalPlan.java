package designpatterns.factory;

import designpatterns.factory.Plan;

public class InstitutionalPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.50;
    }
}
