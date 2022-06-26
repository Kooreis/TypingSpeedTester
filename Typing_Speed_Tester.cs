```CSharp
using System;
using System.Diagnostics;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        string[] words = { "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
        string sentence = string.Join(" ", words);
        Console.WriteLine("Type the following: \n" + sentence);
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.Start();
        string input = Console.ReadLine();
        stopwatch.Stop();
        if (input == sentence)
        {
            double typingSpeed = (double)words.Length / stopwatch.Elapsed.TotalMinutes;
            Console.WriteLine("Your typing speed is " + typingSpeed + " words per minute");
        }
        else
        {
            Console.WriteLine("Incorrect input. Please try again.");
        }
    }
}
```