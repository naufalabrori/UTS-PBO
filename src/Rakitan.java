/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nopal
 */
public class Rakitan {
    
    public static void main(String[] args) {
        AMD amd1 = new AMD(0);
        Intel intel1 = new Intel(0);
        Komputer komputer1 = new Komputer();
        komputer1.cetakInfo(intel1);
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo(amd1);
    }
}
