package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
//        nf.find(new int[] {4, 3, 2, 1});
//        nf.find(new int[] {1, 2, 3, 4});
//        nf.find(new int[] {1, 2, 3, 1});
//        nf.find(new int[] {1, 1});
//        nf.find(new int[] {});
        nf.find(null);

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
