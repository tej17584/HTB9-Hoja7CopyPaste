package hojadetrabajo9;

/**
 * Clase factory que permite al usuario la implementacion a usar
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 20.04.18
 */

import java.util.PriorityQueue;

/**
 * Clase que muestra la utilizacion del patron de diseño factory.
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 19.03.18
 */
class Factory {
    /**
     * Constructor vacio.
     */
    public Factory(){}
    Object Imp;
    /**
     * Metodo que retorna la implementacion a utilizar
     * @param impMap el string que dice que implementacionse utilizara
     * @return el Map correspondiente
     */
    public Object getImp(String imp) {
    // seleccion de la implementacion a utilizar:
        if(imp.equals("1"))
        {   
            Imp = new SplayTree<>();
        }else if (imp.equals("2")){
            Imp = new RedBlackBST<>();
        } 
        return Imp;
   }

}
