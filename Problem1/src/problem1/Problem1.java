/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author cgallinaro
 */
public class Problem1 {

    /**
     * looping1
     * RUNTIME COMPLEXITY IS: O(n)
     * 
     * @param n
     */
    public void looping1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("hi");
        }
    }

    /**
     * looping2
     * RUNTIME COMPLEXITY IS: O(2n) = O(n)
     * 
     * @param n
     */
    public void looping2(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            System.out.println("hi");
        }
    }

    /**
     * looping3
     * RUNTIME COMPLEXITY IS: O(n^2)
     * 
     * @param n
     */
    public void looping3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("hi");
            }
        }
    }

    /**
     * looping4
     * RUNTIME COMPLEXITY IS: O((n^2 + n)/2) = O(n^2)
     * 
     * @param n
     */
    public void looping4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("hi");
            }
        }
    }

    /**
     * looping5
     * RUNTIME COMPLEXITY IS: O(n^2)
     * 
     * @param n
     */
    public void looping5(int n) {
        for (int i = 1; i <= n * n; i++) {
            System.out.println("hi");
        }
    }

    /**
     * looping6
     * RUNTIME COMPLEXITY IS: O(n^2 * n^3) = O(n^5)
     * 
     * @param n
     */
    public void looping6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                while (count < Math.pow(n, 3)) {
                    System.out.println("hi");
                    count++;
                }
            }
        }
    }

    /**
     * recursive1
     * RUNTIME COMPLEXITY IS: O(n)
     *
     * @param n
     * @return
     */
    public int recursive1(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return 1 + recursive1(n - 1);
        }
    }

    /**
     * recursive2
     * RUNTIME COMPLEXITY IS: O(n/5) = O(n)
     * 
     * @param n
     * @return
     */
    public int recursive2(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return 1 + recursive2(n - 5);
        }
    }

    /**
     * recursive3
     * RUNTIME COMPLEXITY IS: O(log n)
     * 
     * @param n
     * @return
     */
    public int recursive3(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return 1 + recursive3(n / 2);
        }
    }

    /**
     * recursive4
     * RUNTIME COMPLEXITY IS: O(2^n)
     * 
     * @param n
     * @param o
     */
    public void recursive4(int n, int o) {
        if (n <= 0) {
            System.out.printf("%d\n", o);
        } else {
            recursive4(n - 1, o);
            recursive4(n - 1, o + 1);
        }
    }

}
