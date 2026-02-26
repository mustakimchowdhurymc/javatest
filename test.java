public static void main(String[] args) {

  System.out.println("Hello, World!ad");

 String name = "John Doe";

 String reversed = new StringBuilder(name).reverse().toString();

 System.out.println(reversed);


 String reversed2 =  "";

 for (int i = name.length() - 1; i >= 0; i--) {

   reversed2 += name.charAt(i);

 }

    
 System.out.println(reversed2);

// counting vowels and constonants

String word = "My name is Mustakim Hussain Chowdhury";

String word1 = word.toLowerCase();

int vowel = 0;

System.out.println("Then number of character is " + word.length());

System.out.println(word.charAt(5));

//for (int i =0 ; i<= word.length()-1 ; i++){

 // if (word.charAt(i) == "a" || word.charAt(i) == "e" || word.charAt(i) == "i" || word.charAt(i) == "o" || word.charat(i) == "u"){
 //   vowel =+1;
 // }

for (int i = 0 ; i<= word1.length()-1 ; i++){
if (word1.charAt(i) == 'a' || word1.charAt(i) == 'e' || word1.charAt(i) == 'i'|| word1.charAt(i) == 'o' || word1.charAt(i) == 'u'  ) {
    vowel++ ;
}else{
  vowel = vowel ;
}
}

int consonant = word1.length()- vowel;

 System.out.println("Vowel = " +vowel);

 System.out.println( "The numbers of consonant = " + consonant);

 // checking if word is palindrome

String  pword = "maddddaam";

String nword = "";

for(int i = pword.length()-1; i >=0 ;i--){

  nword += pword.charAt(i);
}

System.out.println(("nword is " + nword));

if (pword.equals(nword)){
  System.out.print("true")  ;
}else{
  System.err.println("false");
}
// Find first non repeating character

String repeatWord = "Articulater";

boolean found = false;

for( int i =0  ; i<= repeatWord.length()-1 ; i++){

  for( int j = i+1  ; j<= repeatWord.length()-1 ; j++){
    if ( repeatWord.charAt(i)== repeatWord.charAt(j)){
      System.out.println("The first repeat character is " +repeatWord.charAt(i));
      found = true;
      break;
    }
  }

  if(found) break;

}

}






