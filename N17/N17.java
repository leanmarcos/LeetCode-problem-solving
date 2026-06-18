package N17;

public class N17 {
    public List<String> letterCombinations(String digits) {

        // Crear result, tempResult (""), map, posInicial = 0
        List<String> result = new ArrayList<String>();
        String tempResult = "";
        HashMap<Character, String> map = new HashMap<>();
        int posInicial = 0;

        // Llenar el map
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        // llamar al privado
        letterCombinations(digits, posInicial, result, tempResult, map);

        // retornar resultado
        return result;
    }

    private void letterCombinations(
            String digits,
            int pos,
            List<String> result,
            String tempResult,
            HashMap<Character, String> map) {

        // 1. Es el último, por lo tanto, hay que agregarlo a la lista
        if (digits.length() == pos) {
            result.add(tempResult);
            return;
        }

        // 2. Obtener letras del dígito actual
        String lettersByNumber = map.get(digits.charAt(pos));

        // 3. For sobre cada char de ese String (.toCharArray())
        for (int i = 0; i < lettersByNumber.length(); i++) {
            char letter = lettersByNumber.charAt(i);
            letterCombinations(digits, pos+1, result, tempResult + letter, map);
        }


    }
}
