package test.hacker.basicjava.CovariantReturn;

class Flower {
    public String name;
    public String getName(){
        return name;
    }
    public String whatsYourName(){
        return name;
    }
}

class Jasmine extends Flower{
    public Jasmine(){
        super.name = "Jasmine";
    }
}

class Lily extends Flower{
    public Lily(){
        super.name = "Lily";
    }
}

class Region {
    public String name;
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    public WestBengal(){
        super.name="WestBengal";
    }
    public Flower yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    public AndhraPradesh(){
        super.name= "AndhraPradesh";
    }
    public Flower yourNationalFlower(){
        return new Lily();
    }
}
