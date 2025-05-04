import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        String[] token1 = {"(", "x + y", ")", " * 5"};
        Delimiters d = new Delimiters("(", ")");

        System.out.println(d.getDelimitersList(token1));

        String[] token2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        d = new Delimiters("<q>", "</q>");

        System.out.println(d.getDelimitersList(token2));

        System.out.println();
        System.out.println();

        String open = "<sup>";
        String close = "</sup>";

        d = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims1 = {open, open, close, open, close, close};
        for(String s : delims1) delimiters.add(s);

        System.out.println(d.isBalanced(delimiters));
        delimiters.clear();

        String[] delims2 = {open, close, close, open};
        for(String s : delims2) delimiters.add(s);

        System.out.println(d.isBalanced(delimiters));
        delimiters.clear();

        String[] delims3 = {close};
        for(String s : delims3) delimiters.add(s);

        System.out.println(d.isBalanced(delimiters));
        delimiters.clear();

        String[] delims4 = {open, open, close};
        for(String s : delims4) delimiters.add(s);

        System.out.println(d.isBalanced(delimiters));
    }
}