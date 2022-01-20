package designpatterns.factory;

import designpatterns.factory.Plan;
import designpatterns.factory.CommercialPlan;
import designpatterns.factory.DomesticPlan;
import designpatterns.factory.InstitutionalPlan;

public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) return null;
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) return new DomesticPlan();
        else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) return new CommercialPlan();
        else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) return new InstitutionalPlan();
        return null;
    }
}
