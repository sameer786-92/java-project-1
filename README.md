# java-project-1

This Java program is designed to extract the username and domain from an email address and then check if the domain is equal to "gmail.com". Here's a step-by-step explanation of the program:

1. `public static void main(String[] args) {`: This is the main method where the program execution starts.

2. `String str = "mohammadsameer@gmail.com";`: A sample email address is assigned to the variable `str`.

3. `int ch = str.indexOf("@");`: The `indexOf()` method is used to find the index of the "@" symbol in the email address. This index is stored in the variable `ch`.

4. `String uname = str.substring(0, ch);`: The `substring()` method is used to extract the substring from the beginning of the email address (index 0) up to, but not including, the "@" symbol (index `ch`). This substring represents the username and is stored in the variable `uname`.

5. `String domain = str.substring(ch + 1, str.length());`: Another `substring()` method is used to extract the substring from the index after the "@" symbol (index `ch + 1`) to the end of the email address. This substring represents the domain and is stored in the variable `domain`.

6. `System.out.println("Username is: " + uname);`: This line prints out the extracted username.

7. `System.out.println("Domain is: " + domain);`: This line prints out the extracted domain.

8. `int j = domain.indexOf(".");`: The `indexOf()` method is used again to find the index of the first dot (".") within the extracted domain. The index is stored in the variable `j`.

9. `String name = domain.substring(0, j);`: Another `substring()` method is used to extract the substring from the beginning of the domain up to, but not including, the first dot (index `j`). This substring is stored in the variable `name`.

10. `System.out.println(name.equals("gmail.com"));`: This line checks if the extracted substring (domain name) is equal to the string "gmail.com". It uses the `equals()` method to perform the comparison and prints out the result, which will be either `true` or `false`.
