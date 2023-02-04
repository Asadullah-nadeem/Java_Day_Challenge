public class Day93 {
    Integer sum(Integer[] ints) {
        int result = 0;
        for (int i : ints) {
            result += i;
        }
        return result;
    }

    String sum(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        return result.toString();
    }
}

