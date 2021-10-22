import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class selection_sort {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0 ; i < N ; i++) {
			int min = array[i];
			int index = i ;
			for(int j = i; j < N; j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			
			int temp = array[i];
			array[i] = min;
			array[index] = temp;
			
		}
		
		for(int i = 0 ; i < N ; i ++) {
			System.out.println(array[i]);
		}

	}

}
