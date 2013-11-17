class cgn
  implements dVV
{
  private boolean first = true;

  cgn(cTD paramcTD, StringBuilder paramStringBuilder) {  } 
  public boolean h(int paramInt, float paramFloat) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramInt);
    this.aBU.append("=");
    this.aBU.append(paramFloat);
    return true;
  }
}