using System;
namespace Aula11
{
    public class Lista
    {
        private ItemLista _primeiroItem;

        public void Adicionar(int valor)
        {
            // Cria o novo item para ser adicionado a lista
            ItemLista novoItem = new ItemLista();
            novoItem.ValorItem = valor;

            // Caso não tenha o primeiro item, o próprio item 
            // a ser adicionado (novoItem) acaba sendo o primeiro.
            if (_primeiroItem == null)
            {
                _primeiroItem = novoItem;
            }
            else
            {
                // Inicia a busca do último item, apontando o
                // itemAtual como sendo o primeiro 
                ItemLista itemAtual = _primeiroItem;
                while (itemAtual.ProximoItem != null)
                {
                    itemAtual = itemAtual.ProximoItem;
                }
                // Nesse momento, o itemAtual é o último item

                // Dessa forma, o novoItem é adicionado a esse  último item;
                itemAtual.ProximoItem = novoItem;
            }
        }

        public void Escrever()
        {
            if (_primeiroItem == null)
            {
                Console.WriteLine("Lista vazia.");
                return;
            }

            ItemLista itemAtual = _primeiroItem;
            Console.WriteLine(itemAtual.ValorItem);

            while (itemAtual.ProximoItem != null)
            {
                itemAtual = itemAtual.ProximoItem;
                Console.WriteLine(itemAtual.ValorItem);
            }
        }

        public Lista Remover(int pos)
        {
            Lista listaAux = new Lista();
            int contador = 1;
            ItemLista item = _primeiroItem;

            if(contador != pos)
            {
                listaAux.Adicionar(item.ValorItem);
            }

            while(item.ProximoItem != null)
            {
                contador += 1;
                if(contador != pos)
                {
                    listaAux.Adicionar(item.ProximoItem.ValorItem);
                }
                item = item.ProximoItem;
            }

            return listaAux;
        }
        public void RemoverDois(int pos)
        {
            ItemLista item = _primeiroItem;
            ItemLista temp = item;

            if(pos == 0)
            {
                _primeiroItem = _primeiroItem.ProximoItem;
            }
            else
            {
                for (int i = 0; temp != null && i < pos - 1; i++)
                    temp = temp.ProximoItem;
        
                item = temp.ProximoItem.ProximoItem;
                temp.ProximoItem = item;
            }
        }

        public void Contar()
        {
            int contador = 0;

            if (_primeiroItem == null)
            {
                Console.WriteLine("Lista vazia.");
            }

            ItemLista itemAtual = _primeiroItem;
            contador += 1;

            while (itemAtual.ProximoItem != null)
            {
                itemAtual = itemAtual.ProximoItem;
                contador += 1;
            }

            Console.WriteLine($"A lista tem {contador} itens");
        }
    }
}
