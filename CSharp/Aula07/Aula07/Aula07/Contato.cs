using System;
namespace Aula07
{
    public class Contato
    {
        private string _nome;
        private string _telefone;

        public Contato()
        {
        }

        public Contato(string nome, string telefone)
        {
            _nome = nome;
            _telefone = telefone;
        }

        public void setNome(string nome)
        {
            _nome = nome;
        }

        public string getNome()
        {
            return _nome;
        }

        public void setTelefone(string telefone)
        {
            _telefone = telefone;
        }

        public string getTelefone()
        {
            return _telefone;
        }
    }
}
