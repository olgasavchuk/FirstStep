package FirstStep;

import static FirstStep.MoreArgsDemo.ChangeRef;

class Class{

    String name;

    Class(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Object with the name \"" + name + "\".");
    }
}

class MoreArgsDemo {

    static void ChangeRef(Class object) {
        Class tmp = new Class("Local Object");
        object = tmp;
        object.show();
    }
}

public class LinkArgument {

    public static void main(String[] args) {
        Class obj = new Class("Main Object");
        obj.show();
        ChangeRef(obj);
        obj.show();
    }
}


