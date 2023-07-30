//Rithvik Padigala
//4A


public class LabGraphicsIntro
{
    public static void main(String[] args)
    {
        //#1)
        //StdDraw.line(0, 0, 1, 1);
        //#2)
        //StdDraw.line(0, 1, 1, 0);
        //#3)
        //StdDraw.circle(.5, .5, .2);
        //#4)
        //StdDraw.setPenColor(255, 0, 0);
        //StdDraw.filledCircle(.5, .5, .2);
        //APP
        //#2)
        //StdDraw.setPenColor(0, 0, 0);
        //StdDraw.filledCircle(.5, .5, .5);
        //StdDraw.setPenColor(255, 255, 255);
        //StdDraw.filledCircle(.5, .5, .4);
        //StdDraw.setPenColor(0, 0, 255);
        //StdDraw.filledCircle(.5, .5, .3);
        //StdDraw.setPenColor(255, 0, 0);
        //StdDraw.filledCircle(.5, .5, .2);
        //StdDraw.setPenColor(255, 255, 0);
        //StdDraw.filledCircle(.5, .5, .1);
        //#3)
        //StdDraw.setPenColor(255, 0, 0);
        //double x = 0;
        //double y = 0;
        //while(x <= 1)
        //{
        //StdDraw.line(0, x, 1, y);
        //x+=.05;
        //y+=.05;
        //}
        //#4)
        //StdDraw.setPenColor(0, 0, 255);
        //double x1 = 0;
        //double y1 = 0;
        //while(x1 <= 1)
        //{
        //StdDraw.line(x1, 0, y1, 1);
        //x1+=.05;
        //y1+=.05;
        //}
        //#5)
        //for(double i = 0; i <=1; i+=.025)
        //{
        //   StdDraw.line(i, 0, 1, i);
        //}
        //#6)
        double x = 80;
        int red = 0;
        for(double i = 0; i <=1; i+=(1/x))
        {
           red += 3;
           StdDraw.setPenColor(red, 0, 0);
           StdDraw.line(i, 0, 1, i);
        }
}
}
