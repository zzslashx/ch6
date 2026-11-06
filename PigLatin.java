final static String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
final static String punctuation = ".,?\"\';:!";
 
public static String sentenceToPigLatin(String sentence) {
  String translation = "";
 
  //process the words of the sentence one at a time
  while (sentence.indexOf(" ") >= 0) {
    String word = sentence.substring(0, sentence.indexOf(" "));
    translation += wordToPigLatin(word) + " ";
    sentence = sentence.substring(sentence.indexOf(" ") + 1);
  }
 
  //process the last word
  translation += wordToPigLatin(sentence);
 
  return translation;
}
 
public static String wordToPigLatin(String word) {
  if (word.length() <= 2) {
    return word;
  }
 
  String front = word.substring(0, 1);
  String end = word.substring(1);
  String mark = "";
  String last = end.substring(end.length() - 1);
 
  //retain a piece of punctuation at the end of this word
  if (punctuation.contains(last)) {
    mark = last;
    end = end.substring(0, end.length() - 1);
  }
 
  //conserve the capital letter at the start.
  if (capitals.contains(front)) {
    front = front.toLowerCase();
    end = end.substring(0, 1).toUpperCase() + end.substring(1);
  }
 
  //reconstruct as Pig Latin
  return end + front + "ay" + mark;
}
