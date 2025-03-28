This was kind of a tricky question, you have to be able to understand
bitwise operations and how the XOR operation is similar to multipication

Assume I have this input
nums1 = [a, b, c]
nums2 = [x, y]

Pairing everything and taking the XOR looks as follows
[a^x, a^y,  b^x, b^y,  c^x, c^y]

Once you have the above, you then take the XOR of each of the elements
in that new list

(a^x) ^ (a^y) ^ (b^x) ^ (b^y) ^ (c^x) ^ (c^y)

And like multipication, we can move around our numbers we are XOR'ing

(a ^ b ^ c) ^ (a ^ b ^ c)   ^   (x ^ y) ^ (x ^ y) ^ (x ^ y)

So if you have xor1 = (a ^ b ^ c) and xor2 = (x ^ y) you can use the below
XOR properties along with the length of nums1 and nums2 to get the answer

SAME VALUE ALWAYS RETURNS 0
1 ^ 1 = 0

ANYTHING XOR'ed WITH A 0 IS THAT VALUE (equivalent to multipling by 1)
1 ^ 0 = 1
12 ^ 0 = 12
x ^ 0 = x