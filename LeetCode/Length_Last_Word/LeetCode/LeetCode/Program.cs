using System;
using System.Text;

namespace LeetCode
{
    class Program
    {
        static void Main(string[] args)
        {
            string k = "  23\f6??6f\'32LL";

            var x = IsPalindrome(k);

            Console.WriteLine(x);
        }

        public static bool IsPalindrome(string s)
        {
            string sTrimmed = s.Trim().ToLower();
            
            StringBuilder sOriginal = new StringBuilder();
            StringBuilder sReversed = new StringBuilder();

            // Correto
            for (int i = 0; i < sTrimmed.Length; i++)
            {
                if(char.IsLetterOrDigit(s[i]))
                {
                    sOriginal.Append(s[i].ToString().ToLower());
                }
            }

            // Reverso
            for (int i = sOriginal.Length; i  > 0; i--)
            {
                if (char.IsLetterOrDigit(sOriginal[i-1]))
                {
                    sReversed.Append(sOriginal[i-1].ToString().ToLower());
                }
            }

            if(sOriginal.ToString() == sReversed.ToString())
            {
                return true;
            }

            return false;
        }
    }
}


