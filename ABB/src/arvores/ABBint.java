package arvores;

public class ABBint {
	
	private class ARVORE{
		int dado;
		ARVORE esq, dir;
	}

	public ARVORE root = null;

	public ARVORE inserir(ARVORE p, int info){
		//inserir elemento em uma ABB
		if (p ==null){
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}
		else if(info < p.dado) {
			p.esq = inserir(p.esq, info);
		}else {
			p.dir = inserir(p.esq, info);
		}
		
		return null;
		
	}

	public void listaEmOrdem(ARVORE root) {
		
		
		
	}
	
	public int contaNos(ARVORE p, int cont) {
		
		if(p != null) {
			cont++;
			cont = contaNos(p.esq, cont);
			cont = contaNos(p.dir, cont);
		}
		
		return cont;
	}
	
	public boolean consulta(ARVORE p, int num) {
		
		if(p == null) {
			return false;
		}else {
			if(p.dado == num) {
				return true;
			}else {
				if(num < p.dado) {
					return (consulta(p.esq, num));
				}else {
					return (consulta(p.dir, num));
				}
			}
		}
		
	}

	
	public int contaConsulta(ARVORE p, int info) {
		int aux = 0;
		return aux;
	}
	
}
