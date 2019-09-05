import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // give me a number 1-12
        // then ask for another number 7-12
        //I wnat to change them to Month and aday of the week
        int num1, num2;
        String month =  " ";
        String daysofweek = "";
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number 1 to 12: ");
        num1 = key.nextInt();
        System.out.println(" Please enter a number from 1 to 7: ");
        num2 = key.nextInt();
        if (num1 == 1) {
            month = "January";
            if (num2 == 1) {
                daysofweek = "Sunday";
            } else if (num1 == 2) {
                daysofweek = "Monday";
            } else if (num2 == 3) {
                daysofweek = "Tuesday";
            } else if (num1 == 4) {
                daysofweek = "Wednday";
            } else if (num2 == 5) {
                daysofweek = "Thursday";
            } else if (num1 == 6) {
                daysofweek = "Friday";
            } else if (num2 == 7) {
                daysofweek = "Saturday";
            } else if (num1 == 2) {
                month = "Feburary";
                if (num2 == 1) {
                    daysofweek = "Sunday";
                } else if (num1 == 2) {
                    daysofweek = "Monday";
                } else if (num2 == 3) {
                    daysofweek = "Tuesday";
                } else if (num1 == 4) {
                    daysofweek = "Wednday";
                } else if (num2 == 5) {
                    daysofweek = "Thursday";
                } else if (num1 == 6) {
                    daysofweek = "Friday";
                } else if (num2 == 7) {
                    daysofweek = "Saturday";}
            else if (num1 == 3) {
                    month = "March";
                    if (num2 == 1) {
                        daysofweek = "Sunday";
                    } else if (num1 == 2) {
                        daysofweek = "Monday";
                    } else if (num2 == 3) {
                        daysofweek = "Tuesday";
                    } else if (num1 == 4) {
                        daysofweek = "Wednday";
                    } else if (num2 == 5) {
                        daysofweek = "Thursday";
                    } else if (num1 == 6) {
                        daysofweek = "Friday";
                    } else if (num2 == 7) {
                        daysofweek = "Saturday";}
                    System.out.println("The moht is" + month + ", The days of the week is " + daysofweek);
                    }
                }

            }
        }
    }

