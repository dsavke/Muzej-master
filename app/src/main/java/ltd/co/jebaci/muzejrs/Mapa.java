package ltd.co.jebaci.muzejrs;

public class Mapa {

    public boolean[] polja = new boolean[13];
    public int polje1 = 0;
    public int polje2 = 0;

    /*Mapa(){
        for(int i = 0; i < 13; i++){
            polja[i] = false;
        }
    }*/

    public void obiljeziPolje(int index){
        if(!polja[index]) {
            polja[index] = true;

        }
    }

    public boolean[] getPolja() {
        return polja;
    }
}
