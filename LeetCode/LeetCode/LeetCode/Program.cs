using System;

namespace LeetCode
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }

        static bool ValidarString(string s, string t)
        {
            char var = '#';
            int size = 0;

            // Maior dos dois
            if(s.Length > t.Length)
                size = s.Length;
            else
                size = t.Length;


            return true;
        }
    }
}
