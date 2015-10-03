package FirstStep;

public class ObjectCopyCreation {

    public static void main(String[] args) {

        MakeObjCopy objA = new MakeObjCopy("First Object",100);
        MakeObjCopy objB = new MakeObjCopy(objA);

        System.out.println("Objects after creation:");
        objA.show();
        objB.show();

        objB.name = "Second object";
        objB.number = 200;

        System.out.println("\nObjects after B changing:");
        objA.show();
        objB.show();

        objA = objB.copy();
        System.out.println("\nObjects after copying B to A:");
        objA.show();
        objB.show();

        objB.name = "Second object is changed again";
        objB.number = 300;

        System.out.println("\nObjects after И changing again:");
        objA.show();
        objB.show();
    }

}

class MakeObjCopy {

    String name;
    int number;

    //Class Constructor
    MakeObjCopy(String str, int num) {
        name = str;
        number = num;
    }

    //Constructor oа object copy creation
    MakeObjCopy(MakeObjCopy obj) {
        name = obj.name;
        number = obj.number;
    }

    //Method to copy the object
    MakeObjCopy copy() {
        MakeObjCopy tmp = new MakeObjCopy(name,number);
        return tmp;
    }

    void show() {
        String text = "";
        text += "name: "+name+"\nnumber: "+number+"";
        System.out.println(text);
    }
}
