package CreatePDF;

import NeuesProjekt_1_1.NeuesProjekt_1_1Controller;
import com.sun.glass.ui.Application;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType1CFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;
import java.sql.SQLOutput;



public class CreatePDF {



    public static void main(String[] args) throws IOException {



        // Create a document and add a page to it
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage( page );

// Create a new font object selecting one of the PDF base fonts
        PDFont font = PDType1Font.HELVETICA_BOLD;
        PDFont text = PDType1Font.HELVETICA;

// Start a new content stream which will "hold" the to be created content
        PDPageContentStream contentStream = new PDPageContentStream(document, page);


// Define a text content stream using the selected font, moving the cursor and drawing the text "Hello World"

//-----------------------------------------Überschrift-Anfang

        contentStream.beginText();
        contentStream.setFont( font, 16 );
        contentStream.moveTextPositionByAmount( 50, 750 );
        contentStream.drawString( "Brandschutznachweis nach DIN 18230" );
        contentStream.endText();

//-----------------------------------------Überschrift-Ende

//-----------------------------------------Imnformationen-Anfang

        contentStream.beginText();
        contentStream.setFont( text, 8 );
        contentStream.moveTextPositionByAmount( 50, 740 );
        contentStream.drawString( "Masterarbeit, Lukas Schumacher" );
        contentStream.endText();

//-----------------------------------------Informationen-Ende

//------------------------------------------------------Anfang Projekt-Informationen
        contentStream.beginText();
        contentStream.setFont( font, 14 );
        contentStream.moveTextPositionByAmount( 50, 700 );
        contentStream.drawString( "Projektbezeichnung: ");
        contentStream.endText();

        // Name, Firma, Straße, PLZ/Ort, Tel.:, E-Mail:
        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 680 );
        contentStream.drawString( "Projektnummer:");
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 660 );
        contentStream.drawString( "Datum:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 640 );
        contentStream.drawString( "Projektbeschreibung:" );
        contentStream.endText();


//------------------------------------------------------Ende Projekt-Informationen

//------------------------------------------------------Anfang Bauherr-Informationen
        contentStream.beginText();
        contentStream.setFont( font, 14 );
        contentStream.moveTextPositionByAmount( 50, 600 );
        contentStream.drawString( "Bauherr" );
        contentStream.endText();

        // Name, Firma, Straße, PLZ/Ort, Tel.:, E-Mail:
        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 580 );
        contentStream.drawString( "Name:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 560 );
        contentStream.drawString( "Firma:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 540 );
        contentStream.drawString( "Straße:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 520 );
        contentStream.drawString( "PLZ/Ort:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 500 );
        contentStream.drawString( "Tel.:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 50, 480 );
        contentStream.drawString( "E-Mail:" );
        contentStream.endText();
//------------------------------------------------------Ende Bauherr-Informationen

//------------------------------------------------------Anfang Brandschutz-Informationen
        contentStream.beginText();
        contentStream.setFont( font, 14 );
        contentStream.moveTextPositionByAmount( 330, 600 );
        contentStream.drawString( "Brandschutz" );
        contentStream.endText();

        // Name, Firma, Straße, PLZ/Ort, Tel.:, E-Mail:
        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 330, 580 );
        contentStream.drawString( "Name:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 330, 560 );
        contentStream.drawString( "Firma:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 330, 540 );
        contentStream.drawString( "Straße:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 330, 520 );
        contentStream.drawString( "PLZ/Ort:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 330, 500 );
        contentStream.drawString( "Tel.:" );
        contentStream.endText();

        contentStream.beginText();
        contentStream.setFont( text, 12 );
        contentStream.moveTextPositionByAmount( 330, 480 );
        contentStream.drawString( "E-Mail:" );
        contentStream.endText();

//------------------------------------------------------Ende Brandschutz-Informationen

//------------------------------------------------------Anfang Brandschutztechnische Infrastruktur

        contentStream.beginText();
        contentStream.setFont( font, 14 );
        contentStream.moveTextPositionByAmount( 50, 430 );
        contentStream.drawString( "Brandschutztechnische Infrastruktur" );
        contentStream.endText();

//------------------------------------------------------Ende Brandschutztechnische Infrastruktur

//------------------------------------------------------Anfang Öffnungen

        contentStream.beginText();
        contentStream.setFont( font, 14 );
        contentStream.moveTextPositionByAmount( 50, 390 );
        contentStream.drawString( "Öffnungen" );
        contentStream.endText();

//------------------------------------------------------Ende Öffnungen



//------------------------------------------------------Ende Text
        contentStream.close();



// Save the results and ensure that the document is properly closed:
        document.save( "Hello World_test.pdf");
        document.close();

    }

}
