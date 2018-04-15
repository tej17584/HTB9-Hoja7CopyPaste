package hojadetrabajo9;

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
