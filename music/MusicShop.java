package music;

class MusicShop {
    public void demoInstrument(MusicalInstrument instrument) throws NotPlayableException {
        // instanceof е оператор в Java, който проверява дали даден обект е инстанция на конкретен клас или интерфейс.
        if(instrument instanceof Playable) {
            // Тук кастваме обекта до Playable, за да извикаме метода play().
            ((Playable) instrument).play();
            //Playable x = (Playable) instrument;
            //x.play();
        } else {
            // Хвърляме нашето персонализирано изключение, ако инструментът не може да бъде изпълнен на демо.
            throw new NotPlayableException("This instrument can't be played for a demo!");
        }
    }
}