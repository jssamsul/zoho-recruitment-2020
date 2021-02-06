/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author Samsul
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        for (int i = 1; i <= n; i++) {
            for (int j = m; j > m-i; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= m-i; j++) {
                System.out.print(n-i+1);
            }
            System.out.println("");
        }
    }
    
}
