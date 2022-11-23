package Lab7_Adapter.Part1.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing (" + fileName + ") Mp3 file");
        }

        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid expression " + audioType);
        }
    }
}
