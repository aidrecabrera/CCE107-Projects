package um.aidre.cce107projects;

public class ACT_1_2 {
    public static void main(String[] args) {
        functions functions = new functions();
        functions.firstProblem();
        functions.secondProblem();
    }
}

class functions {
    void firstProblem() {
        String shirtSize = "XL";
        double shirtPrice = 600;
        if (shirtSize.equals("XL") && shirtPrice > 500) {
            shirtPrice -= 100;
            System.out.println("Discount applied! New price: " + shirtPrice);
        } else if (shirtSize.equals("L") && shirtPrice > 400) {
            shirtPrice -= 50;
            System.out.println("Discount applied! New price: " + shirtPrice);
        } else {
            System.out.println("No discount applied. Final price: " + shirtPrice);
        }
    }
    void secondProblem() {
        int temp = 25;
        if(temp < 20){
            System.out.println("IT'S COLD");
        }else{
            int tempCheck = temp>30?1:0;
            switch (tempCheck) {
                case 1:
                    System.out.println("IT'S HOT");
                    break;
                default:
                    System.out.println("COOL CLIMATE!");
            }
        }
    }
}
