/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.number;
import java.util.Random;
import java.util.Scanner;
public class game {
    Scanner input = new Scanner (System.in);
    public void start()
    {
        Random rand=new Random();
        int x;
        x=1+rand.nextInt();
        int y=x/2;
        int z=x+y;
        System.out.println("plz enter a guess number\n");
        int w=input.nextInt();
        if(w<y)
            System.out.println("TOO LOW\n");
        if(w>z)
            System.out.println("TOO HIGH\n");
        if(w==x)
            System.out.println("u win");
    }
}
