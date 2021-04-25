/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.d;

import java.util.Arrays;

/**
 *
 * @author Hafifah
 */
public class Televisi {
    
    private String model;
    private int jumlahChannel = 0;
    String[] Channels = new String[jumlahChannel];
    private int Volume;
    
    public Televisi(String model, int i){
        this.model = model;
        this.jumlahChannel = i;
    }
    
    public String getDeskripsi(){
        return (model);
    }
    
    public void getChannel(){
        if(Channels.length==0){
            System.out.println("Belum ada channel yang diset!");
        }else{
            System.out.println("Channel berhasil diset!");
        }
    }
    
    public void setChannel(String[] semuaChannel){
        if(jumlahChannel >= semuaChannel.length){
            Channels = semuaChannel;
            System.out.println("Informasi Channel berhasil diupdate!");
        }else{
            System.out.println("Maaf TV ini hanya mampu menyimpan "
                    +jumlahChannel+" Channel");
        }
        
    }
    
    public void setChannelAktif(int aktif){
        if (jumlahChannel>aktif) {
            System.out.println("Pindah Channel ke : "+Channels[aktif]);
        }else{
            System.out.println("Mohon maaf anda belum berlangganan");
        }
    }
    
    public void setVolume(int vol){
        System.out.println("Intensitas volume sekarang "+vol);
    }  
}
