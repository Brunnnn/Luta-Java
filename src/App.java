public class App {
    public static void main(String[] args) throws Exception {
        lutador l[] = new lutador[6];
        
        l[0] = new lutador("Bruno", "Brasil", 19, 
        1.84f, 84.6f, 5, 0, 7);

        l[1] = new lutador("Henri", "Ameria", 29, 
        1.69f, 57.8f, 14, 2, 3);

        l[2] = new lutador("Felip", "EUA", 28, 
        1.65f, 80.9f, 12, 2, 1);

        l[3] = new lutador("daniel", "Brasil", 35, 
        1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new lutador("Paulo", "Australia", 37, 
        1.70f, 119.3f, 5, 4, 3);

        l[5] = new lutador("Carlos", "EUA", 30, 
        1.81f, 105.7f, 12, 2, 4);

        Luta UEC01 = new Luta();

        UEC01.marcarluta(l[0], l[5]);

        UEC01.lutar(3);

        //l[0].status();
        //l[5].status();

        

    }
}
