import java.util.Scanner;
public class Assignment5A {
    public static void main(String[] args) {

        String[] myArray = new String[5];
        Scanner input = new Scanner(System.in);
        String nameInput = null;
        int i = 0;
        int arrayIndex;
        System.out.println("[Top 5 Friend's List]");
        int num = 0;

            while (num != 4)
            {
            System.out.print("What would you like to do?\n" + "1) Enter a friend's name\n" + "2) Replace a friend's name\n"
                    + "3) Display your friends list\n" + "4) Quit\n" + "Your choice: ");
            num = input.nextInt();

            switch (num) {
                case 1:
                    if(i < myArray.length)
                    {
                        System.out.println("Enter a name: ");
                        nameInput = input.next();
                        String name1 = myArray[0];
                        String name2 = myArray[1];
                        String name3 = myArray[2];
                        String name4 = myArray[3];
                        String name5 = myArray[4];
                        if (nameInput.equals(name1) || nameInput.equals(name2) || nameInput.equals(name3) || nameInput.equals(name4) || nameInput.equals(name5))
                        {
                            System.out.println("That name is already in the list.");
                        }
                        else
                        {
                            myArray[i] = nameInput;
                            i++;
                        }
                    }
                    if (i >= myArray.length)
                    {
                        System.out.println("Sorry, your friends list is full\n");
                    }

                    break;

                case 2:
                    System.out.print("Enter a name: ");
                    nameInput = input.next();
                    System.out.print("Enter an index: ");
                    arrayIndex = input.nextInt();
                    if(arrayIndex < 0 || arrayIndex > myArray.length)
                    {
                        System.out.print("Sorry, that's an invalid command!\n");
                    }
                    else
                    {
                        System.out.print(nameInput + " has replaced " + myArray[arrayIndex - 1] + " on your friends list!\n");
                        myArray[arrayIndex - 1] = nameInput;
                    }
                    break;

                case 3:
                    for (int k = 0; k < myArray.length; k++) {
                        if (myArray[k] == null)
                        {
                            myArray[k] = "";
                        }
                    }
                    System.out.print("1) " + myArray[0] + "\n" + "2) " + myArray[1] + "\n" + "3) " + myArray[2] + "\n" +
                            "4) " + myArray[3] + "\n" + "5) " + myArray[4] + "\n");
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid input, try again!");
                    break;
            }
        }

    }
}


