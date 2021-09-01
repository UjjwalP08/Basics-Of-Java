
/**
 * Precedence and Associativity
 * <p>
 * Simple meaning of precedence is Priority
 */

package com.company;

public class No_05_Assocativites {
    public static void main(String[] args) {
        int a = 9 * 4 - 50 / 5;
        /*
         *   here first
         *   36-50/5
         *   36-10
         *   26
         *  here fist multiplication evaluate then division evaluate because both precedence are same but as the associativity
         * first evaluate left side operator then evaluate right side operator
         *
         * here * is left side and / is right side
         * */

        System.out.println(a);
        int b = 50 / 5 - 9 * 4;
        /*
         * here first
         * 10-9*4
         * 10-36
         * 26
         *
         * here fist division evaluate then multiplication evaluate  because both precedence are same but as the associativity
         * first evaluate left side operator then evaluate right side operator
         * here first evaluate / then * is evaluate
         * */
        System.out.println(b);

// For more data visit this website
//        http://1.bp.blogspot.com/-_fTpjkg33vw/VJ1O92-DXnI/AAAAAAAADVE/KjYRpdFd5-I/s1600/Type%2BConversion%2C%2BPrecedence%2Band%2BAssociativity%2Bof%2BOperators%2Bin%2BC.gif
    }
}



