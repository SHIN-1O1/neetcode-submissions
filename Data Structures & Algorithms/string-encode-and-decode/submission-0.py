class Solution:

    def encode(self, strs):
        encoded = ""

        for s in strs:
            encoded += str(len(s)) + "#" + s

        return encoded

    def decode(self, encoded):
        result = []
        i = 0

        while i < len(encoded):

            # Find the '#'
            j = i
            while encoded[j] != '#':
                j += 1

            # Get the length
            length = int(encoded[i:j])

            # Move past '#'
            i = j + 1

            # Get the actual string
            s = encoded[i:i + length]

            result.append(s)

            # Move to the next encoded string
            i += length

        return result