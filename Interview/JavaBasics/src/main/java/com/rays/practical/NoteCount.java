package com.rays.practical;

public class NoteCount {
public static void main(String[] args) {
	
	int[] notes = {500,200,100,50,20,10};
	
	int count = 0;
	
	int rupees = 1880;
	
	for (int i = 0; i < notes.length; i++) {
		
		count = rupees/notes[i];
		
		if(count > 0) {
			System.out.println(notes[i]+ "="+ count);
		}
		
		rupees = rupees%notes[i];
	}
}
}
