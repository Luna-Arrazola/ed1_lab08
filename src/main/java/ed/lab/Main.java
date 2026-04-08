package ed.lab;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- PRUEBA DEL EJERCICIO 1 ---");

        TreeNode<Integer> root = new TreeNode<>(3);
        root.left = new TreeNode<>(1);
        root.right = new TreeNode<>(4);
        root.left.right = new TreeNode<>(2);

        E01KthSmallest e1 = new E01KthSmallest();

        int resultado = e1.kthSmallest(root, 3);

        System.out.println("Resultado k=3: " + resultado);
        System.out.println();


        System.out.println("--- ANÁLISIS DEL EJERCICIO 1 ---\n");

        System.out.println("1. Complejidad de tiempo:");
        System.out.println("La solucion utiliza un recorrido in-order del arbol binario de busqueda.");
        System.out.println("Este recorrido visita los nodos en orden ascendente, por lo que el k-esimo nodo visitado");
        System.out.println("corresponde al k-esimo elemento mas pequeno.\n");

        System.out.println("Mejor caso: O(h)");
        System.out.println("Ocurre cuando el elemento se encuentra rapidamente, por ejemplo si k es pequeno.");
        System.out.println("Si el arbol esta balanceado, la altura h es O(log n).\n");

        System.out.println("Peor caso: O(n)");
        System.out.println("Sucede cuando es necesario recorrer casi todos los nodos o el arbol esta desbalanceado.\n");

        System.out.println("Caso promedio: O(h + k)");
        System.out.println("Depende de la altura del arbol y del valor de k.");
        System.out.println("En un arbol balanceado puede expresarse como O(log n + k).\n");

        System.out.println("La complejidad depende de la altura del arbol, del valor de k y de si el arbol esta balanceado o no.\n");


        System.out.println("2. Complejidad de espacio:");
        System.out.println("La solucion utiliza recursion, por lo que el espacio depende de la altura del arbol.\n");

        System.out.println("Mejor caso: O(log n)");
        System.out.println("Si el arbol esta balanceado.\n");

        System.out.println("Peor caso: O(n)");
        System.out.println("Si el arbol esta completamente desbalanceado.\n");

        System.out.println("Caso promedio: O(log n)");
        System.out.println("Si el arbol mantiene una forma relativamente balanceada.\n");

        System.out.println("La complejidad depende directamente de la altura del arbol.\n");


        System.out.println("3. Optimizacion si el arbol se modifica frecuentemente:");
        System.out.println("Una solucion eficiente es utilizar un arbol binario de busqueda aumentado,");
        System.out.println("en el cual cada nodo almacene el tamano de su subarbol.\n");

        System.out.println("Esto permite encontrar el k-esimo elemento mas pequeno sin recorrer todo el arbol.");
        System.out.println("Se compara k con el tamano del subarbol izquierdo para decidir hacia donde moverse.\n");

        System.out.println("Beneficios:");
        System.out.println("- Consultas mas rapidas del k-esimo elemento.");
        System.out.println("- No se requiere recorrer todo el arbol.\n");

        System.out.println("Complejidad:");
        System.out.println("- Tiempo de busqueda: O(h), y si el arbol esta balanceado O(log n).");
        System.out.println("- Espacio adicional: O(n), ya que cada nodo almacena informacion extra.");
        System.out.println("- Inserciones y eliminaciones: O(h), debido a la actualizacion de tamanos.\n");


        System.out.println("--- PRUEBA DEL EJERCICIO 2 ---");

        E02AVLTree<Integer> avl = new E02AVLTree<>(Integer::compare);

        avl.insert(5);
        avl.insert(3);
        avl.insert(1);

        System.out.println("Buscar 5: " + avl.search(5));
        System.out.println("Buscar 1: " + avl.search(1));
        System.out.println("Size: " + avl.size());
        System.out.println("Height: " + avl.height());

        avl.delete(3);

        System.out.println("Buscar 3 (eliminado): " + avl.search(3));
        System.out.println();


        System.out.println("--- ANÁLISIS DEL EJERCICIO 2 ---\n");

        System.out.println("1. Complejidad de tiempo y espacio de cada funcion:\n");

        System.out.println("insert(value):");
        System.out.println("Tiempo: O(log n), ya que el arbol AVL se mantiene balanceado.");
        System.out.println("Espacio: O(log n) por la recursion.\n");

        System.out.println("delete(value):");
        System.out.println("Tiempo: O(log n), incluye busqueda, eliminacion y rebalanceo.");
        System.out.println("Espacio: O(log n).\n");

        System.out.println("search(value):");
        System.out.println("Tiempo: O(log n), debido a la estructura ordenada del AVL.");
        System.out.println("Espacio: O(log n).\n");

        System.out.println("height():");
        System.out.println("Tiempo: O(1), la altura se almacena en la raiz.");
        System.out.println("Espacio: O(1).\n");

        System.out.println("size():");
        System.out.println("Tiempo: O(1), se mantiene en una variable.");
        System.out.println("Espacio: O(1).\n");


        System.out.println("2. Diferencias respecto a un arbol binario de busqueda comun:\n");

        System.out.println("En un BST comun, el arbol puede desbalancearse dependiendo del orden de insercion.");
        System.out.println("En el peor caso, su altura puede ser O(n), lo que hace que las operaciones sean O(n).\n");

        System.out.println("En cambio, un arbol AVL se mantiene balanceado mediante rotaciones.");
        System.out.println("Esto garantiza que su altura sea O(log n), por lo que las operaciones");
        System.out.println("de busqueda, insercion y eliminacion siempre tienen complejidad O(log n).\n");

        System.out.println("Ventajas del AVL:");
        System.out.println("- Mejor rendimiento garantizado en busquedas.");
        System.out.println("- Estructura balanceada.\n");

        System.out.println("Desventajas:");
        System.out.println("- Mayor complejidad de implementacion.");
        System.out.println("- Sobrecosto por rotaciones y actualizacion de alturas.");
    }
}

// Actualización de repositorio de GitHub