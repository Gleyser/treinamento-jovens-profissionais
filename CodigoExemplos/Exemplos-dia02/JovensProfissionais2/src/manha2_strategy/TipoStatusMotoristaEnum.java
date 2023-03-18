package manha2_strategy;

public enum TipoStatusMotoristaEnum {

	TRANQUILO {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 1;
		}

		@Override
		boolean podeDirigir() {			
			return true;
		}
	},
	TRISTE {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 0.8;
		}

		@Override
		boolean podeDirigir() {
			// TODO Auto-generated method stub
			return true;
		}
	},
	NERVOSO {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 1.2;
		}

		@Override
		boolean podeDirigir() {			
			return false;
		}
	},	
	DOENTE{
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 0.2;
		}

		@Override
		boolean podeDirigir() {			
			return false;
		}
	},
	ESTRESSADO {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 1.5;
		}

		@Override
		boolean podeDirigir() {			
			return false;
		}
	};

	// metodo abstrato
	abstract double velocidadeAtualizada(double velocidade);
	
	// metodo abstrato
	abstract boolean podeDirigir();

}
