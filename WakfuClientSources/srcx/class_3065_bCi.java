class bCi
  implements dRH
{
  private boolean first = true;

  bCi(dtw paramdtw, StringBuilder paramStringBuilder) {  } 
  public boolean d(short paramShort, byte paramByte) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramShort);
    this.aBU.append("=");
    this.aBU.append(paramByte);
    return true;
  }
}