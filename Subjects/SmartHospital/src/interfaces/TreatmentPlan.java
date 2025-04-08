package interfaces;

public interface TreatmentPlan {
    String getTreatmentName();
    double getDosage();
    String getFrequency();
    int getDurationDays();
    void printSummary();
}