package m1NeuroQuantum;
import java.time.*;


public interface Experiment {
	abstract public double calculateInnovationScore(int monthsActive);
	
	public double calculateResourceConsumption(int monthsActive);
	
	public default Experiment getHigherImpactExperiment(Experiment e1, Experiment e2) {
        ExperimentInfo ex1 = (ExperimentInfo) e1;
        ExperimentInfo ex2 = (ExperimentInfo) e2;

        return ex1.getFundingAmount() > ex2.getFundingAmount() ? e1 : e2;
	}
	
	public static int getMonthsActive(int initiationMonth, int initiationYear) {
		int getMonths = (LocalDate.now().getYear() - initiationYear) * 12 + (LocalDate.now().getMonthValue() - initiationMonth); 
		return getMonths;
	}
	
}
