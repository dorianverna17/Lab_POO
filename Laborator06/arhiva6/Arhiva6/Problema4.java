import java.util.*;
import java.lang.*;
import java.io.*;

class Filterclass implements FileFilter {
	protected Vector<String> words;
	protected Vector<String> extension;

	public Filterclass(Vector<String> words, Vector<String> extension) {
		this.words = words;
		this.extension = extension;
	}

	public boolean accept(File file) {
		int i, j;
		// System.out.println(this.words.size());
		for (i = 0; i < this.extension.size(); i++) {
			//System.out.println(this.extension.get(i));
			if (file.getName().endsWith(this.extension.get(i))) {
				for (j = 0; j < this.words.size(); j++) {
					if (file.getName().contains(this.words.get(j))) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

public class Problema4 {
	public static void main(String args[]) throws IOException {
		try {
			RandomAccessFile file1 = new RandomAccessFile("words.in", "r");
			byte[] bytes1 = new byte[100];
			file1.read(bytes1);
			file1.close();
			// System.out.println(new String(bytes1));

			RandomAccessFile file2 = new RandomAccessFile("extension.in", "r");
			byte[] bytes2 = new byte[100];
			file2.read(bytes2);
			file2.close();
			// System.out.println(new String(bytes2));

			String words = new String(bytes1);
			String extension = new String(bytes2);

			Vector<String> vector_words = new Vector<String>();
			Vector<String> vector_extension = new Vector<String>();
			StringTokenizer st1 = new StringTokenizer(words);
			while (st1.hasMoreTokens()) {
         		vector_words.add(st1.nextToken());
     		}
     		StringTokenizer st2 = new StringTokenizer(extension);
			while (st2.hasMoreTokens()) {
         		vector_extension.add(st2.nextToken());
     		}

     		int i;
     		// for (i = 0; i < vector_extension.size(); i++)
     		// 	System.out.println(vector_extension.get(i));
     		Filterclass obj = new Filterclass(vector_words, vector_extension);
     		File directory = new File("director");
     		File[] files = directory.listFiles();
     		File[] files2;
     		// File f;
     		for (i = 0; i < files.length; i++) {
     			files2 = files[i].listFiles();
     			// for (File f : files2) {
     			// 	System.out.println(f.getName());
     			// }
     			// System.out.println();
     			// System.out.println(files[i]);
     			// System.out.println();
     			for (File f : files2) {
     			//	System.out.println(f.getName());
     				if (obj.accept(f))
     					System.out.println(f.getName());
     			}
     		}
     		// for (File f : files) {
     		// 	System.out.println(f.getName());
     		// }

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}