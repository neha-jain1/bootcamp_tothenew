// Q6 Print the elements of an array in the decreasing frequency
// if 2 numbers have same frequency then print the one which came first.
import java.util.*;
public  class Q6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many numbers you wish to enter ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0; i< n;i++){
            System.out.println("Enter a number");
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> m= new LinkedHashMap<Integer,Integer>();
        for(Integer i: arr){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<Map.Entry<Integer, Integer>>(m.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("The sorted order of numbers with decreasing count is "+ l.toString());

    }
}