package factories;

import documents.IDocument;
import documents.MusicDocument;

public class CreateMusicDocument implements ICreateDocument{
    private MusicDocument music;
    @Override
    public IDocument CreateNew() {
        music =  new MusicDocument();
        return music;
    }

    @Override
    public IDocument CreateOpen() {
        return music;
    }
}