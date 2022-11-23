package Lab7_Adapter.Part1.AdvancedMediaPlayer;

public class VlcPLayer implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        //this format is not available in this class
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing (" + fileName + ") Vlc file");
    }
}
