package main;

public class AcquisitionTime {
    private static void calculate(double monthsPerUnit, double totalMonths, int costOfHome, int totalSaved,
                            int monthlySavings, int rentalIncome, int desiredUnits, int currentUnits) {
        while (currentUnits < desiredUnits) {
            while (totalSaved < costOfHome) {
                totalSaved += monthlySavings + rentalIncome;
                monthsPerUnit++;
                totalMonths++;
            }
            currentUnits++;
            rentalIncome += 300;
            totalSaved = totalSaved % costOfHome;
            System.out.println("Current units: " + currentUnits  +
                                "\nRental income: " + rentalIncome +
                                "\nMonths per unit: " + monthsPerUnit +
                                "\nTotal months: " + totalMonths +
                                "\nLeftover savings: " + totalSaved);
            monthsPerUnit = 0;

        }
    }

    public static void main(String[] args) {
        double monthsPerUnit = 0;
        int currentUnits = 0;
        int desiredUnits = 20;
        int rentalIncome = 0;
        int monthlySavings = 1500;
        int totalSaved = 0;
        int costOfHome = 30000;
        double totalMonths = 0;
        calculate(monthsPerUnit, totalMonths, costOfHome, totalSaved,
                monthlySavings, rentalIncome, desiredUnits, currentUnits);

    }
}
