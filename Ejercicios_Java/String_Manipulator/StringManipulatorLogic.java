public class StringManipulatorLogic{
    public String trimAndConcat(String word1, String word2) {
        return word1.trim() + word2.trim();
    }

    public int getIndexOrNull(String word, char ch){
        return word.indexOf(ch);
    }

    public int getIndexOrNullString(String word, String subWord){
        return word.indexOf(subWord);
    }

    public String concatSubstring(String word1, int start, int end, String word2){
        String substring = word1.substring(start, end);
        return substring + word2;
    }
}