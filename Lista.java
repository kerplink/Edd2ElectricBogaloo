import java.util.List;

class Lista {
    private Nodo laCabeza;
    
    Lista() { 
        laCabeza = null; 
    }
    
    void Insertar(int elObjeto) { // Insertar al inicio
        Nodo nuevoNodo = new Nodo(elObjeto, null);
        nuevoNodo.next = laCabeza;
        laCabeza = nuevoNodo;
    }

    public boolean EstaVacia() {
        return laCabeza == null;
    }

    int Obtener(int pos) { // Obtener por posición
        Nodo actual = laCabeza;
        int i = 0;
        while (actual != null) {
            if (i == pos)
                return actual.elObjeto;
            actual = actual.next;
            i++;
        }
        return -1;
    }
    
    public boolean Buscar(int o) { // Buscar por dato o
        Nodo actual = laCabeza;
        while (actual != null) {
            if (actual.elObjeto == o)
                return true;
            actual = actual.next;
        }
        return false;
    }

    public int Tamanio() { // Tamaño de la lista
        Nodo actual = laCabeza;
        int i = 0;
        while (actual != null) {
            actual = actual.next;
            i++;
        }
        return i;
    }

    public void Eliminar(int pos) {
        int cont = 0;
        if(laCabeza!=null){
            if(pos==0){
                if(laCabeza!=null)laCabeza=laCabeza.next;
            }else{
                Nodo p = laCabeza;
                Nodo q = laCabeza.next;
                while(p.next!=null){
                    if(cont==pos){
                        p.next = q.next;
                    }else{
                        p=q;q=q.next;
                        cont++;
                    }
                }
            }
        }
        //Implementar
    }

    public void Imprimir() {
        Nodo actual = laCabeza;
        while (actual != null) {
            System.out.print(actual.elObjeto + " ");
            actual = actual.next;
        }
        System.out.println();
    }
    public void ImprimirInversa(Lista x) throws Exception{
        Pila2 s = new Pila2();
        Nodo p = x.laCabeza;
        while(p.next!=null){
            s.push(Integer.toString(p.elObjeto));
            p=p.next;
        }
        while(!s.EstaVacia())
            System.out.print(s.Pop());
    }
    public void Ordenar(Lista a, Lista b){
        Nodo p = a.laCabeza;
        Nodo q = b.laCabeza;
        Lista x = new Lista();
        while(p.next !=null || q.next!=null){
            if(p!=null){
                x.Insertar(p.elObjeto);
            }
            if(q!=null){
                x.Insertar(q.elObjeto);
            }
            p=p.next;
            q=q.next;
        }
    }
    public void Ordenar(Lista l){
        
    }

    // Clase Nodo
    private class Nodo {
        public int elObjeto;
        public Nodo next; // puntero al siguiente
    
        public Nodo(int nuevoObjeto, Nodo next){
            this.elObjeto=nuevoObjeto;
            this.next = next;
        }
    }
}
