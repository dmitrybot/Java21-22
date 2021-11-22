

import documents.IDocument;
import factories.CreateImageDocument;
import factories.CreateMusicDocument;
import factories.CreateTextDocument;
import factories.ICreateDocument;

import java.util.Scanner;

public class Frame {
    private IDocument document;
    private ICreateDocument createDocument;
    public void newDocument(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите какой документ желаете создать Text, Image, Music: ");
        String nameDocument = in.nextLine();
        if (nameDocument.equals("Text")){
            createDocument = new CreateTextDocument();
            document = createDocument.CreateNew();
            document.newDocument();
        }
        if (nameDocument.equals("Image")){
            createDocument = new CreateImageDocument();
            document = createDocument.CreateNew();
            document.newDocument();
        }
        if (nameDocument.equals("Music")){
            createDocument = new CreateMusicDocument();
            document = createDocument.CreateNew();
            document.newDocument();
        }
    }
    public void save(){
        document.save();
    }
    public void open(){
        document.open();
    }
    public void exit(){
        document.exit();
    }
}