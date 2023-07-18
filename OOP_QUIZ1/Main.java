public class Main {
      public static void main(String[] args) {
        
        Parent p = new Parent();
        ChildA ca = new ChildA();
        ChildB cb = new ChildB();
        
        p.Attitude = "Jolly";
        p.Hair_Color = "Gray";
        p.Blood_type = "A+";
        p.Property = "BMW";
        
        ca.Attitude = "Moody";
        ca.Hair_Color = "Black";
        ca.Blood_type = "AB+";
        ca.Property = "BMW";
        ca.Name = "Andrew";
        ca.Age = 42;
        ca.Birthday = "July 12, 1980";
        
        cb.Attitude = "Jolly";
        cb.Hair_Color = "Gray";
        cb.Blood_type = "O+";
        cb.Property = "Toyota Trueno";
        cb.Name = "Liza";
        cb.Age = 23;
        cb.Birthday = "August 19, 2000";
        
        p.checkParent();
        ca.checkParent();
        cb.checkParent();
        
        ca.information();
        
        cb.information();
      }
}