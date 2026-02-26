public static void main(String[] args) {
// count vowel, consonant, digit, spaces from a sentence

String sentence = "today is februara twenty fifth of 20262423424";

int vowel = 0;
int consonant = 0;
int digit = 0;
int spaces = 0;

for (int i = 0 ; i <= sentence.length()-1; i++){

    if (sentence.charAt(i) ==  ' '){
        spaces +=1;
    }else if (sentence.charAt(i) == '1' ||sentence.charAt(i) == '2' 
    ||sentence.charAt(i) == '3' ||sentence.charAt(i) == '4' ||sentence.charAt(i) == '5' 
    ||sentence.charAt(i) == '6' ||sentence.charAt(i) == '7' ||sentence.charAt(i) == '8' 
    ||sentence.charAt(i) == '9' ||sentence.charAt(i) == '0' ) {
        digit +=1;
        
    }else if (sentence.charAt(i) == 'a' ||sentence.charAt(i) == 'e' 
    ||sentence.charAt(i) == 'i' ||sentence.charAt(i) == 'o' 
    ||sentence.charAt(i) == 'u'){
        vowel +=1;

    }else {
        consonant +=1;
    }
    

}


System.out.println("there are "+ spaces+ " spaces , "+ vowel +" vowels , "+ digit +" digits, "+ consonant+ " consonant");

/// print only duplicate characters

String duplicateString = "tests will be conducted in classRoomr";

String lowercaseString = duplicateString.toLowerCase();

String onlyDuplicateChar = "";

for (int i= 0 ; i <= lowercaseString.length()-1 ; i++){

    for (int j = i+1 ; i<=lowercaseString.length()-1; j++ ){
        if (lowercaseString.charAt(i) == lowercaseString.charAt(j)){
            onlyDuplicateChar += lowercaseString.charAt(i);
        }
    }
}

System.out.println(onlyDuplicateChar);


}
