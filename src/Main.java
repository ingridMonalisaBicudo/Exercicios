public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //LINKS:
        //https://www.devmedia.com.br/trabalhando-com-string-string-em-java/21737
        //https://www.geeksforgeeks.org/data-types-in-java/

        String s = "04:59:59AM";

        String sInital = s.substring(0,2);
        String period = s.substring(8);
        String sEnd = s.substring(2,8);

        Integer hour = Integer.parseInt(sInital);

        if(period.equals("PM") && hour != 12){
            hour=hour+12;
            sInital = String.valueOf(hour);
        } else if (period.equals("AM") && hour == 12){
            sInital= "00";
        }

        //System.out.println(period);
        //System.out.println(hour);
        //System.out.println(sInital);
        System.out.println(sInital+sEnd);


    }
}