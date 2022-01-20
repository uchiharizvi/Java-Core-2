package designpatterns.factory;

import designpatterns.factory.Plan;

public class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 7.50;
    }
}
