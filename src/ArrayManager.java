import java.util.Scanner;

public class ArrayManager
{
    private int[] num;

    public ArrayManager(int size)
    {
        num = new int[size];
    }

    //---Enter values---
    public void scan(Scanner sc)
    {
        for(int i=0; i< num.length; i++)
        {
            System.out.print("num["+i+"] = ");
            num[i] = sc.nextInt();
        }
        sc.nextLine();
    }

    //---Insert new key---
    public void insert(int key, int position)
    {
        if(position >= 0 && position <= num.length)
        {
            int i;
            int[] new_num = new int[num.length + 1];
            for (i = 0; i < position; i++) {
                new_num[i] = num[i];
            }
            new_num[i] = key;
            for (i = position; i < num.length; i++) {
                new_num[i + 1] = num[i];
            }
            num = new_num;
        }
        else
        {
            System.out.println("Invalid position.");
        }
    }

    //---Delete a key---
    public void delete(int key)
    {
        int i, position = -1;
        int[] new_num = new int[num.length-1];
        for(i=0; i< num.length; i++)
        {
            if(num[i] == key)
            {
                position = i;
                break;
            }
        }
        for(i=0; i<position; i++)
        {
            new_num[i] = num[i];
        }
        for(i=position; i<num.length-1; i++)
        {
            new_num[i] = num[i+1];
        }
        num = new_num;
    }

    //---Check if exists---
    public boolean exists(int key)
    {
        for(int i=0; i< num.length; i++)
        {
            if(num[i] == key)
            {
                return true;
            }
        }
        return false;
    }

    //---Print the array---
    public void print()
    {
        if(num.length > 0)
        {
            for(int i=0; i< num.length; i++)
            {
                System.out.println("num["+i+"] = "+num[i]);
            }
        }
        else
        {
            System.out.println("Array is empty");
        }
    }
}
