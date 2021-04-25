/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.d;

/**
 *
 * @author Hafifah
 */
public class TelevisiModern extends Televisi{
    static String teleText = "Teletext";
    static String TV ="Televisi";
    private String cd = "";
    
    public TelevisiModern(String model, int i){
        super(model,i);
    }
    
    public void setModusTampilan(String display){
        if (display==teleText) {
        System.out.println("Modus tampilan : "+teleText);
        }else{
        System.out.println("Modus tampilan : "+TV);
        }
    }
    
    void setHalamanTeletext(int page){
        System.out.println("Berpindah ke halaman Teletext : "+page);
    }
    
    void setDiscTray(String cd){
        this.cd = cd;
    }
    
    void playCD(){
        if (cd == "") {
            System.out.println("Tidak ada CD didalam disk tray!");
        }else{
            System.out.println("Memutar film "+cd);
        }
    }
}
