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
public class mainTV {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inches", 100);
//        Televisi tv = new Televisi("TV Tempoe Doeloe, 14 inches", 10);
        String[] semuaChannel = {"RCTI","SCTV","INDOSIAR","LA TV",
            "METRO TV","TRANS TV","TPI","TV 7","TVRI","TV G","AN TV"};
//        String[] ChannelFavorit = {"RCTI","SCTV","INDOSIAR","LA TV",
//            "METRO TV","TRANS TV","TPI","TV 7"};
        
        System.out.println("Hasan, Membeli Televisi : "+tv.getDeskripsi());
        
        tv.getChannel();
        tv.setChannel(semuaChannel);
//        tv.setChannel(ChannelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        //tv modern
        tv.setModusTampilan(TelevisiModern.teleText);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("Attack On Titan");
        tv.playCD();
    }
}
