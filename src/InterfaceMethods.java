public interface InterfaceMethods {

    public default void updateTyre() {
        System.out.println("Мы не можем поменять покрышки");
    }

    public default void checkEngine() {
        System.out.println("Мы не можем проверить двигатель");
    }

    public default void checkTrailer() {
        System.out.println("Мы не можем проверить прицеп");
    }
}
