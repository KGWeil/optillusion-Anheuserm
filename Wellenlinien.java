
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellenlinien.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellenlinien extends PApplet
{ int s=75;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(700,350);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneSchwarzeQuadrate(10,10,0,true);
        zeichneWeisseQuadrate(0,0,255,true);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    public void zeichneQuadrat(int x, int y, int farbe, boolean links){
        fill(farbe);
        square(x, y, s);
        if(farbe==0){
            fill(255);
            circle(10+x,10+y,10);
            circle(10+x,65+y,10);
        }else{
            fill(0);
            circle(10+x,10+y, 10);
            circle(10+x,65+y, 10);
        }
    }

    public void zeichneSchwarzeQuadrate(int x, int y, int farbe, boolean links){
        fill(farbe);
        for(int k=0; k<2; k++){
        for(int i=0; i<5; i++){
            square(10+2*s*i, 10+2*s*k, s);
        }
    }
        if(farbe==0){
            fill(255);
            for(int k=0; k<2; k++){
            for(int i=0; i<5; i++){
                circle(10+x+2*s*i, 10+y+2*s*k, 10);
                circle(10+x+2*s*i, 65+y+2*s*k, 10);
            }
        }
        }else{
            fill(0);
            for(int k=0; k<2; k++){
            for(int i=0; i<5; i++){
                circle(10+x+2*s*i, 10+y, 10);
                circle(10+x+2*s*i, 10+y, 10);
            }
        }
    }
    }

    public void zeichneWeisseQuadrate(int x, int y, int farbe, boolean links){
        fill(farbe);
        for(int k=0; k<2; k++){
        for(int i=0; i<4; i++){
            square(10+2*s*i, 10+2*s*k, s);
        }
        }
        if(farbe==0){
            fill(255);
            for(int k=0; k<2; k++){
            for(int i=0; i<2; i++){
            circle(85+x+2*s*i, 10+y+2*s*k, 10);
            circle(85+x+2*s*i, 10+y+2*s*k, 10);
            }
        }
        }else{
            fill(0);
            for(int k=0; k<2; k++){
            for(int i=0; i<4; i++){
                circle(95+x+2*s*i, 20+y+2*s*k, 10);
                circle(95+x+2*s*i, 75+y+2*s*k, 10);
            }
            }
        }
    }
    
    public void zeichneQuadrateRechts(int x, int y, int farbe, boolean rechts){
     fill(farbe);
        for(int k=0; k<2; k++){
        for(int i=0; i<5; i++){
            square(10+2*s*i, 10+2*s*k, s);
        }
    }
        if(farbe==0){
            fill(255);
            for(int k=0; k<2; k++){
            for(int i=0; i<5; i++){
                circle(10+x+2*s*i, 10+y+2*s*k, 10);
                circle(10+x+2*s*i, 65+y+2*s*k, 10);
            }
        }
        }else{
            fill(0);
            for(int k=0; k<2; k++){
            for(int i=0; i<5; i++){
                circle(10+x+2*s*i, 10+y, 10);
                circle(10+x+2*s*i, 10+y, 10);
    
    
            }
        }
    }
}
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellenlinien.class.getName() });
    }

}
