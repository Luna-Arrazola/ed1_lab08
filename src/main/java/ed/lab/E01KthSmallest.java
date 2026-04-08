package ed.lab;

public class E01KthSmallest {

    private int contador;
    private int resultado;
    private boolean encontrado;

    public int kthSmallest(TreeNode<Integer> root, int k) {
        contador = 0;
        resultado = 0;
        encontrado = false;
        inOrder(root, k);
        return resultado;
    }

    private void inOrder(TreeNode<Integer> node, int k) {
        if (node == null || encontrado) {
            return;
        }

        inOrder(node.left, k);

        if (encontrado) {
            return;
        }

        contador++;
        if (contador == k) {
            resultado = node.value;
            encontrado = true;
            return;
        }

        inOrder(node.right, k);
    }
}
