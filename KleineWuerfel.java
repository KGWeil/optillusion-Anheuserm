 //$PKGLINE
import processing.core.PApplet;

/**
 * Klasse KleineWuerfel.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "KleineWuerfel" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KleineWuerfel extends PApplet
{ int s=30;
    int t=s/4;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(740,740);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup(){
    background(255);
    fill(0);
    noStroke();
    zeichneAlles();
    }
    
    public void zeichneAlles(){
     for(int k=0; k<24; k++){
        for(int i=0; i<24; i++){
        int farbe=(i+k)%2*255;
        fill(farbe);
        rect(0+s*i,0+s*k,s,s);
         if(!(k>=6&&k<=17&&i>=6&&i<=17)){
         fill(255-farbe);
         rect(1+s*i,1+s*k,t,t);
         rect(s-1-t+s*i,s-1-t+s*k,t,t);
        }
        if(k>=7&&k<=16&&i>=7&&i<=16){
        fill(255-farbe);
        rect(1+s*i,s-1-t+s*k,t,t);
        rect(s-1-t+s*i,1+s*k,t,t);
        }
       }
    }
    }
    
    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */ {
     
    }
    public static void main(String _args[]){ 
        PApplet.main(new String[] {KleineWuerfel.class.getName() });
    }
}


