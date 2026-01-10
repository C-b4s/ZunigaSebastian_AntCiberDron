package ZSBusinessComponent.ZSEntities;

import java.util.Scanner;

public class ZSAutomata {
    static final Integer zsEr = -10;
    static final Integer zsOk = 100;
    static final String zsAlfabeto = "a,b,c,d, ";

    static final Integer[][] zsMt = {  //  a     b     c         d    esp
                                      {1     ,zsEr  ,zsEr   ,zsEr ,zsEr}, // q0
                                      {zsEr  ,2     ,zsEr   ,zsEr ,zsOk}, // q1 *
                                      {zsEr  ,2     ,3      ,zsEr ,zsOk}, // q2 *
                                      {zsEr  ,zsEr  ,zsEr   ,4    ,zsEr}, // q3
                                      {zsEr  ,zsEr  ,zsEr   ,4    ,zsOk}, // q4
                            };
    @SuppressWarnings("resource")
    private int zsGetIndexALfabeto(String zsCaracter){
    Scanner zsScAlfa = new Scanner(zsAlfabeto).useDelimiter(",");
    for (int i = 0; zsScAlfa.hasNext(); i++)
        if( zsCaracter.equals(zsScAlfa.next()))
            return i;
    return zsEr;
    }

    public boolean checkTipoArsenal(String zsArsenal){
        int q =0;
        for (int i = 0; i < zsArsenal.length(); i++){
            int zsIndexAlfa = zsGetIndexALfabeto(zsArsenal.charAt(i) + "");
            if (zsIndexAlfa == zsEr || zsMt[q][zsIndexAlfa].equals(zsEr))
                return false;
            q = zsMt[q][zsIndexAlfa];
        }
        return (q == zsOk);
    }
}
