package m1NeuroQuantum;

public class ExperimentInfo implements Experiment{
	int experimentId;
	String experimentTitle;
	String leadResearcher;
	double fundingAmount;
	String complexityLevel;
	int initiationMonth;
	int initiationYear;
	
	ExperimentInfo(){}
	
	public ExperimentInfo(int experimentId, String experimentTitle, String leadResearcher, double fundingAmount,
			String complexityLevel, int initiationMonth, int initiationYear) {
		super();
		this.experimentId = experimentId;
		this.experimentTitle = experimentTitle;
		this.leadResearcher = leadResearcher;
		this.fundingAmount = fundingAmount;
		this.complexityLevel = complexityLevel;
		this.initiationMonth = initiationMonth;
		this.initiationYear = initiationYear;
	}
	public int getExperimentId() {
		return experimentId;
	}
	public void setExperimentId(int experimentId) {
		this.experimentId = experimentId;
	}
	public String getExperimentTitle() {
		return experimentTitle;
	}
	public void setExperimentTitle(String experimentTitle) {
		this.experimentTitle = experimentTitle;
	}
	public String getLeadResearcher() {
		return leadResearcher;
	}
	public void setLeadResearcher(String leadResearcher) {
		this.leadResearcher = leadResearcher;
	}
	public double getFundingAmount() {
		return fundingAmount;
	}
	public void setFundingAmount(double fundingAmount) {
		this.fundingAmount = fundingAmount;
	}
	public String getComplexityLevel() {
		return complexityLevel;
	}
	public void setComplexityLevel(String complexityLevel) {
		this.complexityLevel = complexityLevel;
	}
	public int getInitiationMonth() {
		return initiationMonth;
	}
	public void setInitiationMonth(int initiationMonth) {
		this.initiationMonth = initiationMonth;
	}
	public int getInitiationYear() {
		return initiationYear;
	}
	public void setInitiationYear(int initiationYear) {
		this.initiationYear = initiationYear;
	}
	
	
	public double calculateInnovationScore(int monthsActive) {
		double multiplier = 0;
		if(complexityLevel.equals("QubitOpt:")) {
			multiplier = 1.5;
		}else if(complexityLevel.equals("Entanglement")) {
			multiplier = 2.5;
		}else if(complexityLevel.equals("Cryptography")) {
			multiplier = 3.5;
		}
		return (multiplier * monthsActive * fundingAmount) / 100;
	}
	
	public double calculateResourceConsumption(int monthsActive) {
		double rate = 0;
		if(complexityLevel.equals("QubitOpt:")) {
			rate = 0.8;
		}else if(complexityLevel.equals("Entanglement")) {
			rate = 1.2;
		}else if(complexityLevel.equals("Cryptography")) {
			rate = 1.8;
		}
		return ((((rate * monthsActive * fundingAmount) / 100)*10.0))/10.0;
	}
	
}
