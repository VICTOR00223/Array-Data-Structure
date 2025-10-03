import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        ArrayManager num = new ArrayManager(size);
        num.scan(sc);
        System.out.println("Enter I to insert, D to delete, P to print the numbers, E to exit.");
        String choice = sc.nextLine();
        while(!choice.equals("E"))
        {
            switch (choice)
            {
                case "I":
                {
                    System.out.print("Enter key = ");
                    int key = sc.nextInt();
                    System.out.print("Enter position = ");
                    int position = sc.nextInt();
                    sc.nextLine();

                    if(num.exists(key) == false)
                    {
                        num.insert(key, position);
                        break;
                    }
                    else
                    {
                        System.out.println("This key already exists.");
                        break;
                    }

                }
                case "D":
                {
                    System.out.print("Enter key = ");
                    int key = sc.nextInt();
                    sc.nextLine();

                    if(num.exists(key) == true)
                    {
                        num.delete(key);
                        break;
                    }
                    else
                    {
                        System.out.println("This key does not exist.");
                        break;
                    }
                }
                case "P":
                {
                    num.print();
                    break;
                }
                case "E":
                {
                    break;
                }
            }
            System.out.println("Enter I to insert, D to delete, P to print the numbers, E to exit.");
            choice = sc.nextLine();
        }
        System.out.println("End of program.");
    }
}