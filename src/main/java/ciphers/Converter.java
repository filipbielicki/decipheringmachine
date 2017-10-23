package ciphers;

public class Converter {

    public String decipher(String wordToDecipher, CIPHER cipherToUse) {

        String result = "";

        if(cipherToUse == CIPHER.GADERYPOLUKI){
            result = codeGaderypoluki(wordToDecipher).trim();
        }
        else if(cipherToUse == CIPHER.POLITYKARENU){
            result = codePolitykarenu(wordToDecipher).trim();
        }
        else if(cipherToUse == CIPHER.KONIECMATURY){
            result = codeKoniecmatury(wordToDecipher).trim();
        }
        return result;
    }

    private String codeGaderypoluki(String wordToDecipher){

        StringBuilder sb = new StringBuilder();

        String evenCase = wordToDecipher.toLowerCase();

        for(int i = 0; i < evenCase.length(); i++){
            if(evenCase.charAt(i) == 'g'){
                sb.append('a');
                continue;
            }
            else if(evenCase.charAt(i) == 'a'){
                sb.append('g');
                continue;
            }
            else if(evenCase.charAt(i) == 'd'){
                sb.append('e');
                continue;
            }
            else if(evenCase.charAt(i) == 'e'){
                sb.append('d');
                continue;
            }
            else if(evenCase.charAt(i) == 'r'){
                sb.append('y');
                continue;
            }
            else if(evenCase.charAt(i) == 'y'){
                sb.append('r');
                continue;
            }
            else if(evenCase.charAt(i) == 'p'){
                sb.append('o');
                continue;
            }
            else if(evenCase.charAt(i) == 'o'){
                sb.append('p');
                continue;
            }
            else if(evenCase.charAt(i) == 'l'){
                sb.append('u');
                continue;
            }
            else if(evenCase.charAt(i) == 'u'){
                sb.append('l');
                continue;
            }
            else if(evenCase.charAt(i) == 'k'){
                sb.append('i');
                continue;
            }
            else if(evenCase.charAt(i) == 'i'){
                sb.append('k');
                continue;
            }
            else if(evenCase.charAt(i) == ' '){
                sb.append(' ');
                continue;
            }
            else {
                sb.append(evenCase.charAt(i));
            }
        }
        return sb.toString().toUpperCase();
    }

    private String codePolitykarenu(String wordToDecipher){

        StringBuilder sb = new StringBuilder();

        String evenCase = wordToDecipher.toLowerCase();

        for(int i = 0; i < evenCase.length(); i++){
            if(evenCase.charAt(i) == 'p'){
                sb.append('o');
                continue;
            }
            else if(evenCase.charAt(i) == 'o'){
                sb.append('p');
                continue;
            }
            else if(evenCase.charAt(i) == 'l'){
                sb.append('i');
                continue;
            }
            else if(evenCase.charAt(i) == 'i'){
                sb.append('l');
                continue;
            }
            else if(evenCase.charAt(i) == 't'){
                sb.append('y');
                continue;
            }
            else if(evenCase.charAt(i) == 'y'){
                sb.append('t');
                continue;
            }
            else if(evenCase.charAt(i) == 'k'){
                sb.append('a');
                continue;
            }
            else if(evenCase.charAt(i) == 'a'){
                sb.append('k');
                continue;
            }
            else if(evenCase.charAt(i) == 'r'){
                sb.append('e');
                continue;
            }
            else if(evenCase.charAt(i) == 'e'){
                sb.append('r');
                continue;
            }
            else if(evenCase.charAt(i) == 'n'){
                sb.append('u');
                continue;
            }
            else if(evenCase.charAt(i) == 'u'){
                sb.append('n');
                continue;
            }
            else if(evenCase.charAt(i) == ' '){
                sb.append(' ');
                continue;
            }
            else {
                sb.append(evenCase.charAt(i));
            }
        }
        return sb.toString().toUpperCase();
    }

    private String codeKoniecmatury(String wordToDecipher){

        StringBuilder sb = new StringBuilder();

        String evenCase = wordToDecipher.toLowerCase();

        for(int i = 0; i < evenCase.length(); i++){
            if(evenCase.charAt(i) == 'k'){
                sb.append('o');
                continue;
            }
            else if(evenCase.charAt(i) == 'o'){
                sb.append('k');
                continue;
            }
            else if(evenCase.charAt(i) == 'n'){
                sb.append('i');
                continue;
            }
            else if(evenCase.charAt(i) == 'i'){
                sb.append('n');
                continue;
            }
            else if(evenCase.charAt(i) == 'e'){
                sb.append('c');
                continue;
            }
            else if(evenCase.charAt(i) == 'c'){
                sb.append('e');
                continue;
            }
            else if(evenCase.charAt(i) == 'm'){
                sb.append('a');
                continue;
            }
            else if(evenCase.charAt(i) == 'a'){
                sb.append('m');
                continue;
            }
            else if(evenCase.charAt(i) == 't'){
                sb.append('u');
                continue;
            }
            else if(evenCase.charAt(i) == 'u'){
                sb.append('t');
                continue;
            }
            else if(evenCase.charAt(i) == 'r'){
                sb.append('y');
                continue;
            }
            else if(evenCase.charAt(i) == 'y'){
                sb.append('r');
                continue;
            }
            else if(evenCase.charAt(i) == ' '){
                sb.append(' ');
                continue;
            }
            else {
                sb.append(evenCase.charAt(i));
            }
        }
        return sb.toString().toUpperCase();
    }
}
