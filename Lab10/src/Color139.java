/*********************************************************************
 * This class implements a color object.  Colors are defined by
 * three component colors: red, green, blue.  Each of these three
 * components has a value betwen 0 and 255.
 *********************************************************************/
public class Color139
{
   /*************************************************************
    * Some constants that define the 8 "standard" computer colors.
    *************************************************************/
   public static final Color139 BLACK = new Color139(0,0,0);
   public static final Color139 RED = new Color139(255,0,0);
   public static final Color139 GREEN = new Color139(0,255,0);
   public static final Color139 YELLOW = new Color139(255,255,0);
   public static final Color139 BLUE = new Color139(0,0,255);
   public static final Color139 MAGENTA = new Color139(255,0,255);
   public static final Color139 CYAN = new Color139(0,255,255);
   public static final Color139 WHITE = new Color139(255,255,255);

   /*************************************************************
    * Below are the three "instance" variables which store the
    * "attribute" values in objects of type Color139.
    *************************************************************/
   private int red;   // Red component of the Color139 object
   private int green; // Green component of the Color139 object
   private int blue;  // Blue component of the Color139 Object

   /*************************************************************
    * This constructor creates a Color139 object with the specified
    * RGB component values. If a component value less than 0 is specified, 
    * that component value is set to 0. If a component value greater 
    * than 255 is specified, that component's value is set to 255.
    * @param redComponent   The color's red component as a value 0-255
    * @param greenComponent The color's green component as a value 0-255
    * @param blueComponent  The color's blue component as a value 0-255
    *************************************************************/
   public Color139(int redComponent, int greenComponent, int blueComponent)
   {
      // MAKE ME
	   if (redComponent > 255)
			redComponent = 255;
		else if (redComponent < 0)
			redComponent = 0;
     if (greenComponent > 255)
			greenComponent = 255;
		else if (greenComponent < 0)
			greenComponent = 0;
     if (blueComponent > 255)
			blueComponent = 255;
		else if (blueComponent < 0)
			blueComponent = 0;
		
		red = redComponent;
		green = greenComponent;
		blue = blueComponent;
   }

   /*************************************************************
    * This method returns a string representation of the color
    * in the form "#RRGGBB" where RR, GG, and BB are the red, green
    * and blue component values expressed as hexidecimal digits.
    * @return The string representation of the color.
    *************************************************************/
   public String toString()
   {
      String redStr;      // red component hex value as a string
      String greenStr;    // green component hex value as a string
      String blueStr;     // blue component hex value as a string

      redStr = Integer.toHexString(this.red);
      if (redStr.length() == 1)
         redStr = "0" + redStr;
      greenStr = Integer.toHexString(this.green);
      if (greenStr.length() == 1)
         greenStr = "0" + greenStr;
      blueStr = Integer.toHexString(this.blue);
      if (blueStr.length() == 1)
         blueStr = "0" + blueStr;
      return "#" + redStr + greenStr + blueStr;
   }

   /*************************************************************
    * The method returns a new Color139 value that is the sum of
    * this color and the other color. The value of the red components of
    * the two colors are added, as are the green and blue components.
    * Any result greater than 255 is set to 255.
    * @param other The color to be added to this color
    * @return      The sum of the two colors
    *************************************************************/
   public Color139 add(Color139 other)
   {
      Color139 newcolor;      // new color object that is dimmer than this color
      int      newRed;        // new red color value
      int      newGreen;      // new green color value
      int      newBlue;       // new blue color value

      newRed = this.red + other.red;
      newGreen = this.green + other.green;
      newBlue = this.blue + other.blue;
      
      newcolor = new Color139 (newRed, newGreen, newBlue);
      return newcolor;
   }

   /*************************************************************
    * The method returns a new Color139 value that is the difference between
    * this color and the other color. The value of the red components of
    * the other color is subtracted from the red component of this color.
    * The green and blue components are calculated similarly.
    * Any result less than 0 is set to 0.
    * @param other The color to be subtracted from this color
    * @return      The sum of the two colors
    *************************************************************/
   public Color139 sub(Color139 other)
   {
      // MAKE ME
	   Color139 newcolor;      // new color object that is dimmer than this color
	      int      newRed;        // new red color value
	      int      newGreen;      // new green color value
	      int      newBlue;       // new blue color value

	      newRed = this.red - other.red;
	      newGreen = this.green - other.green;
	      newBlue = this.blue - other.blue;
	      
	      newcolor = new Color139 (newRed, newGreen, newBlue);
	      return newcolor;
   }

   /*************************************************************
    * The method returns a dimmer new Color139 value. Each of
    * the red, green, and blue components is decreased by 20%.
    *
    * @return The dimmer color
    *************************************************************/
   public Color139 dim()
   {
      Color139 newcolor;      // new color object that is dimmer than this color
      int newRed;             // new red color value
      int newGreen;           // new green color value
      int newBlue;            // new blue color value

      newRed = (int) (this.red / 1.2);
      newGreen = (int) (this.green / 1.2);
      newBlue = (int) (this.blue / 1.2);
      
      newcolor = new Color139 (newRed, newGreen, newBlue);

      return newcolor;
   }

   /*************************************************************
    * The method returns a darker new Color139 value. Each of
    * the red, green, and blue components is decreased by 32 down
    * to a minimum of 0.
    * @return The darker color
    *************************************************************/
   public Color139 darken()
   {
      // MAKE ME
	   Color139 newcolor;      // new color object that is darker than this color
	      int      newRed;        // new red color value
	      int      newGreen;      // new green color value
	      int      newBlue;       // new blue color value

	      newRed = this.red - 32;
	      newGreen = this.green - 32;
	      newBlue = this.blue - 32;
	      
	      newcolor = new Color139 (newRed, newGreen, newBlue);
	      return newcolor;
   }

   /*************************************************************
    * This method returns true if this color is equal to the
    * other color and returns false if it is not equal.
    * @param other The color to be compared to this color
    * @return      Whether or not the two colors are equal
    *************************************************************/
   public boolean equals(Color139 other)
   {
	   return this.red == other.red && this.green == other.green &&
			 	 this.blue == other.blue;
   }

   /*************************************************************
    * The method returns a lighter new Color139 value. Each of
    * the red, green, and blue components is increased by 32 up
    * to a maximum of 255.
    * @return The lighter color
    *************************************************************/
   public Color139 lighten()
   {
      // MAKE ME
	   // MAKE ME
	   Color139 newcolor;      // new color object that is darker than this color
	      int      newRed;        // new red color value
	      int      newGreen;      // new green color value
	      int      newBlue;       // new blue color value

	      newRed = this.red + 32;
	      newGreen = this.green + 32;
	      newBlue = this.blue + 32;
	      
	      newcolor = new Color139 (newRed, newGreen, newBlue);

	      return newcolor;
   }

   /*************************************************************
    * The method returns a brighter new Color139 value. Each of
    * the red, green, and blue components is increased by 20%.
    * @return The brighter color
    *************************************************************/
   public Color139 brighten()
	{
		Color139 newcolor; // new color object that is brighter than this color
		int newRed; // new red color value
		int newGreen; // new green color value
		int newBlue; // new blue color value

		newRed = (int) (this.red * 1.2);
		newGreen = (int) (this.green * 1.2);
		newBlue = (int) (this.blue * 1.2);

		newcolor = new Color139(newRed, newGreen, newBlue);

		return newcolor;
	}

}
