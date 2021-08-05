public class monthManip extends andria {

    private String[] monthArray = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov",
            "Dec" };
    private int monthNumber;
    private String monthName;

    /**
     * Constructor
     * 
     * @param mon
     */
    public monthManip(int mon) {
        monthNumber = mon;
        monthName = monthArray[monthNumber - 1];
    }

    /**
     * 
     * Sets both name and Month
     */
    public void setMonthName() {
        monthNumber = rInt("Which month would you like?");

        if (monthNumber < 1 || monthNumber > 12) {
            monthNumber = 1;
        }
        monthName = monthArray[monthNumber - 1];
    }

    public Integer getmonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    public String toString() {
        return "Month Number " + monthNumber + " and\nMonth Name " + monthName;
    }

    public boolean equals(monthManip sample, monthManip sample2) {
        boolean value = false;

        if (sample.getmonthNumber() == sample2.getmonthNumber()) {
            value = true;
            return value;
        }
        return value;
    }

    public boolean lessThan(monthManip sample, monthManip sample2) {
        boolean value = false;

        if (sample.getmonthNumber() < sample2.getmonthNumber()) {
            value = true;
            return value;
        }
        return value;
    }

    public boolean greaterThan(monthManip sample, monthManip sample2) {
        boolean value = false;

        if (sample.getmonthNumber() > sample2.getmonthNumber()) {
            value = true;
            return value;
        }
        return value;
    }

    /**
     * @param month object
     *
     */
    public void equals() {

    }

}
