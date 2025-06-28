public class Main {
    public static void main(String[] args) {
        MusicTrack track = new MusicTrack(115, 0.7, 0.8, 0.6);
        String mood = MoodClassifier.classify(track);

        System.out.println("\n🎵 Track Info:");
        System.out.println("Tempo: " + track.tempo + " BPM");
        System.out.println("Energy: " + track.energy);
        System.out.println("Danceability: " + track.danceability);
        System.out.println("Valence: " + track.valence);

        System.out.println("\nPredicted Mood: " + mood);
    }
}
