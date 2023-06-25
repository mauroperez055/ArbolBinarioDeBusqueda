

 class Main {
    
    public static void main(String[] args) {
      System.out.println("Arbol Binario de Búsqueda de Enteros\n");
  
      ArbolBinarioBusqueda arbolBinarioBusqueda = new ArbolBinarioBusqueda();
      
      try {
  
        arbolBinarioBusqueda.insertar(10);
        arbolBinarioBusqueda.insertar(15);
        arbolBinarioBusqueda.insertar(7);
        arbolBinarioBusqueda.insertar(3);
        arbolBinarioBusqueda.insertar(9);
        arbolBinarioBusqueda.insertar(1);

        System.out.println("\nRecorrido Pre Orden");
        ArbolBinario.preOrden(arbolBinarioBusqueda.getRaiz());
        System.out.println("\nRecorrido In Orden");
        ArbolBinario.inOrden(arbolBinarioBusqueda.getRaiz());
        System.out.println("\nRecorrido Post Orden");
        ArbolBinario.postOrden(arbolBinarioBusqueda.getRaiz());

        arbolBinarioBusqueda.buscar(15);
        arbolBinarioBusqueda.eliminar(null, 15);
  
        System.out.println("\nRecorrido Pre Orden");
        ArbolBinario.preOrden(arbolBinarioBusqueda.getRaiz());
        System.out.println("\nRecorrido In Orden");
        ArbolBinario.inOrden(arbolBinarioBusqueda.getRaiz());
        System.out.println("\nRecorrido Post Orden");
        ArbolBinario.postOrden(arbolBinarioBusqueda.getRaiz());
  
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
  
    }
  }
