package inclassAssignment;

import java.util.*;

public class InclassAssignment {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		
		int num = 1000;
		for(int i=0; i< 1000;i++){
			al.add(100);
			ll.add(100);
		}
		insertion(al);
		insertion(ll);
		
		searching(al);
		searching(ll);
		
		deletion(al);
		deletion(ll);
	}

	public static void insertion(List<Integer> list){
		long before = System.currentTimeMillis();
		for (int i = 100; i< 500; i++){
		list.add(i,900);
		}
		long after = System.currentTimeMillis();
		long difference = after-before;
		System.out.println(list.getClass().getSimpleName()+" insertion time " + difference + " ms");
		
	}
	
	public static void searching(List<Integer> list){
		long before = System.currentTimeMillis();
		for (int i = 100; i< 500; i++){
		list.get(i);
		}
		long after = System.currentTimeMillis();
		long difference = after-before;
		System.out.println(list.getClass().getSimpleName()+" searching time " + difference + " ms");
		
	}
	
	public static void deletion(List<Integer> list){
		long before = System.currentTimeMillis();
		for (int i = 100; i< 500; i++){
		list.remove(i);
		}
		long after = System.currentTimeMillis();
		long difference = after-before;
		System.out.println(list.getClass().getSimpleName()+" deletion time " + difference + " ms");
		
	}
}
