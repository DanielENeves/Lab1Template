package pt.pa;

import pt.pa.adts.Position;
import pt.pa.adts.TreeLinked;

/**
 *
 * @author amfs
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeLinked<String> myTree = new TreeLinked<>("Ecosystem");
        Position<String> root = myTree.root();

        //Insert dos Filhos do EcoSystem
        Position<String> posAnchovy = myTree.insert(root, "Anchovy");
        Position<String> posTuna = myTree.insert(root, "Tuna");
        Position<String> posShark = myTree.insert(root, "Shark");
        Position<String> posEagles = myTree.insert(root, "Eagles");

        //Insert dos filhos do Tuna
        myTree.insert(posTuna, "Mackerel");
        Position<String> posBarracuda = myTree.insert(posTuna, "Barracuda");
        myTree.insert(posBarracuda, "Sardine");
        //Insert dos filhos do Shark
        myTree.insert(posShark, "Dolphin");

        //Insert dos filhos do Eagles
        myTree.insert(posEagles, "Snakes");
        myTree.insert(posEagles, "Rabbits");

        //Método toString()
        System.out.println("TREE" + myTree);
        String showTree = myTree.toString();
        System.out.println(showTree);
    }


}
