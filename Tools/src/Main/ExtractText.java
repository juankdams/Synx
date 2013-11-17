package Main;

import java.io.*;
import java.util.*;
import com.anotherbigidea.flash.interfaces.*;
import com.anotherbigidea.flash.writers.*;
import com.anotherbigidea.flash.readers.*;
import com.anotherbigidea.flash.structs.*;

public class ExtractText extends SWFTagTypesImpl {
	protected HashMap fontCodes = new HashMap();

	public ExtractText() {
		super(null);
	}

	public void tagDefineFontInfo(int fontId, String fontName, int flags,
			int[] codes) throws IOException {
		fontCodes.put(new Integer(fontId), codes);
	}

	public SWFVectors tagDefineFont2(int id, int flags, String name,
			int numGlyphs, int ascent, int descent, int leading, int[] codes,
			int[] advances, Rect[] bounds, int[] kernCodes1, int[] kernCodes2,
			int[] kernAdjustments) throws IOException {
		fontCodes.put(new Integer(id), (codes != null) ? codes : new int[0]);
		return null;
	}

	public void tagDefineTextField(int fieldId, String fieldName,
			String initialText, Rect boundary, int flags, AlphaColor textColor,
			int alignment, int fontId, int fontSize, int charLimit,
			int leftMargin, int rightMargin, int indentation, int lineSpacing)
			throws IOException {
		if (initialText != null) {
			System.out.println(initialText);
		}
	}

	public SWFText tagDefineText(int id, Rect bounds, Matrix matrix)
			throws IOException {
		return new TextDumper();
	}

	public SWFText tagDefineText2(int id, Rect bounds, Matrix matrix)
			throws IOException {
		return new TextDumper();
	}

	public class TextDumper implements SWFText {
		protected Integer fontId;
		protected boolean firstY = true;

		public void font(int fontId, int textHeight) {
			this.fontId = new Integer(fontId);
		}

		public void setY(int y) {
			if (firstY)
				firstY = false;
			else
				System.out.println();
		}

		public void text(int[] glyphIndices, int[] glyphAdvances) {
			int[] codes = (int[]) fontCodes.get(fontId);
			if (codes == null) {
				System.out
						.println("\n**** COULD NOT FIND FONT INFO FOR TEXT ****\n");
				return;
			}
			char[] chars = new char[glyphIndices.length];
			for (int i = 0; i < chars.length; i++) {
				int index = glyphIndices[i];
				if (index >= codes.length) // System Font ?
				{
					chars[i] = (char) index;
				} else {
					chars[i] = (char) (codes[index]);
				}
			}
			System.out.print(chars);
		}

		public void color(Color color) {
		}

		public void setX(int x) {
		}

		public void done() {
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		String fileName = "4_0706131721X.swf";
		FileInputStream in = new FileInputStream(fileName);
		ExtractText extractor = new ExtractText();
		TagParser parser = new TagParser(extractor);
		SWFReader reader = new SWFReader(parser, in);
		reader.readFile();
		reader.
		in.close();
	}
}
