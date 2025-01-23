# Introduction

In modern software development, efficient project management and automation of build processes are crucial for maintaining productivity and consistency. Apache Maven is a powerful and widely used software project management tool that simplifies the build and management of Java-based applications. In this lab, Maven and its core functionalities were investigated.

# Video
[ommitted from README]

# Design - Methods
## Bitwise Logical OR Operation
The or function performs a bitwise logical OR operation between two binary variables (num1 and num2). The function first initializes two indices, ind1 and ind2, to the positions of the least significant bits (LSB) of num1 and num2 respectively. It then iterates through each bit of both numbers, applying the logical OR operation on corresponding bits. If one of the bits is 1, the result is 1; otherwise, the result is 0. If one of the numbers is shorter, the missing bits are assumed to be 0 (this is important as it simulates the behavior of sign extension of 0, where bits that go beyond the length of the number are treated as 0). After performing the OR operation on each pair of bits, the result is appended to a string, which eventually forms the binary result of the operation. The result is then wrapped in a Binary object and returned.
## Bitwise Logical AND Operation
The and function performs a bitwise logical AND operation between two binary variables (num1 and num2). Similar to the OR function, it initializes two indices (ind1 and ind2) for traversing the binary strings from the LSB. During each iteration, the corresponding bits from num1 and num2 are compared, and the result of the AND operation is calculated. If both bits are 1, the result is 1; otherwise, the result is 0. If a binary string is shorter, missing bits are considered to be 0, implementing sign extension of 0. The resulting bit for each pair is then appended to a string, which is eventually converted into a Binary object representing the result of the AND operation. This result is then returned to the caller.
## Binary Multiplication
The multiply function performs binary multiplication between two binary variables (num1 and num2). The function simulates the process of multiplying two binary numbers, much like the long multiplication method taught in arithmetic. It processes each bit of num1 starting from the LSB. For every 1-bit in num1, the function shifts num2 appropriately by appending zeros (to simulate the position shift in multiplication). The shifted binary value is then added to an accumulator, which holds the product of the multiplication. The addition is handled by the add function (not shown here), which sums the current result with the shifted value. The result of all these additions forms the final product of the two numbers, which is returned as a Binary object. The function ensures that any missing bits in the binary numbers are treated as zeros, maintaining consistency with sign extension of 0.
In all of these operations, the concept of sign extension of 0 is crucial for handling binary numbers of different lengths. When one number is shorter than the other, the shorter number is implicitly extended with zeros on the left side, ensuring that the operations behave consistently without introducing unwanted values. This ensures the correctness of bitwise operations, especially when dealing with binary representations that might not have the same number of bits.
# Design - Tests

## Testing the Bitwise Logical OR Operation
### Test: OR with Binary Numbers of Same Length (or1)
This test checks the behavior of the OR function when both binary numbers have the same length. It ensures that the OR operation correctly applies to corresponding bits of both numbers. In this case, binary1 ("1000") and binary2 ("1101") undergo the OR operation, resulting in the expected output of "1101". This confirms that the function handles the basic case without requiring sign extension.

### Test: OR with Binary Numbers of Different Length (or2)
This test is designed to verify how the OR function behaves when the binary numbers have different lengths. The binary numbers binary1 ("110101") and binary2 ("1101") are given. The OR function should automatically extend the shorter binary number (in this case, binary2) with zeros on the left side to match the length of the longer binary number, implementing sign extension of 0. The expected result is "111101", which validates that the shorter binary number has been correctly extended with zeros.

### Test: OR with Both Binary Numbers as 0 (or3)
This test ensures that the OR operation behaves as expected when both input numbers are zero. The expected result is "0", as the OR operation of two 0s should produce 0. This confirms that the function handles edge cases properly.


## Testing the Bitwise Logical AND Operation
### Test: AND with Binary Numbers of Same Length (and1)
This test checks the AND operation when both binary numbers are of the same length. The binary numbers binary1 ("1000") and binary2 ("1101") are provided. Since the AND operation results in 1 only when both corresponding bits are 1, the expected result here is "1000", which ensures the AND operation is working correctly on numbers of equal length.

### Test: AND with Binary Numbers of Different Length (and2)
This test evaluates the behavior of the AND function when the binary numbers differ in length. The binary numbers binary1 ("110101") and binary2 ("1101") are used. Similar to the OR function, the shorter number (binary2) should be sign-extended with zeros to match the length of binary1. The result of the AND operation is expected to be "101", confirming that the function handles sign extension of 0 correctly and computes the AND operation accurately.

### Test: AND with Both Binary Numbers as 0 (and3)
This test verifies that the AND operation correctly handles the case when both binary numbers are 0. As with the OR test, the result should be "0", which confirms that the function works correctly when no 1 bits are present in either input.


## Testing the Binary Multiplication Function
### Test: Multiply with Binary Numbers of Same Length (multiply1)
This test checks the multiply function when both binary numbers are of equal length. Here, binary1 ("1000") and binary2 ("1101") are multiplied, and the expected result is "1101000", which corresponds to the multiplication of 8 and 13 (104). This validates that the function computes multiplication correctly for numbers of the same length.

### Test: Multiply with Binary Numbers of Different Length (multiply2)
This test evaluates the multiplication of binary numbers with different lengths. The binary numbers binary1 ("110101") and binary2 ("1101") are multiplied, with the result expected to be "1010110001", corresponding to the multiplication of 53 and 13 (689). The test confirms that the multiplication function works properly when the numbers differ in size and correctly handles sign extension of 0.

### Test: Multiply with Both Binary Numbers as 0 (multiply3)
This test checks how the multiply function handles the case where both binary numbers are 0. The result of multiplying two 0s should be "0", ensuring the function behaves correctly for edge cases and produces the correct output when both inputs are zero.
