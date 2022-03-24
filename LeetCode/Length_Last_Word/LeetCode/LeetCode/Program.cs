using System;

namespace LeetCode
{
    class Program
    {
        static void Main(string[] args)
        {

            string[] strs = { "flower", "flow", "flight" };

            string y = LongestCommonPrefix(strs);

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
            int cont = 0;

            for(int i = 1; i < strs.Length; i++)
            {
                for (int j = 1; j < posUm.Length; j++)
                { 
                    if (posUm[j - 1] == strs[i][j - 1])
                    {
                        continue;
                    }
                    cont++;
                }
                
            }
            if (cont > 0)
            {
                for (int k = 0; k < cont; k++)
                {
                    resul += strs[1][k];
                }
            }
            return null;
        }

    }
}
