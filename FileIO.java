import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
public class FileIO {
	public static void main(String[] args) {
		usingBufferedReader();
		System.out.println();
		usingScanner();
	}
	public static void usingScanner() {
		URL url = null;
		String line = null;
		Scanner scan = null;
		try {
			// open the file using an URL
			url = new URL("http://matcmp.ncc.edu/grahamf/csc130/Sudoku2.txt");
			scan = new Scanner(url.openStream());
			// read and output each line
			while (scan.hasNextLine()) {
				line = scan.nextLine();
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL:" + url);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error accessing file");
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}
	public static void usingBufferedReader() {
		URL url = null;
		String line = null;
		BufferedReader in = null;
		try {
			// open the file using an URL
			url = new URL("http://matcmp.ncc.edu/grahamf/csc130/Sudoku5.txt");
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			// read and output each line
			while ((line = in.readLine()) != null)
				System.out.println(line);
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL:" + url);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error accessing file");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}