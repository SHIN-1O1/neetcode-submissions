class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < encoded.length()) {

            // Find the '#'
            int j = i;

            while (encoded.charAt(j) != '#') {
                j++;
            }

            // Get the length
            int length = Integer.parseInt(encoded.substring(i, j));

            // Move past '#'
            i = j + 1;

            // Extract exactly 'length' characters
            String str = encoded.substring(i, i + length);

            result.add(str);

            // Move to the beginning of the next encoded string
            i = i + length;
        }

        return result;
    }
}