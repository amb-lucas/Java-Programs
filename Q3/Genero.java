public enum Genero {
  CIS {
    public String toString() {
      return "cisgênero";
    }
  },
  TRANS {
    public String toString() {
        return "transgênero";
    }
  },
  FLUID {
    public String toString() {
      return "gênero fluido";
    }
  },
  NONBIN {
    public String toString() {
      return "não-binário";
    }
  }
}
