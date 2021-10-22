import java.io.BufferedReader;
import java.io.InputStreamReader;

public class insertion_sort {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i < N; i++) {
			for(int j = i; j > 0 ; j--) {
				if(array[j-1] > array[j]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}	
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			System.out.println(array[i]);
		}
	}

}
