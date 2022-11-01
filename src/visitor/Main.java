package visitor;

import visitor.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<App> app = new ArrayList<>();
        app.add(new User(1,"username","userpassword"));
        app.add(new Asset(12, "assestowner",6.8));
        app.add(new Group(123,10));

        CleaningVisitor cleaningVisitor = new CleaningVisitor();
        for (App appliance : app) {
            appliance.accept(cleaningVisitor);
        }
    }
}
