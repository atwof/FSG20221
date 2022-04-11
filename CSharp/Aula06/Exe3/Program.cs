
// Variáveis
int v1 = 0;
int v2 = 0;
char op;

// Leituras dos valores e da operação
System.Console.Write("Digite um valor: ");
try {v1 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Valor será 0");}

System.Console.Write("Digite a operação [ + , - , *, / ]: ");
op = char.Parse(Console.ReadLine());

System.Console.Write("Digite um valor: ");
try {v2 = int.Parse(Console.ReadLine());}
catch {System.Console.WriteLine("Valor inválido. Valor será 0");}

// Execução da operação conforme escolha do usuário 
switch(op)
{
    case '+':
        System.Console.WriteLine($"A soma dos valores é {Somar(v1,v2)}");
        break;
    case '-':
        System.Console.WriteLine($"A subtração dos valores é {Subtrair(v1,v2)}");
        break;
    case '*':
        System.Console.WriteLine($"A multiplicação dos valores é {Multiplicar(v1,v2)}");
        break;
    case '/':
        if(v2 == 0)
        {
            System.Console.WriteLine("Não é possível dividir por 0");
        }
        else
        {
            System.Console.WriteLine($"A divisão dos valores é {Dividir(v1,v2)}");
        }
        break;
    default:
        System.Console.WriteLine("Operação inválida");
        break;
}

// Operações
static int Somar(int v1, int v2)
{
    int soma;
    soma = v1 + v2;
    return soma;
}

static int Subtrair(int v1, int v2)
{
    int sub;
    sub = v1 - v2;
    return sub;
}

static double Dividir(int v1, int v2)
{
    double div;
    div = (double) v1 / (double) v2;
    return div;
}

static int Multiplicar(int v1, int v2)
{
    int mult;
    mult = v1 * v2;
    return mult;
}
