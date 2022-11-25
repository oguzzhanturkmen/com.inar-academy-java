package chapters.chapter_12;

    public class LoanModified {
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private java.util.Date loanDate;

        public LoanModified() {
            this(2.5, 1, 1000);
        }
        public LoanModified(double annualInterestRate, int numberOfYears, double loanAmount) {
            setAnnualInterestRate(annualInterestRate);
            setNumberOfYears(numberOfYears);
            setLoanAmount(loanAmount);
            loanDate = new java.util.Date();
        }
        public double getAnnualInterestRate() {
            return annualInterestRate;
        }
        public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
            if(annualInterestRate <= 0) {
                throw new IllegalArgumentException("Must be bigger than 0");
            }
            this.annualInterestRate = annualInterestRate;
        }
        public int getNumberOfYears() {
            return numberOfYears;
        }
        public void setNumberOfYears(int numberOfYears) {
            if(annualInterestRate <= 0) {
                throw new IllegalArgumentException("Must be bigger than 0");
            }
            this.numberOfYears = numberOfYears;
        }
        public double getLoanAmount() {
            return loanAmount;
        }
        public void setLoanAmount(double loanAmount) {
            if(annualInterestRate <= 0) {
                throw new IllegalArgumentException("Must be bigger than 0");
            }
            this.loanAmount = loanAmount;
        }
        public double getMonthlyPayment() {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                    (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;
        }
        public double getTotalPayment() {
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
        }
        public java.util.Date getLoanDate() {
            return loanDate;
        }
}
