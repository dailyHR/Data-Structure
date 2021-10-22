import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bubbble_sort {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		while(N>0) {
			for(int i = 0 ; i < N -1 ; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
			
			N--;
		}
		
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
