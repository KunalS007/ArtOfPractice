import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class PDFExtractor 
{
	@Test
    public void extractEmailsTest() throws IOException 
	{
    String pdfPath = "C:\\Users\\Kunal S\\Downloads\\6+ Years - 05-May.pdf";

    Set<String> emails = new LinkedHashSet<String>();

    // Load PDF
    PDDocument document = PDDocument.load(new File(pdfPath));

    // Extract text
    PDFTextStripper stripper = new PDFTextStripper();
    String text = stripper.getText(document);

    document.close();

    // ✅ Generic email regex (no domain restriction)
    String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
        emails.add(matcher.group());
    }

    // Print emails
    if (emails.isEmpty()) {
        System.out.println("No email IDs found");
    } else {
        System.out.println("Emails found:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
}


