class cHD
  implements bPA
{
  private boolean first = true;

  cHD(cSR paramcSR, StringBuilder paramStringBuilder) {  } 
  public boolean c(int paramInt, Object paramObject) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramInt);
    this.aBU.append("=");
    this.aBU.append(paramObject);
    return true;
  }
}