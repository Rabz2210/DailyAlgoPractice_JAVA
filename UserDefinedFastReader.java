import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class UserDefinedFastReader {
    static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	}
	
	static class Print
	{
	    private final BufferedWriter bw;
	    public Print()
	    {
	        this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    }
	    public void print(Object object)throws IOException
	    {
	        bw.append(""+object);
	    }
	    public void println(Object object)throws IOException
	    {
	        print(object);
	        bw.append("\n");
	    }
	    public void close()throws IOException
	    {
	        bw.close();
	    }
    }
    public static void main(String[] args) throws IOException {
        { 
            FastReader s=new FastReader();
            Print p = new Print();
            
            int n = s.nextInt();
            String name = s.next();
            p.print("Integer "+n);
            p.println("name "+name);
            p.close();
            
        }
    }
}