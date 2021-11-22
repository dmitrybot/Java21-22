package factories;

import documents.IDocument;

public interface ICreateDocument {
    IDocument CreateNew();
    IDocument CreateOpen();
}