package Lab7_Adapter.Part1.MediaPlayer;

import Lab7_Adapter.Part1.AdvancedMediaPlayer.AdvancedMediaPlayer;
import Lab7_Adapter.Part1.AdvancedMediaPlayer.Mp4Player;
import Lab7_Adapter.Part1.AdvancedMediaPlayer.VlcPLayer;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPLayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
