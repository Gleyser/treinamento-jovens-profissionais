package tarde1;

public enum TipoImpostoEnum {
	
	ICMS() {
        @Override
        BigDecimal calcula(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.3"));
        }
    },
    ISS() {
        @Override
        BigDecimal calcula(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }
    },
    COFINS() {
        @Override
        BigDecimal calcula(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.5"));
        }
    },
    
    PIX() {
		@Override
		BigDecimal calcula(Orcamento orcamento) {
			
			
			
		}
	};

    abstract BigDecimal calcula(Orcamento orcamento);
}
