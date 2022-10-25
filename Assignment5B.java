import java.util.Scanner;
public class Assignment5B {
    public static void main(String[] args) {
        int month;
        int day;
        int num = 0;
        String[][] myArray = new String[12][31];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 1; i++)
        {
            for(int j = 0; j < 19; j++)
            {
                myArray[i][j] = "Capricornus";
            }
        }
        for(int i = 0; i < 2; i++)
        {
            for(int j = 19; j < 30; j++)
            {
                myArray[i][j] = "Aquarius";
            }
        }
        for(int i = 1; i < 2; i++)
        {
            for(int j = 0; j < 18; j++)
            {
                myArray[i][j] = "Aquarius";
            }
        }
        for(int i = 1; i < 2; i++)
        {
            for(int j = 18; j < 30; j++)
            {
                myArray[i][j] = "Pisces";
            }
        }
        for(int i = 2; i < 3; i++)
        {
            for(int j = 0; j < 20; j++)
            {
                myArray[i][j] = "Pisces";
            }
        }
        for(int i = 2; i < 3; i++)
        {
            for(int j = 20; j < 30; j++)
            {
                myArray[i][j] = "Aries";
            }
        }
        for(int i = 3; i < 4; i++)
        {
            for(int j = 0; j < 19; j++)
            {
                myArray[i][j] = "Aries";
            }
        }
        for(int i = 3; i < 4; i++)
        {
            for(int j = 19; j < 30; j++)
            {
                myArray[i][j] = "Taurus";
            }
        }
        for(int i = 4; i < 5; i++)
        {
            for(int j = 0; j < 20; j++)
            {
                myArray[i][j] = "Taurus";
            }
        }
        for(int i = 4; i < 5; i++)
        {
            for(int j = 20; j < 30; j++)
            {
                myArray[i][j] = "Gemini";
            }
        }
        for(int i = 5; i < 6; i++)
        {
            for(int j = 0; j < 20; j++)
            {
                myArray[i][j] = "Gemini";
            }
        }
        for(int i = 5; i < 6; i++)
        {
            for(int j = 20; j < 30; j++)
            {
                myArray[i][j] = "Cancer";
            }
        }
        for(int i = 6; i < 7; i++)
        {
            for(int j = 0; j < 22; j++)
            {
                myArray[i][j] = "Cancer";
            }
        }
        for(int i = 6; i < 7; i++)
        {
            for(int j = 22; j < 30; j++)
            {
                myArray[i][j] = "Leo";
            }
        }
        for(int i = 7; i < 8; i++)
        {
            for(int j = 0; j < 22; j++)
            {
                myArray[i][j] = "Leo";
            }
        }
        for(int i = 7; i < 8; i++)
        {
            for(int j = 22; j < 30; j++)
            {
                myArray[i][j] = "Virgo";
            }
        }
        for(int i = 8; i < 10; i++)
        {
            for(int j = 0; j < 22; j++)
            {
                myArray[i][j] = "Virgo";
            }
        }
        for(int i = 8; i < 9; i++)
        {
            for(int j = 22; j < 30; j++)
            {
                myArray[i][j] = "Libra";
            }
        }
        for(int i = 9; i < 10; i++)
        {
            for(int j = 0; j < 22; j++)
            {
                myArray[i][j] = "Libra";
            }
        }
        for(int i = 9; i < 10; i++)
        {
            for(int j = 22; j < 30; j++)
            {
                myArray[i][j] = "Scorpio";
            }
        }
        for(int i = 10; i < 11; i++)
        {
            for(int j = 0; j < 21; j++)
            {
                myArray[i][j] = "Scorpio";
            }
        }
        for(int i = 10; i < 11; i++)
        {
            for(int j = 21; j < 30; j++)
            {
                myArray[i][j] = "Sagittarius";
            }
        }
        for(int i = 11; i < 12; i++)
        {
            for(int j = 0; j < 21; j++)
            {
                myArray[i][j] = "Sagittarius";
            }
        }
        for(int i = 11; i < 12; i++)
        {
            for(int j = 21; j < 30; j++)
            {
                myArray[i][j] = "Capricornus";
            }
        }


        System.out.print("What month were you born in? ");
        month = input.nextInt();
        if(month < 1 || month > 12)
        {
            System.out.println("That is not a valid month...");
            System.exit(0);
        }
        System.out.print("And what day? ");
        day = input.nextInt();
        if(day < 1 || day > 31)
        {
            System.out.println("That is not a valid day...");
            System.exit(0);
        }
        System.out.println("Your zodiac sign is " + myArray[month - 1][day - 1]);

    }
}
