public class Inheritance {
        public static void main(String[] args) {
            
            ParentFruits pf = new ParentFruits();
            Apple ca = new Apple();
            Grapes gr = new Grapes();
            
            pf.color = "Red";
            pf.taste = "Sweet";
            pf.NumPcs = 20;
            
            ca.color = "Green";
            ca.taste = "Sour";
            ca.NumPcs = 5;
            
            gr.color = "Dark Violet";
            gr.taste = "Sweet";
            gr.NumPcs = 10;
            
            //Method from parent
            pf.checkFruits();
            ca.checkFruits();
            gr.checkFruits();
            
            //method from child (apple)
            ca.drinks();

            //method from child (grapes)
            gr.drinks();
    
        }
    
    }