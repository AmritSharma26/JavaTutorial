
class Learning_If_Else {

    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bob";

        System.out.println("before if");
        if (isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms." + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = false;
        boolean isAdult = false;

        // if(isSeniorCitizen){
        //     System.out.println("Hello Senior Citizen");
        // }else{
        //     if(isAdult){
        //         System.out.println("Hello Adult");
        //     }else{
        //         System.err.println("Hello Child");
        //     }
        // }
        // if-else ladder
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else if (isAdult) {
            System.out.println("Hello Adult");
        } else {
            System.err.println("Hello Child");
        }

    }
}
