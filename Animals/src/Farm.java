import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Animals {
    String name;
    public Animals(String name) {
        this.name = name;
    }
}
class swimmable extends Animals {
    public swimmable(String name) {
        super(name);
    }
}
class walkable extends Animals {
    public walkable(String name) {
        super(name);
    }
}
class pig extends walkable {
    public pig(String name) {
        super(name);
    }
}
class duck extends Animals {
    swimmable swimming;
    walkable walking;
    public duck(String name) {
        super(name);
        this.swimming = new swimmable(name);
        this.walking = new walkable(name);
    }
}
class fish extends swimmable {
    public fish(String name) {
        super(name);
    }
}
public class Farm {
    Vector<Animals> zoo = new Vector<>();
    public void Add(Animals a) {
        zoo.add(a);
    }
    public void printSwimmable() {
        for (Animals x: zoo) {
            if(x instanceof swimmable) {
                System.out.println(x.name + "\n");
            }
        }
    }
    public void printWalkable() {
        for (Animals x: zoo) {
            if(x instanceof walkable) {
                System.out.println(x.name + "\n");
            }
        }
    }
}


