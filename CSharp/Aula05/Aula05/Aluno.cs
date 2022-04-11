using System;
namespace Aula05
{
    public class Aluno
    {
        public Aluno()
        { }

        public Aluno(string nomeAluno, double nota1, double nota2)
        {
            this.nomeAluno = nomeAluno;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public string nomeAluno { get; set; }
        public double nota1 { get; set; }
        public double nota2 { get; set; }
    }
}
