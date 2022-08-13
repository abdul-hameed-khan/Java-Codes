/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Zulfiqar
 */
public abstract class three_dimshape extends shape {
     @Override
     public double area(){
         return 0;
     }
     @Override
     public double volume(){
         return 0;
     }
      @Override
    public String toString(){
        return "hello 3d";
    }
}
