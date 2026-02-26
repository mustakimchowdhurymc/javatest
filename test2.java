public static void main(String[] args) {
// removing duplicate letter from string

    String  duplicateString = "Progammming";

    String  nonDuplicateString = "";

    for (int i = 0; i <= duplicateString.length()-1; i++) {

        boolean duplicate = false;

        for (int j = i+1; j<=duplicateString.length()-1; j++){
            if ( duplicateString.charAt(i) == duplicateString.charAt(j)){
                
                duplicate = true;
                break;
            }

      

        }
             if (!duplicate) {

            nonDuplicateString += duplicateString.charAt(i);

           }
 }

 System.out.println(nonDuplicateString);

}
