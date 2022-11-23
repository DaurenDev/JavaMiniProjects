package Lab7_Adapter.Part1.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing (" + fileName + ") Mp4 file");
    }

    @Override
    public void playVlc(String fileName) {
        //this format is not available in this class
    }
}
