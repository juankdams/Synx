public class cEM extends bHx
{
  public cEM(ig paramig)
  {
    super(paramig);
  }

  public void buL() {
    throw new UnsupportedOperationException("Pas de vidéo sur un élément de texte");
  }

  public dRq a(dRq paramdRq, bFT parambFT) {
    dRq localdRq = super.a(paramdRq, parambFT);

    drA localdrA = (drA)this.gFZ;
    cWk localcWk = new cWk();
    localcWk.aJ();
    localcWk.setEnableAWTFont(true);
    localcWk.setElementMap(paramdRq.getElementMap());
    localcWk.setText(cRt.ow(localdrA.getText()).toString());
    localcWk.setExpandable(false);
    localcWk.rV();

    cwP localcwP = new cwP();
    localcwP.aJ();
    localcwP.setSize(new Or(100.0F, 100.0F));
    localcwP.setAlign(ajb.dhZ);
    localcWk.setLayoutData(localcwP);

    localdRq.a(localcWk);
    localdRq.rV();

    if (localdrA.cYo()) {
      parambFT.a(localdrA.cYp(), localdRq, paramdRq);
    }

    return localdRq;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString) {
    return null;
  }
}