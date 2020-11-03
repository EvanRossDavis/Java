public class Main
{
    /**
     * This application generates an html page that displays different colors.
     */
    public static void main(String args[])
    {
        Color139 cc1;
        Color139 cc2;
        Color139 cc3;
        Color139 cc4;
        Color139 cc5;
        Color139 cc6;
        Color139 cc7;
        Color139 cc8;
        Color139 cc9;
        
        System.out.printf("<html><pre>\n");
        
        out("color BLACK", Color139.BLACK);
        out("color RED", Color139.RED);
        out("color GREEN", Color139.GREEN);
        out("color YELLOW", Color139.YELLOW);
        out("color BLUE", Color139.BLUE);
        out("color MAGENTA", Color139.MAGENTA);
        out("color CYAN", Color139.CYAN);
        out("color WHITE", Color139.WHITE);
        System.out.printf("\n");
        
        out("color RED+GREEN", Color139.RED.add(Color139.GREEN));
        out("color RED+YELLOW", Color139.RED.add(Color139.YELLOW));
        out("color WHITE-CYAN", Color139.WHITE.sub(Color139.CYAN));
        System.out.printf("\n");
        
        cc1 = new Color139(34, 54, 189);
        out("color cc1{34,54,189}", cc1);
        cc2 = new Color139(128, 32, 64);
        out("color cc2{128,32,64}", cc2);
        System.out.printf("\n");
        
        out("color dark BLUE", Color139.BLUE.darken());
        out("color dim BLUE", Color139.BLUE.dim());
        System.out.printf("\n");
        
        cc3 = Color139.BLUE;
        cc3 = cc3.add(Color139.GREEN);
        System.out.printf ("Does BLUE + GREEN == CYAN? %s\n",
                           String.valueOf(cc3.equals(Color139.CYAN)));
        System.out.printf("\n");
        
        cc4 = new Color139(0,64,0);
        out("color cc4{0,64,0}", cc4);
        for (int ii = 0; ii < 8; ii++)
        {
            cc4 = cc4.lighten();
            out("color lighten*" + ii + " {0,64,0}", cc4);
        }
        System.out.printf("\n");
        
        cc5 = new Color139(0,64,0);
        out("color cc5{0,64,0}", cc5);
        for (int ii = 0; ii < 8; ii++)
        {
            cc5 = cc5.brighten();
            out("color brighten*" + ii + " {0,64,0}", cc5);
        }
        System.out.printf("\n");
        
        cc6 = new Color139(255,192,0);
        out("color cc6{255,192,0}", cc6);
        for (int ii = 0; ii < 8; ii++)
        {
            cc6 = cc6.darken();
            out("color darken*" + ii + " {255,192,0}", cc6);
        }
        System.out.printf("\n");
        
        cc7 = new Color139(255,192,0);
        out("color cc7{255,192,0}", cc7);
        for (int ii = 0; ii < 8; ii++)
        {
            cc7 = cc7.dim();
            out("color dim*" + ii + " {255,192,0}", cc7);
        }
        System.out.printf("\n");
        
        System.out.printf("</html>\n");
    }
    
    /**
     * This method outputs HTML for a color's string and the color
     * itself along with a comment describing what the color is.
     */
    private static void out(String descript, Color139 theColor)
    {
        System.out.printf("%-30s is %s in hex and looks like this: "
                + "<span style=\"background-color:%s\">&nbsp; &nbsp;</span>\n",
                          descript, theColor.toString(), theColor.toString());
    }
    
}
