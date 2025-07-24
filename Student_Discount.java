public class Student_Discount {

    public static void main(String[] args) {

        byte studentGradeLevel = 12;   
        float tuitionFee = 90000.0f;
        float discountPercent = 0.0f;
        boolean academicTopper = true;

        if(studentGradeLevel >= 9 && studentGradeLevel <= 12) {
            if (academicTopper) {
                discountPercent = 20.0f;
            } else{
                discountPercent = 10.0f;
            }
        } else if(studentGradeLevel >= 6 && studentGradeLevel <= 8) {
            discountPercent = 5.0f;
        }

        if(studentGradeLevel == 10) {
            discountPercent+= 3.0f;
        } else if(studentGradeLevel == 12) {
            discountPercent+= 5.0f;
        }

        double discountAmount = (discountPercent / 100) * tuitionFee;
        double updatedFee = tuitionFee - discountAmount;
        
        System.out.println("The actual tuition fee: " + tuitionFee);
        System.out.println("The applied discount percent: " + discountPercent);
        System.out.println("The discounted tuition fee: " + updatedFee);
    }
}
