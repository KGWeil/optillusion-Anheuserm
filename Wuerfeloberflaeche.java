 //$PKGLINE
import processing.core.PApplet;

/**
 * Klasse Wuerfeloberflaeche.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "W�rfeloberfl�che" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wuerfeloberflaeche extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(400,340);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup(){
    background(50,110,170);
    noStroke();
    fill(90,185,115);
    zeichneGrueneQuadrate();
    fill(160);
    zeichneGraueWuerfel();
    
    
    
    }
    public void zeichneGraueWuerfel(){
    for (int k=0; k<8; k++){
        int[]abstand={0,-20,0,-20,0,-20,0,-20};
        for (int i=0; i<11; i++){
        quad(20+40*i+abstand[k],-15+45*k,40+40*i+abstand[k],0+45*k,20+40*i+abstand[k],15+45*k, 0+40*i+abstand[k],0+45*k);
    
    }
    }
    }
    public void zeichneGrueneQuadrate(){
    for (int k=0; k<8;k++){
        int[]abstand={0,20,0,20,0,20,0,20};
        for (int i=0; i<10; i++){
    quad(20+40*i+abstand[k],15+45*k,40+40*i+abstand[k],0+45*k,40+40*i+abstand[k],30+45*k,20+40*i+abstand[k],45+45*k);
    }
    }
    for (int l=0; l<4; l++){
    quad(0,60+90*l,20,45+90*l,20,75+90*l,0,90+90*l);
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
        PApplet.main(new String[] {Wuerfeloberflaeche.class.getName() });
    }
}


