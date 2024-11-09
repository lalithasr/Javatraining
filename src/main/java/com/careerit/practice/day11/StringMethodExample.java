package com.careerit.practice.day11;
import java.util.*;


import java.util.ArrayList;
import java.util.List;

public class StringMethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String str = sc.next();
        List<String> productCodes = getProductCodes();
        System.out.println("Product codes before deleting the empty product codes :"+productCodes);
        for(String productCode : productCodes) {
            if(productCode == null || productCode.trim().isEmpty() || productCode.isBlank() ) {
                continue;
            }
            System.out.print(productCode + ", ");
            productCodes = new ArrayList<>(productCodes);
        }

        System.out.println("\nProduct codes after deleting the empty product codes :"+productCodes);
        System.out.println("Checking for palindrome :"+isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());

    }

    public static List<String> getProductCodes() {
        List<String> productCodes = new ArrayList<>();
        productCodes.add("P101");
        productCodes.add("P102");
        productCodes.add("P103");
        productCodes.add("P104");
        productCodes.add("P105");
        productCodes.add("P106");
        productCodes.add("P107");
        productCodes.add("P108");
        productCodes.add("P109");
        productCodes.add("P110");
        productCodes.add(" ");
        productCodes.add("");
        return productCodes;
    }
}
