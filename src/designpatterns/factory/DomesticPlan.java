package designpatterns.factory;

import designpatterns.factory.Plan;

public class DomesticPlan extends Plan {
    @Override
    public void getRate() {
        rate = 3.50;
    }
}
