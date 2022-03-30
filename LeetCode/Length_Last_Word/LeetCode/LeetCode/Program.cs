using System;
using System.Text;

namespace LeetCode
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] k = { 3, 1, 3, 4, 2 };

            var x = FindDuplicate(k);

            Console.WriteLine(x);
        }

        public static int FindDuplicate(int[] nums)
        {

            int cont = 0;
            int valor = 0;

            for (int i = 0; i < nums.Length; i++)
            {
                for (int j = i; j < nums.Length; j++)
                {
                    if(nums[i] == nums[j])
                    {
                        cont++;
                    }

                    if (cont > 1)
                    {
                        valor = nums[i];
                        break;
                    }
                }

                if(cont > 1)
                {
                    break;
                }
                else
                {
                    valor = 0;
                    cont = 0;
                }
            }

            return valor;
        }
    }
}


