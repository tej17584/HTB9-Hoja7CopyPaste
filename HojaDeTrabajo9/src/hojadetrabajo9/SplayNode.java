package hojadetrabajo9;
/**
 * Clase nodo usada por el arbol Splay.
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 19.03.18
 */

 /*
 * Implementacion obtenida de: https://www.sanfoundry.com/java-program-implement-splay-tree/
 */

 class SplayNode<E>
 {    
     SplayNode<E> left, right, parent;
     protected Association<String,String> element;
 
     /** Constructor **/
     
     public SplayNode()
     {
         this(null, null, null, null);
     }          
     
     /** Constructor **/
     public SplayNode(Association<String,String> ele)
     {
         this(ele, null, null, null);
     } 
     
     /** Constructor **/
     public SplayNode(Association<String,String> ele, SplayNode left, SplayNode right, SplayNode parent) {
         this.left = left;
         this.right = right;
         this.parent = parent;
         this.element = ele;                  
     }    
     
     public String getKey(){
         return element.key;
     }
     
     public String getValue(){
         return element.value;
     }
     
 }
