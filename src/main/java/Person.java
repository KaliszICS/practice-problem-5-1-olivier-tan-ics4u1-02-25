class Person{
    String name;
    int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    

    
     public String getName(){
        return this.name;
    }
    

     public int getAge(){
        return this.age;
    }

    public void setName(String newName){
        this.name = newName;
    }

      public void setAge(int newAge){
        this.age = newAge;
    }


}