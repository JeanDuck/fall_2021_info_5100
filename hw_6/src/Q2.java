import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws ParseException {
        //the input type should be like 15-10-2019-> "dd-M-yyyy"
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        DrivingLicenseApplication cur= new DrivingLicenseApplication(inputString);

    }
    static class DrivingLicenseApplication{
        public DrivingLicenseApplication(String date) {
            String[] preDate=date.split("-");
            int start=Integer.parseInt(preDate[2]);

            String[] endDate=new SimpleDateFormat("dd-M-yyyy").format(new Date()).toString().split("-");
            int end=Integer.parseInt(endDate[2]);
            int diff=end-start;
            try {
                if(diff<16){
                    throw new Exception("The age of the applicant is "+diff+ " which is too early to apply for a driving license");
                }

            }catch (Exception e){
                System.out.println(e);
            }

        }

    }
}
