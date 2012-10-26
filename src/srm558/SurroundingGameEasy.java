/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srm558;

/**
 *
 * @author MrKnyaz
 */
public class SurroundingGameEasy {

    public static int score(String[] cost, String[] benefit, String[] stone) {
        int totalCost = 0;
        int totalBenefit = 0;
        for (int i = 0; i < stone.length; i++) {
            for (int j=0; j<stone[i].length(); j++) {
                if (stone[i].charAt(j) == 'o') {
                    //System.out.println((int)(cost[i].charAt(j)-'0'));
                    totalCost += (cost[i].charAt(j)-'0');
                    totalBenefit += (benefit[i].charAt(j)-'0');
                }
                if (stone[i].charAt(j) == '.') {
                    if ((j-1<0 || stone[i].charAt(j-1)=='o')&&(j+1>stone[i].length()-1 || stone[i].charAt(j+1)=='o')&&(i-1<0 || stone[i-1].charAt(j)=='o')&&(i+1>stone.length-1 || stone[i+1].charAt(j)=='o')) {
                        totalBenefit += (benefit[i].charAt(j)-'0');
                    }
                }
                
            }
        }
        System.out.println(totalCost);
        System.out.println(totalBenefit);
        return totalBenefit - totalCost;
    }
}
