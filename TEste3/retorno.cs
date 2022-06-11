namespace TEste3
{
    public class retorno
    {
        public retorno(){}
        
        public retorno(int cep, string tipoCep, string subTipoCep, string uf,
                       string cidade, string bairro, string endereco, string complemento,
                       string codigoIbge)
                       {
                           Cep         = cep;
                           TipoCep     = tipoCep;
                           SubTipoCep  = subTipoCep;
                           Uf          = uf;
                           Cidade      = cidade;
                           Bairro      = bairro;
                           Endereco    = endereco;
                           Complemento = complemento;
                           CodigoIbge  = codigoIbge;
                       }

        public int Cep { get; set; }
        public string TipoCep { get; set; }
        public string SubTipoCep { get; set; }
        public string Uf { get; set; }
        public string Cidade { get; set; }
        public string Bairro { get; set; }
        public string Endereco { get; set; }
        public string Complemento { get; set; }
        public string CodigoIbge { get; set; }
    }
}