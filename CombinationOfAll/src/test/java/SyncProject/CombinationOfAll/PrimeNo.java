package SyncProject.CombinationOfAll;

import java.util.Scanner;

public class PrimeNo 
{
    public void checkPrime() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        sc.close();

        if (isPrime(no)) 
        {
            System.out.println(no + " is a prime number.");
        } else 
        {
            System.out.println(no + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public boolean isPrime(int n) 
    {
        if (n <= 1) 
        {
            return false;
        }
        if (n == 2 || n == 3) 
        {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) 
        {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) 
        {
            if (n % i == 0 || n % (i + 2) == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        PrimeNo primeChecker = new PrimeNo();
        primeChecker.checkPrime();
    }
}
