namespace AulaAntesProva
{
    public class Fila
    {
        private ItemFila _primeiroItem;
        private ItemFila _ultimoItem;
        
        public void Adicionar(String item)
        {
            // Adicionar sempre na última posição
            ItemFila novoItem = new ItemFila();
            novoItem.Valor = item;

            if(_primeiroItem == null)
            {
                _primeiroItem = novoItem;
            }
            
            // Sempre será o último na adição
            _ultimoItem = novoItem;
        }

        public void Remover()
        {
            // Remover sempre o primeiro item
        }

        public void Escrever()
        {
            // Escrever todos os itens da fila
        }
    }
}