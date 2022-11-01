package visitor.classes;

public class CleaningVisitor implements Visitor{
    @Override
    public void visit(User user) {
        System.out.print(user);
    }

    @Override
    public void visit(Asset asset) {
        System.out.print(asset);
    }

    @Override
    public void visit(Group group) {
        System.out.print(group);
    }
}
