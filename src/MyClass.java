import java.util.*;
public class MyClass {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEdges = scanner.nextInt(); // number of edges
        boolean foundInExistingComponents = false;
        ArrayList<HashSet<Integer>> components = new ArrayList<HashSet<Integer>>();
        for (int j = 0; j < numberOfEdges; j++) {
            foundInExistingComponents = false;
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            for (int i = 0; i < components.size(); i++)
                if (components.get(i).contains(left) || components.get(i).contains(right)) {
                    components.get(i).add(left);
                    components.get(i).add(right);
                    foundInExistingComponents = true;
                    break;
                }

            if (!foundInExistingComponents) {
                HashSet<Integer> component = new HashSet<Integer>();
                component.add(left);
                component.add(right);
                components.add(component);
            }
        }

        System.out.println(components.size());
    }
}