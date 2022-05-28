import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	
	public static void main(String[] args) {


//Strings are immutable and cannot be changed

StringBuilder sb = new StringBuilder(); {
for (int i = 0; i < 10; i++) {
	sb.append(i); 
	if (i != 9 ) {
	sb.append("-"); 	
	} 
		
	}
System.out.println(sb.toString());
}
List<String> strings = new ArrayList<String>();
strings.add("Tom"); 
strings.add("Sammy"); 
strings.add("Paul"); 
strings.add("I"); 
strings.add("Me"); 


System.out.println(findShortestString(strings));

Set<String> months = new HashSet<String>(); 
months.add("May"); 
months.add("June"); 
months.add("July"); 
months.add("February"); 
months.add("October"); 
System.out.println(months);

List<String> swapped = switchFirstAndLast(strings); 
for (String string : swapped) {
	System.out.println(string);
}

System.out.println(combineStrings(swapped));

List<String> searchResults = search(strings, "a"); 
for (String result : searchResults) {
	System.out.println(result);
}
Set<Integer> integerSet = new HashSet<Integer>(); 
integerSet.add(3); 
integerSet.add(24); 
integerSet.add(13); 
integerSet.add(12); 

Set<Integer> evenNumbers = returnEvenNumbers(integerSet); 
for (Integer number : evenNumbers) {
	System.out.println(number);
}
System.out.println("Even Numbers Above, Map of String Below");

Map<String, String> dictionary = new HashMap<String, String>(); 
dictionary.put("Hola", "Hello"); 
dictionary.put("Adios", "Goodbye"); 
dictionary.put("rojo", "red"); 

String value = lookupDefinition(dictionary, "Hola"); 
System.out.println(value);

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 35, 30); 
List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);

for(List<Integer> list : sortedNumbers) {
	for(Integer number : list) {
		System.out.println(number);
	}
		System.out.println("Next list - - - -- - ");
}
List<Integer> stringsLengths = calculateStringLengths(strings); 
for (Integer i : stringsLengths) {
	System.out.println(i);
}

Set<String> startsWithJ = findFirstLetter(months, 'J'); 
for (String word : startsWithJ) {
	System.out.println(word);
}
List<String> resultList = convertSetToList(months); 

for (String listString : resultList) {
	System.out.println(listString);
}
Map<Character, Integer> counts = countStringsByFirstLetter(resultList); 
for(Character character : counts.keySet()) {
	System.out.println(character + " - " + counts.get(character));
}

	}
public static Map<Character, Integer> countStringsByFirstLetter(List<String> list){
	Map<Character, Integer> results = new HashMap<Character, Integer>(); 

	for(String string : list) {
		char c = string.charAt(0); 
		if (results.get(c) == null) {
			results.put(c,  1); 
		} else {
			results.put(c,  results.get(c) + 1); 
		}
	}
	
	return results; 
}
	
public static Set<Integer> returnEvenNumbers(Set<Integer> set) {
	Set<Integer> results = new HashSet<Integer>(); 
	for (Integer number : set) {
		if (number % 2 == 0) { 
			results.add(number); 
		}
	} return results; 
}
public static String lookupDefinition(Map<String, String> map, String string) {
	for (String key : map.keySet()) {
		if (key.equals(string)) {
			return map.get(key); 
		}
	}
	return ""; 
}

public static Set<String> findFirstLetter(Set<String> set, char c){
	Set<String> results = new HashSet<String>(); 
	for (String string : set) {
		if (string.charAt(0) == c) {
			results.add(string); 
		}
	}
	
	return results; 
}
public static List<String> convertSetToList(Set<String> set) {
	List<String> results = new ArrayList<String>(); 
	
	for (String string : set) {
		results.add(string); 
	}
	return results; 
}

public static List<Integer> calculateStringLengths(List<String> list){
	List<Integer> lengths = new ArrayList<Integer>(); 
	for (String string : list) {
		lengths.add(string.length()); 
	}
	return lengths; 
}
	
public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list){
List<List<Integer>> results = new ArrayList<List<Integer>>();
results.add(new ArrayList<Integer>()); 
results.add(new ArrayList<Integer>()); 
results.add(new ArrayList<Integer>()); 
results.add(new ArrayList<Integer>()); 

for (Integer number : list) {
	if(number % 2 == 0) {
		results.get(0).add(number); 
	}
	if(number % 3 == 0) {
		results.get(1).add(number); 
	}
	if(number % 5 == 0 ) {
		results.get(2).add(number); 
	}
	if(number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
		results.get(3).add(number); 
	}
}
return results; 
}
	
	
public static List<String> search(List<String> list, String query){
List<String> results = new ArrayList<String>(); 
for(String string : list ) {
	if (string.contains(query)) {
		results.add(string); 
	}
}
return results; 
}

public static String combineStrings(List<String> strings) {
	StringBuilder result = new StringBuilder(); 
	for (String string : strings) {
		result.append(string + ", "); 
	}
	return result.toString(); 
}
	
public static String findShortestString(List<String> list) {
	String shortest = list.get(0); 
	for (String string : list) {
		if (string.length() < shortest.length()) {
			shortest = string; 
		}
	}
 return shortest; 
}

public static List<String> switchFirstAndLast(List<String> list ) {
String temp = list.get(0); 
list.set(0, list.get(list.size() - 1)); 
list.set(list.size() - 1, temp);
return list; 
}
}
