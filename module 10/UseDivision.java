public class UseDivision {
    public static void main(String[] args) {
        // Create InternationalDivision instances
        InternationalDivision intl1 = new InternationalDivision("Europe Sales", 1001, "Germany", "German");
        InternationalDivision intl2 = new InternationalDivision("Asia Tech", 1002, "Japan", "Japanese");

        // Create DomesticDivision instances
        DomesticDivision dom1 = new DomesticDivision("West Coast Operations", 2001, "California");
        DomesticDivision dom2 = new DomesticDivision("Southern Logistics", 2002, "Texas");

        // Display all divisions
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
