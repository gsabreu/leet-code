package br.com.abreu.leetcode.problems;

public class CountGreaterThanValueInBSTandList {

    //classe da arvore
    public static class ABB {
        int value;
        ABB right;
        ABB left;

        ABB(int x) { value = x; }
    }

    public static void main(String[] args) {
        int[] intArray = new int[] {3,2,5,1,4,1,4,3,5,6,1,34,6,3};
        System.out.println(countValuesInsideOfArrayGreaterThanNth(intArray, 5));
        ABB tree = createTree();

        System.out.println(countNodesGreaterThanNth(tree, 1));

    }

    //exercicio 3 - 1
    public static int countValuesInsideOfArrayGreaterThanNth(int[] intArray, int value){
        int count =0;

        int i = 0;
        int j = intArray.length -1;

        // enquanto i for menor que o numero de items dentro do array
        while (i < j) {
            // se index i (lendo do array pelo inicio) no array for maior que value, adiciona 1 ao contador
            if(intArray[i] > value){
                count +=1;
            }
            // se index j (lendo do array pelo final) no array for maior que value, adiciona 1 ao contador
            if(intArray[j] > value){
                count+=1;
            }
            i++;
            j--;
        }
        return count;
    }

    //exercicio 3 - 2

    //metodo recursivo onde irá ser chamado toda vez que o node tiver mais valores a esquerda e /ou direta.
    public static int countNodesGreaterThanNth(ABB node, int x){
        // se o node for igual a null retorna 0
        if (node == null) {
            return 0;
        }
        // chama o metodo novamente para verificar o node da esquerda e retorna o contador.
        int countLeft = countNodesGreaterThanNth(node.left, x);

        // chama o metodo novamente para verificar o node da direita e retorna o contador.
        int countRight = countNodesGreaterThanNth(node.right, x);

        // if ternário validando se o valor do node é maior que x, se sim retorna 1 se não retorna 0.
        // por fim soma o valor do if ternário com o valor do contador da esquerda e da direita.
        return (node.value > x ? 1 : 0) + countLeft + countRight;

    }

    // Criando uma arvore
    public static ABB createTree(){
        ABB root = new ABB(23);
        root.left = new ABB(3);
        root.right = new ABB(41);

        root.left.left = new ABB(16);
        root.right.right = new ABB(88);

        return root;
    }


}
