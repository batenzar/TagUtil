package io.github.batenzar;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

	private static String regx = "\\#\\S+";
	private static Pattern pattern = Pattern.compile(regx);

	public static int countTag(String str) {
		Matcher matcher = pattern.matcher(str);
		
		int count = 0;
        while(matcher.find()) {
            count++;
        }
		return count;
	}
	
	public static List<String> getTags(String str) {
		Matcher matcher = pattern.matcher(str);
		
		List<String> result = new ArrayList<>();
        while(matcher.find()) {
        	String group = matcher.group();
        	result.add(group);
        }
		return result;
	}
}
