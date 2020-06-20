 //$PKGLINE
import processing.core.PApplet;

/**
 * Klasse Wuerfel_schwarzWei�Blau.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "Wuerfel_schwarzWei�Blau" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wuerfel_schwarzWeissBlau extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,420);
    }        


    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup(){
    background(0);
    noStroke();
    zeichneWeisseQuadrate();
    fill(6,69,144);
    zeichneDunkelblaueQuadrate();
    fill(7,176,216);
    zeichneHellblaueQuadrate();
    fill(255);
    zeichneKleineWeisseQuadrate();
    fill(0);
    zeichneKleineSchwarzeQuadrate();
    fill(255);
    zeichneWeisseKleineQuadrate();
    fill(0);
    zeichneSchwarzeKleineQuadrate();
    fill(255);
    }
        
    public void zeichneWeisseQuadrate(){
    for(int k=0; k<5; k++){
        for(int i=0; i<8; i++){
        rect(-20+80*i, -25+100*k, 40, 60);
       }
    }
    }
    
    public void zeichneDunkelblaueQuadrate(){
    for(int k=0;k<4; k++){
        int[]abstand={0,40,0,40};
        for(int i=0; i<9; i++){
        rect(0+80*i+abstand[k],35+100*k,40,40);
       }
    }
    }
    
    public void zeichneHellblaueQuadrate(){
    for(int k=0; k<4; k++){
        int[]abstand={0,-40,0,-40};
        for(int i=0;i<9;i++){
        rect(40+80*i+abstand[k],35+100*k,40,40);
    }
    }
    }
    
    public void zeichneKleineWeisseQuadrate(){
    for(int k=0;k<4;k++){
        int[]abstand={0,140,200,340,440};
        for(int i=0;i<8;i++){
        quad(20+80*i,25+abstand[k],25+80*i,30+abstand[k],20+80*i,35+abstand[k],15+80*i,30+abstand[k]);
        quad(20+80*i,35+abstand[k],25+80*i,40+abstand[k],20+80*i,45+abstand[k],15+80*i,40+abstand[k]);
        quad(50+80*i,35+abstand[k],55+80*i,30+abstand[k],60+80*i,35+abstand[k],55+80*i,40+abstand[k]);
        quad(60+80*i,35+abstand[k],65+80*i,30+abstand[k],70+80*i,35+abstand[k],65+80*i,40+abstand[k]);
    }
    }
    }
    
    public void zeichneKleineSchwarzeQuadrate(){
    for(int k=0;k<4;k++){
        int[]abstand={0,140,200,340,440};
        for(int i=0;i<8;i++){
        quad(10+80*i,35+abstand[k],15+80*i,30+abstand[k],20+80*i,35+abstand[k],15+80*i,40+abstand[k]);
        quad(20+80*i,35+abstand[k],25+80*i,30+abstand[k],30+80*i,35+abstand[k],25+80*i,40+abstand[k]);
        quad(55+80*i,30+abstand[k],60+80*i,25+abstand[k],65+80*i,30+abstand[k],60+80*i,35+abstand[k]);
        quad(55+80*i,40+abstand[k],60+80*i,35+abstand[k],65+80*i,40+abstand[k],60+80*i,45+abstand[k]);
    }
    }
    }
    
    public void zeichneWeisseKleineQuadrate(){
    for(int k=0;k<4;k++){
      int[]abstand={0,60,200,260};
      for(int i=0;i<8;i++){
       quad(10+80*i,75+abstand[k],15+80*i,70+abstand[k],20+80*i,75+abstand[k],15+80*i,80+abstand[k]);
       quad(20+80*i,75+abstand[k],25+80*i,70+abstand[k],30+80*i,75+abstand[k],25+80*i,80+abstand[k]);
       quad(55+80*i,70+abstand[k],60+80*i,65+abstand[k],65+80*i,70+abstand[k],60+80*i,75+abstand[k]);
       quad(55+80*i,80+abstand[k],60+80*i,75+abstand[k],65+80*i,80+abstand[k],60+80*i,85+abstand[k]);
      }
     }
    }
    
    public void zeichneSchwarzeKleineQuadrate(){
    for(int k=0;k<4;k++){
      int[]abstand={0,60,200,260};     
      for(int i=0;i<8;i++){
       quad(20+80*i,65+abstand[k],25+80*i,70+abstand[k],20+80*i,75+abstand[k],15+80*i,70+abstand[k]);
       quad(20+80*i,75+abstand[k],25+80*i,80+abstand[k],20+80*i,85+abstand[k],15+80*i,80+abstand[k]);
       quad(50+80*i,75+abstand[k],55+80*i,70+abstand[k],60+80*i,75+abstand[k],55+80*i,80+abstand[k]);
       quad(60+80*i,75+abstand[k],65+80*i,70+abstand[k],70+80*i,75+abstand[k],65+80*i,80+abstand[k]);
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
        PApplet.main(new String[] {Wuerfel_schwarzWeissBlau.class.getName() });
    }
}


