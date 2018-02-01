package com.itacademy.level1.task29;

import java.util.HashMap;
import java.util.Map;

public class Task29 {

	public static void main(String[] args) {
		String str = "Holding on to what we had can be so complicated\r\n" + 
				"Could be time to move along and face it, no more debating\r\n" + 
				"Watch the river 222 running dry\r\n" + 
				"Now it’s time to say goodbye\r\n" + 
				"\r\n" + 
				"There's an echo 222 in my head\r\n" + 
				"There's a story still unread\r\n" + 
				"And I need you here tonight\r\n" + 
				"\r\n" + 
				"Walk away, don’t turn around\r\n" + 
				"I will never let you down\r\n" + 
				"I won’t let you see me cry\r\n" + 
				"\r\n" + 
				"There's an echo in my head\r\n" + 
				"There's a crossroad up ahead\r\n" + 
				"How I want you here\r\n" + 
				"Forever and ever and ever and ever\r\n" + 
				"I'm not giving up\r\n" + 
				"\r\n" + 
				"This is love\r\n" + 
				"Rain falls from above\r\n" + 
				"Can you feel the love?\r\n" + 
				"Everywhere this is love\r\n" + 
				"\r\n" + 
				"This is love\r\n" + 
				"\r\n" + 
				"Holding on to what we had can be so self-destroying\r\n" + 
				"Remember how we laughed and played around till night met the morning?\r\n" + 
				"Watch the sun set in the sky\r\n" + 
				"There will never be goodbye\r\n" + 
				"\r\n" + 
				"There's an echo in my head\r\n" + 
				"There's a story still unread\r\n" + 
				"And I need you here tonight\r\n" + 
				"\r\n" + 
				"Walk away, don’t turn around\r\n" + 
				"I will never let you down\r\n" + 
				"How I want you here\r\n" + 
				"Forever and ever and ever and ever\r\n" + 
				"I'm not giving up\r\n" + 
				"\r\n" + 
				"This is love\r\n" + 
				"Rain falls from above\r\n" + 
				"Can you feel the love?\r\n" + 
				"Everywhere this is love\r\n" + 
				"\r\n" + 
				"This is love\r\n" + 
				"Rain falls from above\r\n" + 
				"Can you feel the love?\r\n" + 
				"This is love";
		
		String[] words = str.trim().toLowerCase().split("(\\W|\\d)+");
		
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		
		for (String string : words) {
			if (dictionary.containsKey(string)) {
				dictionary.replace(string, dictionary.get(string) + 1);
			} else {
				dictionary.put(string, 1);
			}
		}
		System.out.println(dictionary);
	}

}
