// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.awt.*;
public class Main {
    public static final int COLOR_YELLOW=new Color(250,201,20).getRGB();
    public static final int COLOR_BLUE=new Color(17,13,99).getRGB();
    public static final int COLOR_RED=new Color(196,0,15).getRGB();
    public static final int COLOR_BLACK=new Color(5,5,5).getRGB();
    public static final int COLOR_WHITE=new Color(255,255,255).getRGB();
    public static final int COLOR_GREEN=new Color(35,138,51).getRGB();
    public static int [][] createCOLFlag(int height,int width){
        int[][] flag= new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        rowEnd=(int)(height*0.50);
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_YELLOW;
            }
        }
        rowIni=(int)(height*0.50);
        rowEnd=(int)(height*0.75);
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni=(int)(height*0.75);
        for(int row=rowIni;row< flag.length;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;
    }
    public static int [][] createVENFlag(int height,int width){
        int[][] flag= new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        rowEnd=(int)(height*0.3333)+1;
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_YELLOW;
            }
        }
        rowIni=(int)(height*0.3333)+1;
        rowEnd=(int)(height*0.6666)+1;
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni=(int)(height*0.6666)+1;
        for(int row=rowIni;row< flag.length;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;
    }
    public static int [][] createPOLFlag(int height,int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;
        rowEnd = (int) (height * 0.50);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.50);
        for (int row = rowIni; row < flag.length; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;
    }
    public static int [][] createPANFlag(int height,int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;
        rowEnd = (int) (height * 0.50);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < (flag[row].length*0.50); cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
            for (int cell = (int)(flag[row].length*0.50); cell < (flag[row].length); cell++) {
                flag[row][cell] = COLOR_RED;
            }

        }
        rowIni = (int) (height * 0.50);
        for (int row = rowIni; row < flag.length; row++) {
            for (int cell = 0; cell < (flag[row].length*0.50); cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
            for (int cell = (int)(flag[row].length*0.50); cell < (flag[row].length); cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        return flag;
    }
    public static int [][] createCHIFlag(int height,int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;
        rowEnd = (int) (height * 0.50);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < (flag[row].length * 0.30); cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
            for (int cell = (int) (flag[row].length * 0.30); cell < (flag[row].length); cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.50);
        for (int row = rowIni; row < flag.length; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;

    }
    public static int [][] createEEUFlag(int height,int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;
        rowEnd = (int) (height * 0.50);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < (flag[row].length * 0.30); cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
            for (int cell = (int) (flag[row].length * 0.30); cell < (flag[row].length); cell++) {
                if(row%2==0) {
                    flag[row][cell] = COLOR_RED;
                }
                else{
                    flag[row][cell]=COLOR_WHITE;
                }
            }
        }
        rowIni = (int) (height * 0.50);
        for (int row = rowIni; row < flag.length; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                if(row%2==0){
                    flag[row][cell] = COLOR_RED;
                }
                else{
                    flag[row][cell]=COLOR_WHITE;
                }
            }
        }
        return flag;
    }
    public static int[][] createCHEFlag(int height,int width){
        int [][]flag=new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        int B=1;
        int w=1;
        rowEnd=(int)(height*0.50);
        for(int f=rowIni;f< rowEnd;f++){
            for(int c=0;c<B;c++){
                flag[f][c]=COLOR_BLUE;
            }
            for(int c=w;c<flag[f].length;c++){
                flag[f][c]=COLOR_WHITE;
            }
            w++;
            B++;
        }
        B--;
        w--;
        rowIni=(int)(height*0.50);
        for(int f=rowIni;f< flag.length;f++){
            for(int c=0;c<B;c++){
                flag[f][c]=COLOR_BLUE;
            }
            for(int c=w;c<flag[f].length;c++){
                flag[f][c]=COLOR_RED;
            }
            w--;
            B--;
        }

       return flag;
    }
    public static int[][] createKUWFlag(int height,int width){
        int [][]flag=new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        int B=1;
        int w=1;
        rowEnd=(int)(height*0.50);
        for(int f=rowIni;f< rowEnd;f++){
            for(int c=0;c<B;c++){
                if(c>flag[f].length*0.20){
                    flag[f][c]=COLOR_WHITE;
                }
                else {
                    flag[f][c] = COLOR_BLACK;
                }
            }
            for(int c=w;c<flag[f].length;c++){
                if(f>flag.length*0.3333){
                    flag[f][c]=COLOR_WHITE;
                }
                else {
                    flag[f][c] = COLOR_GREEN;
                }
            }
            w++;
            B++;
        }
        B--;
        w--;
        rowIni=(int)(height*0.50);
        for(int f=rowIni;f< flag.length;f++){
            for(int c=0;c<B;c++){
                if(c>flag[f].length*0.20){
                    flag[f][c]=COLOR_WHITE;
                }
                else {
                    flag[f][c] = COLOR_BLACK;
                }
            }
            for(int c=w;c<flag[f].length;c++){
                if(f<flag.length*0.6666){
                    flag[f][c]=COLOR_WHITE;
                }
                else {

                        flag[f][c] = COLOR_RED;
                }
            }
            w--;
            B--;
        }

        return flag;
    }
    public static int[][] createZAFFlag(int height,int width){
        int [][]flag=new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        int B=1;
        int w=1;
        rowEnd=(int)(height*0.50);
        for(int f=rowIni;f< rowEnd;f++){
            for(int c=0;c<B;c++){
                if(f-c>=flag.length*0.166666){
                    if(f-c>(flag.length*0.208333333)&&flag.length<20||f-c>(flag.length*0.208333333)+1&&flag.length>=20){
                        flag[f][c] = COLOR_BLACK;
                    }
                    else {
                        flag[f][c] = COLOR_YELLOW;
                    }
                }
                else {
                    flag[f][c] = COLOR_GREEN;
                }
            }
            for(int c=w;c<flag[f].length;c++){
                if(f>flag.length*0.3333){
                    if(f>flag.length*0.416633){
                        flag[f][c]=COLOR_GREEN;
                    }
                    else {
                        flag[f][c] = COLOR_WHITE;
                    }
                }
                else {
                    if(c==f+1||c==f+2&&flag.length>=20){
                        flag[f][c] = COLOR_WHITE;
                    }
                    else {
                        flag[f][c] = COLOR_RED;
                    }
                }
            }
            w++;
            B++;
        }
        B--;
        w--;
        rowIni=(int)(height*0.50);
        for(int f=rowIni;f< flag.length;f++){
            for(int c=0;c<B;c++){
                if(f+c<=flag.length*0.75||f+c<=(flag.length*0.75)+1&&flag.length>=20){
                    if(f+c<(flag.length*0.75)||f+c<(flag.length*0.75)&&flag.length>=20){
                        flag[f][c] = COLOR_BLACK;
                    }
                    else {
                        flag[f][c] = COLOR_YELLOW;
                    }
                }
                else {
                    flag[f][c] = COLOR_GREEN;
                }

            }
            for(int c=w;c<flag[f].length;c++){
                if(f<flag.length*0.6666){
                    if(f<flag.length*0.583267){
                        flag[f][c]=COLOR_GREEN;
                    }
                    else {
                        flag[f][c] = COLOR_WHITE;
                    }
                }
                else {
                    if(c+f== flag.length||c+f== flag.length+1&&flag.length>=20){
                        flag[f][c] = COLOR_WHITE;
                    }
                    else {
                        flag[f][c] = COLOR_BLUE;
                    }
                }
            }
            w--;
            B--;
        }

        return flag;
    }
    public static int [][] createDINFlag(int height,int width){
        int[][] flag= new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        rowEnd=(int)(height*0.40);
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if(cell>=flag[row].length*0.25&&cell<=flag[row].length*0.35){
                    flag[row][cell]=COLOR_WHITE;
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        rowIni=(int)(height*0.40);
        rowEnd=(int)(height*0.60);
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni=(int)(height*0.60);
        for(int row=rowIni;row< flag.length;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if(cell>=flag[row].length*0.25&&cell<=flag[row].length*0.35){
                    flag[row][cell]=COLOR_WHITE;
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        return flag;
    }
    public static int [][] createFINFlag(int height,int width){
        int[][] flag= new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        rowEnd=(int)(height*0.3333)+1;
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if(cell>=flag[row].length*0.20&&cell<=flag[row].length*0.40){
                    flag[row][cell]=COLOR_BLUE;
                }
                else {
                    flag[row][cell] = COLOR_WHITE;
                }
            }
        }
        rowIni=(int)(height*0.3333)+1;
        rowEnd=(int)(height*0.6666)+1;
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni=(int)(height*0.6666)+1;
        for(int row=rowIni;row< flag.length;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if(cell>=flag[row].length*0.20&&cell<=flag[row].length*0.40){
                    flag[row][cell]=COLOR_BLUE;
                }
                else {
                    flag[row][cell] = COLOR_WHITE;
                }
            }
        }
        return flag;
    }
    public static int [][] createNORFlag(int height,int width){
        int[][] flag= new int[height][width];
        int rowIni=0;
        int rowEnd=0;
        rowEnd=(int)(height*0.3333)+1;
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if(cell>=flag[row].length*0.20&&cell<=flag[row].length*0.40){
                    if(cell<flag[row].length*0.25||cell>flag[row].length*0.35){
                        flag[row][cell]=COLOR_WHITE;
                    }
                    else {
                        flag[row][cell] = COLOR_BLUE;
                    }
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        rowIni=(int)(height*0.3333)+1;
        rowEnd=(int)(height*0.6666)+1;
        for(int row=rowIni;row< rowEnd;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if((row<=flag.length*0.416633||row>=flag.length*0.583267)&&(cell<flag[row].length*0.25||cell>flag[row].length*0.35)){
                    flag[row][cell]=COLOR_WHITE;

                }
                else {
                    flag[row][cell] = COLOR_BLUE;
                }
            }
        }
        rowIni=(int)(height*0.6666)+1;
        for(int row=rowIni;row< flag.length;row++){
            for(int cell=0;cell<flag[row].length;cell++) {
                if(cell>=flag[row].length*0.20&&cell<=flag[row].length*0.40){
                    if(cell<flag[row].length*0.25||cell>flag[row].length*0.35){
                        flag[row][cell]=COLOR_WHITE;
                    }
                    else {
                        flag[row][cell] = COLOR_BLUE;
                    }
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        return flag;
    }
    public static int [][] createSUIFlag(int height,int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = flag.length;
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                if(row>0&&row!= rowEnd-1){
                    if(cell>=flag[row].length*0.40&&cell<flag[row].length*0.60||row>flag.length*0.3333&&row< flag.length*0.6666&&cell>=flag[row].length*0.25&&cell<flag[row].length*0.75){
                        flag[row][cell] = COLOR_WHITE;
                    }
                    else{
                        flag[row][cell] = COLOR_RED;
                    }
                }
                else {
                    flag[row][cell] = COLOR_RED;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
       int[][] flag = {};
        flag=createCOLFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createVENFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createPOLFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createPANFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCHIFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createEEUFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCHEFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createDINFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createFINFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createNORFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createKUWFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createZAFFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createSUIFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createVENFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createPOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createPANFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCHIFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createEEUFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createCHEFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createDINFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createFINFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createNORFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createKUWFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag=createSUIFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }

}