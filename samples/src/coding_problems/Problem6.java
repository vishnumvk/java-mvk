package coding_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 6: Given an array of words and the length L, format the text such that each line has
exactly L number of characters and is fully (left and right) justified.
Write a program to print the list of strings that are allocated to each single line
matching the below conditions:
1 Pack as many words as you can in each line.
2 If needed, you can pad the extra spaces with ‘ ‘, so that each line has
exactly L characters.
3 Extra spaces between words should be distributed as evenly as possible.
4 If the number of spaces on a line do not divide evenly between words, the
empty slots on the left will be assigned more spaces than the slots on the
right.
5 For the last line of text, it should be left justified and no extra space is
inserted between words.

Input : ["This", "is", "an", "example", "of", "text", "justification."]
L: 16.
Output:
[
"This       is      an",
"example of text",
"justification.      "
]
 
 
 */


public class Problem6 {
	public static int getNextLineStart(String[]words,int linelen,int n) {
		int count=0;
		while (n < words.length && count < linelen) {
	        count += words[n++].length() + 1;
	    }
	    if (count > linelen+ 1)
	        n--;
	    return n;
	}
	public static String justifyString(String line, int maxWidth) {
	    StringBuilder justifiedLine = new StringBuilder();
	    String[] words = line.split(" ");
	    int Length = 0;
	    for (String word : words) {
	        Length += word.length();
	    }
	    int remainingSpace = maxWidth - Length;
	    int wordSeparation = words.length > 1 ? remainingSpace / (words.length - 1) : remainingSpace;
	    int extraSpace = remainingSpace -( (words.length - 1)*wordSeparation);
	    int leftslots = extraSpace;
	    for (int j = 0; j < words.length - 1; j++) {
	        justifiedLine.append(words[j]);
	        for (int i = 0; i < wordSeparation; i++)
	            justifiedLine.append(" ");
	        if (extraSpace > 0 && j==words.length-1-leftslots) {
	            justifiedLine.append(" ");
	            extraSpace--;
	        }
	    }
	    justifiedLine.append(words[words.length - 1]);
	    for (int i = 0; i < extraSpace; i++)
	        justifiedLine.append(" ");
	    return justifiedLine.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int linelen = sc.nextInt();
		sc.close();
		List<String> lines = new ArrayList<>();
		String [] words=str.split(" ");
		int start =0;
		int next = getNextLineStart(words,linelen,start);
		while(start<words.length) {		
		        StringBuilder line = new StringBuilder();
		        for (int i = start; i < next; i++) {
		            line.append(words[i] + " ");
		        }
		        start = next;
		        next = getNextLineStart(words,linelen,start);
		        lines.add(line.toString());
		    
		}
		for (int i = 0; i < lines.size() ; i++) {
	        String justifiedLine = justifyString(lines.get(i).trim(), linelen);
	        lines.remove(i);
	        lines.add(i, justifiedLine);
	        System.out.println(justifiedLine);
	    }

	}

}
