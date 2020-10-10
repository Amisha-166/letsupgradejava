class Employee{
    
     static void display(){
        
        String name ="The name is Amisha";
        String city="The city is Lucknow ";
        int age=20;
    }
     static void displayshow(){
        
        String name ="The name is Vanshika";
        String city="The city is Lucknow";
        int age=25;
    }

    public static void main(String args[]){

        Employee e= new Employee();
        e.display();
        Employee ee= new Employee();
        ee.displayshow();
}
}
