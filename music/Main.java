package music;

public class Main {
    public static void main(String args[])
    {
        try {
            // Създаваме нов инструмент от тип Guitar
            Guitar g = new Guitar("koko", "moko", 345453);

            // Създаваме нов магазин за музикални инструменти
            MusicShop ms = new MusicShop();

            // Демонстрираме как звучи китарата
            ms.demoInstrument(g);

            // Създаваме нов инструмент от тип Drum
            Drum d = new Drum("shoko", "moko", 88237);

            // Опитваме да демонстрираме барабана, но той не имплементира Playable интерфейса, затова ще бъде хвърлена грешка NotPlayableException
            ms.demoInstrument(d);
        }
        catch(NotPlayableException e)
        {
            // Извеждаме съобщението на хвърленото изключение
            System.out.println(e.getMessage());
        }
    }
}