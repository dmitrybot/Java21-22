package factories;

import documents.IDocument;
import documents.ImageDocument;

public class CreateImageDocument implements ICreateDocument{
    private ImageDocument image;
    @Override
    public IDocument CreateNew() {
        image = new ImageDocument();
        return image;
    }

    @Override
    public IDocument CreateOpen() {
        return image;
    }
}