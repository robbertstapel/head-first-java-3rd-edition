import startup.game.SimpleStartup;

public static void main(String[] args) {
    SimpleStartup newSimpleStartup = new SimpleStartup();
    newSimpleStartup.setLocationCells(new int[]{1, 2, 3});
    newSimpleStartup.guessOnce(1);
    newSimpleStartup.guessOnce(2);
    newSimpleStartup.guessOnce(3);
}