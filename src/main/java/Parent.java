
public class Parent extends Person {
    private Parent spouse;
    private Child[] children;

    public Parent(String name, int age){
        super(name, age);
        this.spouse = null;
        this.children = new Child[] {};
    }

    public Parent(String name, int age, Parent spouse){
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[] {};
    }

   
    public int getAge(){
        return this.age;
    }


    public String getName(){
        return this.name;
    }

    
    public void setAge(int newAge){
        this.age = newAge;
    }

   
    public void setName(String newName){
        this.name = newName;
    }

   
    public Parent getSpouse(){
        return this.spouse;
    }

  
    public void setSpouse(Parent spouse){
        this.spouse = spouse;
    }

   
    public Child[] getChildren(){
        return this.children;
    }

   
    public void setChildren(Child[] children){
        this.children = children;
    }

    
    public void addChild(Child child){
        Child[] x = new Child[this.children.length + 1];
        for(int i = 0; i < this.children.length; i++){
            x[i] = children[i];
        } 
        x[this.children.length] = child;
        this.children = x;
    }
}