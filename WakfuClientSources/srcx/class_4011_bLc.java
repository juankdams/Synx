public class bLc extends IllegalArgumentException
{
  private static final String bdh = "@(#) $RCSfile: IllegalAddException.java,v $ $Revision: 1.25 $ $Date: 2004/02/06 09:28:30 $ $Name: jdom_1_0 $";

  public bLc(String paramString)
  {
    super(paramString);
  }

  bLc(cft paramcft, String paramString)
  {
    super(
      "The comment \"" + 
      paramcft.getText() + 
      "\" could not be added to the top level of the document: " + 
      paramString);
  }

  bLc(tk paramtk, String paramString)
  {
    super(
      "The DOCTYPE " + 
      paramtk.toString() + 
      " could not be added to the document: " + 
      paramString);
  }

  bLc(dRW paramdRW, String paramString)
  {
    super(
      "The element \"" + 
      paramdRW.getQualifiedName() + 
      "\" could not be added as the root of the document: " + 
      paramString);
  }

  bLc(dRW paramdRW, dbr paramdbr, String paramString)
  {
    super(
      "The attribute \"" + 
      paramdbr.getQualifiedName() + 
      "\" could not be added to the element \"" + 
      paramdRW.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(dRW paramdRW, cbG paramcbG, String paramString)
  {
    super(
      "The CDATA \"" + 
      paramcbG.getText() + 
      "\" could not be added as content to \"" + 
      paramdRW.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(dRW paramdRW, cft paramcft, String paramString)
  {
    super(
      "The comment \"" + 
      paramcft.getText() + 
      "\" could not be added as content to \"" + 
      paramdRW.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(dRW paramdRW1, dRW paramdRW2, String paramString)
  {
    super(
      "The element \"" + 
      paramdRW2.getQualifiedName() + 
      "\" could not be added as a child of \"" + 
      paramdRW1.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(dRW paramdRW, dHQ paramdHQ, String paramString)
  {
    super(
      "The entity reference\"" + 
      paramdHQ.getName() + 
      "\" could not be added as content to \"" + 
      paramdRW.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(dRW paramdRW, bkj parambkj, String paramString)
  {
    super(
      "The namespace xmlns" + (
      (parambkj.getPrefix() == null) || 
      (parambkj.getPrefix().equals("")) ? "=" : 
      new StringBuffer(":").append(parambkj.getPrefix()).append("=").toString()) + 
      "\"" + 
      parambkj.getURI() + 
      "\" could not be added as a namespace to \"" + 
      paramdRW.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(dRW paramdRW, Re paramRe, String paramString)
  {
    super(
      "The PI \"" + 
      paramRe.getTarget() + 
      "\" could not be added as content to \"" + 
      paramdRW.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(dRW paramdRW, cDP paramcDP, String paramString)
  {
    super(
      "The Text \"" + 
      paramcDP.getText() + 
      "\" could not be added as content to \"" + 
      paramdRW.getQualifiedName() + 
      "\": " + 
      paramString);
  }

  bLc(Re paramRe, String paramString)
  {
    super(
      "The PI \"" + 
      paramRe.getTarget() + 
      "\" could not be added to the top level of the document: " + 
      paramString);
  }
}