using System;

namespace LeetCodeVS
{
    class Program
    {
        static void Main(string[] args)
        {
           string[] strs = { "a" };

            string y = LongestCommonPrefix(strs);

            System.Console.WriteLine("Teste");

        }

        public static string LongestCommonPrefix(string[] strs)
        {

            int size = 0;
            for(int x = 1; x < strs.Length; x++)
            {
                if(strs[x].Length > size)
                {
                    size = x;
                }
            }

            string posUm = strs[size];
            string resul = null;

            return resul;
        }
    }
}
