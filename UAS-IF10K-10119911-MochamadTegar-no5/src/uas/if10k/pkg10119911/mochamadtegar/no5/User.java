/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if10k.pkg10119911.mochamadtegar.no5;

/**
 *
 * @author Administrator
 */
class User {
    private String nim;
    private String nama;

    // ini method setter
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setName(String nama){
        this.nama = nama;
    }

    // ini method getter
    public String getNim(){
        return this.nim;
    }

    public String getName(){
        return this.nama;
    }
}
