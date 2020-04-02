
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffehaus extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        strokeWeight(1);
        stroke(0);
        fill(0);
        zeichneAlleQuadrate();
        stroke(150);
        strokeWeight(3);
        zeichneLinien();
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */

    public void draw()
    {
    }

    public void zeichneLinien(){
        for(int i=0; i<10; i++){
            line(0, 10+i*40, 700, 10+i*40);
            
        }
    }
    
    public void zeichneAlleQuadrate()
    {
        for(int k=0; k<10; k++){
            int[]abstand={10,20,30,10,20,30,10,20,30};
            for(int i=0; i<8; i++){
                square(2*40*i+abstand[k], 10+40*k, 40);
            }
        }
    }
   
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffehaus.class.getName() });
    }

}
