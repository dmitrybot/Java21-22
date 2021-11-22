package factories;

import documents.IDocument;
import documents.TextDocument;

public class CreateTextDocument implements ICreateDocument{
    private TextDocument text;
    @Override
    public IDocument CreateNew() {
        text = new TextDocument();
        return text;
    }

    @Override
    public IDocument CreateOpen() {
        return text;
    }
}