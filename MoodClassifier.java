public class MoodClassifier {
    public static String classify(MusicTrack track) {
        if (track.energy > 0.7 && track.valence > 0.6) {
            return "🔥 Energetic";
        } else if (track.tempo < 80 && track.valence < 0.4) {
            return "😢 Sad";
        } else if (track.danceability > 0.8) {
            return "💃 Party";
        } else {
            return "🙂 Calm";
        }
    }
}
