class Solution {
    public String solution(String s) {
        StringBuilder jadenCase = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                jadenCase.append(c);
            } else if (capitalizeNext) {
                jadenCase.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                jadenCase.append(Character.toLowerCase(c));
            }
        }

        return jadenCase.toString();
    }
}
